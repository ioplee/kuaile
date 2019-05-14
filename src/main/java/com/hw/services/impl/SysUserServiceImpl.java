package com.hw.services.impl;

import com.hw.bean.BO.QuerySysUserByPrimaryKey;
import com.hw.bean.BO.QuerySysUserPage;
import com.hw.bean.PO.SysRelationUserRolePO;
import com.hw.bean.PO.SysUserPO;
import com.hw.bean.VO.SysRoleVO;
import com.hw.bean.VO.SysUserVO;
import com.hw.dao.SysRelationUserRoleDAO;
import com.hw.dao.SysUserDAO;
import com.hw.services.SysUserService;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:44
* @description: 系统用户表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserDAO sysUserDAO;

    @Autowired
    private SysRelationUserRoleDAO sysRelationUserRoleDAO;

    @Override
    public BaseResultDTO addSysUser(SysUserPO sysUserPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = sysUserDAO.insertSysUser(sysUserPO);
            if(number == 1){
                //添加用户具有的角色集合
                if (null != sysUserPO.getUserRolePOList() && !sysUserPO.getUserRolePOList().isEmpty()){
                    List<SysRelationUserRolePO> sysRelationUserRolePOList = new ArrayList<SysRelationUserRolePO>();
                    for (SysRelationUserRolePO sysRelationUserRolePO : sysUserPO.getUserRolePOList()){
                        sysRelationUserRolePO.setUserId(sysUserPO.getUserId());//设置用户ID
                        sysRelationUserRolePO.setInfoStatus(1);//设置记录状态为有效
                        sysRelationUserRolePOList.add(sysRelationUserRolePO);
                    }
                    //添加用户具有角色集合
                    sysRelationUserRoleDAO.insertUserRoles(sysRelationUserRolePOList);
                }
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加系统用户表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysUserServiceImpl called addSysUser error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加系统用户表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifySysUser(SysUserPO sysUserPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = sysUserDAO.updateSysUser(sysUserPO);
            if(number == 1){
                //清除用户具有的角色集合
                sysRelationUserRoleDAO.removeRoleByUser(sysUserPO.getUserId());
                //添加用户具有的角色集合
                if (null != sysUserPO.getUserRolePOList() && !sysUserPO.getUserRolePOList().isEmpty()) {
                    List<SysRelationUserRolePO> sysRelationUserRolePOList = new ArrayList<SysRelationUserRolePO>();
                    for (SysRelationUserRolePO sysRelationUserRolePO : sysUserPO.getUserRolePOList()) {
                        sysRelationUserRolePO.setUserId(sysUserPO.getUserId());//设置用户ID
                        sysRelationUserRolePO.setInfoStatus(1);//设置记录状态为有效
                        sysRelationUserRolePOList.add(sysRelationUserRolePO);
                    }
                    //添加用户具有角色集合
                    sysRelationUserRoleDAO.insertUserRoles(sysRelationUserRolePOList);
                }
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改系统用户表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysUserServiceImpl called modifySysUser error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改系统用户表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<SysUserVO> getSysUserList(QuerySysUserPage querySysUserPage){
        BatchResultDTO<SysUserVO> resultDTO = new BatchResultDTO<SysUserVO>();
        try{
            Integer record = sysUserDAO.getPageCount(querySysUserPage);
            querySysUserPage.setRecord(record);
            resultDTO.setRecord(record);
            if (querySysUserPage.getPageNo() > querySysUserPage.getTotalPages()){
                resultDTO.setErrorDetail("获取系统用户表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<SysUserVO> module = sysUserDAO.getPageList(querySysUserPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                //循环用户列表,获取用户具有角色集合
                for (SysUserVO sysUserVO : module){
                    List<SysRoleVO> sysRoleVOs = new ArrayList<SysRoleVO>();
                    sysRoleVOs = sysRelationUserRoleDAO.getRoleListByUser(sysUserVO.getUserId());
                    if( null != sysRoleVOs && !sysRoleVOs.isEmpty()){
                        sysUserVO.setRoleVOList(sysRoleVOs);
                    }else {
                        sysUserVO.setRoleVOList(new ArrayList<>());
                    }
                }
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#SysUserServiceImpl called getSysUserList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统用户表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<SysUserVO> getsysUser(QuerySysUserByPrimaryKey querySysUserByPrimaryKey){
        ResultDTO<SysUserVO> resultDTO = new ResultDTO<SysUserVO>();
        try{
            SysUserVO sysUserVO = sysUserDAO.getSysUserByPrimaryKey(querySysUserByPrimaryKey.getUserId());
            if(null != sysUserVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                //获取用户具有角色集合
                List<SysRoleVO> sysRoleVOs = new ArrayList<SysRoleVO>();
                sysRoleVOs = sysRelationUserRoleDAO.getRoleListByUser(querySysUserByPrimaryKey.getUserId());
                if( null != sysRoleVOs && !sysRoleVOs.isEmpty()){
                    sysUserVO.setRoleVOList(sysRoleVOs);
                }else {
                    sysUserVO.setRoleVOList(new ArrayList<>());
                }
                resultDTO.setModule(sysUserVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取系统用户表对象失败");
            }
        }catch (Exception e){
            log.error("#SysUserServiceImpl called getSysUser error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统用户表对象失败");
        }
        return resultDTO;
    }

}
