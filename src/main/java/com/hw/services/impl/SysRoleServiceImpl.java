package com.hw.services.impl;

import com.hw.bean.PO.SysRelationRoleResourcePO;
import com.hw.bean.VO.SysMenuVO;
import com.hw.dao.SysRelationRoleResourceDAO;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.SysRoleDAO;
import com.hw.bean.PO.SysRolePO;
import com.hw.bean.VO.SysRoleVO;
import com.hw.bean.BO.QuerySysRolePage;
import com.hw.bean.BO.QuerySysRoleByPrimaryKey;
import com.hw.services.SysRoleService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:44
* @description: 系统角色表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class SysRoleServiceImpl implements SysRoleService{

    @Autowired
    private SysRoleDAO sysRoleDAO;

    @Autowired
    private SysRelationRoleResourceDAO sysRelationRoleResourceDAO;

    @Override
    public BaseResultDTO addSysRole(SysRolePO sysRolePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = sysRoleDAO.insertSysRole(sysRolePO);
            if(number == 1){
                //添加角色具有的菜单权限集合
                if(null != sysRolePO && null != sysRolePO.getResourcePOList()){
                    List<SysRelationRoleResourcePO> resourcePOList = sysRolePO.getResourcePOList();
                    for (SysRelationRoleResourcePO sysRelationRoleResourcePO : resourcePOList){
                        sysRelationRoleResourcePO.setInfoStatus(1);
                        sysRelationRoleResourcePO.setRoleId(sysRolePO.getRoleId());
                        sysRelationRoleResourcePO.setResourceType(1);//本期只做到菜单权限管理
                    }
                    sysRelationRoleResourceDAO.addResources(resourcePOList);
                }
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加系统角色表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysRoleServiceImpl called addSysRole error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加系统角色表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifySysRole(SysRolePO sysRolePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = sysRoleDAO.updateSysRole(sysRolePO);
            if(number == 1){
                //删除角色具有的菜单集合
                sysRelationRoleResourceDAO.removeResource(sysRolePO.getRoleId());
                //添加角色新的菜单集合
                if(null != sysRolePO && null != sysRolePO.getResourcePOList()){
                    List<SysRelationRoleResourcePO> resourcePOList = sysRolePO.getResourcePOList();
                    for (SysRelationRoleResourcePO sysRelationRoleResourcePO : resourcePOList){
                        sysRelationRoleResourcePO.setInfoStatus(1);
                        sysRelationRoleResourcePO.setRoleId(sysRolePO.getRoleId());
                        sysRelationRoleResourcePO.setResourceType(1);//本期只做到菜单权限管理
                    }
                    sysRelationRoleResourceDAO.addResources(resourcePOList);
                }
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改系统角色表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysRoleServiceImpl called modifySysRole error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改系统角色表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<SysRoleVO> getSysRoleList(QuerySysRolePage querySysRolePage){
        BatchResultDTO<SysRoleVO> resultDTO = new BatchResultDTO<SysRoleVO>();
        try{
            Integer record = sysRoleDAO.getPageCount(querySysRolePage);
            querySysRolePage.setRecord(record);
            resultDTO.setRecord(record);
            if (querySysRolePage.getPageNo() > querySysRolePage.getTotalPages()){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<SysRoleVO> module = sysRoleDAO.getPageList(querySysRolePage);
            //如果集合不为空,则对每一个角色对象查询并封装其具有的菜单集合
            if (null != module && !module.isEmpty()){
                for (SysRoleVO sysRoleVO : module){
                    List<SysMenuVO> sysMenuVOList = sysRelationRoleResourceDAO.getResourceListByRoleID(sysRoleVO.getRoleId());
                    if (null != sysMenuVOList && !sysMenuVOList.isEmpty()){
                        sysRoleVO.setMenuVOList(sysMenuVOList);
                    }else {
                        sysRoleVO.setMenuVOList(new ArrayList<>());
                    }
                }
            }
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#SysRoleServiceImpl called getSysRoleList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统角色表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<SysRoleVO> getsysRole(QuerySysRoleByPrimaryKey querySysRoleByPrimaryKey){
        ResultDTO<SysRoleVO> resultDTO = new ResultDTO<SysRoleVO>();
        try{
            SysRoleVO sysRoleVO = sysRoleDAO.getSysRoleByPrimaryKey(querySysRoleByPrimaryKey.getRoleId());
            if(null != sysRoleVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                //查询并封装角色具有的菜单集合
                List<SysMenuVO> sysMenuVOList = sysRelationRoleResourceDAO.getResourceListByRoleID(sysRoleVO.getRoleId());
                if (null != sysMenuVOList && !sysMenuVOList.isEmpty()){
                    sysRoleVO.setMenuVOList(sysMenuVOList);
                }else {
                    sysRoleVO.setMenuVOList(new ArrayList<>());
                }
                resultDTO.setModule(sysRoleVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取系统角色表对象失败");
            }
        }catch (Exception e){
            log.error("#SysRoleServiceImpl called getSysRole error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统角色表对象失败");
        }
        return resultDTO;
    }

}
