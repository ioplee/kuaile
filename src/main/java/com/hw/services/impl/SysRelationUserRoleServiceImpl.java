package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.SysRelationUserRoleDAO;
import com.hw.bean.PO.SysRelationUserRolePO;
import com.hw.bean.VO.SysRelationUserRoleVO;
import com.hw.bean.BO.QuerySysRelationUserRolePage;
import com.hw.bean.BO.QuerySysRelationUserRoleByPrimaryKey;
import com.hw.services.SysRelationUserRoleService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:44
* @description: 用户具有角色记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class SysRelationUserRoleServiceImpl implements SysRelationUserRoleService{

    @Autowired
    private SysRelationUserRoleDAO sysRelationUserRoleDAO;

    @Override
    public BaseResultDTO addSysRelationUserRole(SysRelationUserRolePO sysRelationUserRolePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = sysRelationUserRoleDAO.insertSysRelationUserRole(sysRelationUserRolePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加用户具有角色记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysRelationUserRoleServiceImpl called addSysRelationUserRole error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加用户具有角色记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifySysRelationUserRole(SysRelationUserRolePO sysRelationUserRolePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = sysRelationUserRoleDAO.updateSysRelationUserRole(sysRelationUserRolePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改用户具有角色记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysRelationUserRoleServiceImpl called modifySysRelationUserRole error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改用户具有角色记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<SysRelationUserRoleVO> getSysRelationUserRoleList(QuerySysRelationUserRolePage querySysRelationUserRolePage){
        BatchResultDTO<SysRelationUserRoleVO> resultDTO = new BatchResultDTO<SysRelationUserRoleVO>();
        try{
            Integer record = sysRelationUserRoleDAO.getPageCount(querySysRelationUserRolePage);
            querySysRelationUserRolePage.setRecord(record);
            resultDTO.setRecord(record);
            if (querySysRelationUserRolePage.getPageNo() > querySysRelationUserRolePage.getTotalPages()){
                resultDTO.setErrorDetail("获取用户具有角色记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<SysRelationUserRoleVO> module = sysRelationUserRoleDAO.getPageList(querySysRelationUserRolePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#SysRelationUserRoleServiceImpl called getSysRelationUserRoleList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取用户具有角色记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<SysRelationUserRoleVO> getsysRelationUserRole(QuerySysRelationUserRoleByPrimaryKey querySysRelationUserRoleByPrimaryKey){
        ResultDTO<SysRelationUserRoleVO> resultDTO = new ResultDTO<SysRelationUserRoleVO>();
        try{
            SysRelationUserRoleVO sysRelationUserRoleVO = sysRelationUserRoleDAO.getSysRelationUserRoleByPrimaryKey(querySysRelationUserRoleByPrimaryKey.getInfoId());
            if(null != sysRelationUserRoleVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(sysRelationUserRoleVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取用户具有角色记录表对象失败");
            }
        }catch (Exception e){
            log.error("#SysRelationUserRoleServiceImpl called getSysRelationUserRole error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取用户具有角色记录表对象失败");
        }
        return resultDTO;
    }

}
