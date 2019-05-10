package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.SysRelationRoleResourceDAO;
import com.hw.bean.PO.SysRelationRoleResourcePO;
import com.hw.bean.VO.SysRelationRoleResourceVO;
import com.hw.bean.BO.QuerySysRelationRoleResourcePage;
import com.hw.bean.BO.QuerySysRelationRoleResourceByPrimaryKey;
import com.hw.services.SysRelationRoleResourceService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:44
* @description: 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class SysRelationRoleResourceServiceImpl implements SysRelationRoleResourceService{

    @Autowired
    private SysRelationRoleResourceDAO sysRelationRoleResourceDAO;

    @Override
    public BaseResultDTO addSysRelationRoleResource(SysRelationRoleResourcePO sysRelationRoleResourcePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = sysRelationRoleResourceDAO.insertSysRelationRoleResource(sysRelationRoleResourcePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysRelationRoleResourceServiceImpl called addSysRelationRoleResource error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifySysRelationRoleResource(SysRelationRoleResourcePO sysRelationRoleResourcePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = sysRelationRoleResourceDAO.updateSysRelationRoleResource(sysRelationRoleResourcePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysRelationRoleResourceServiceImpl called modifySysRelationRoleResource error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<SysRelationRoleResourceVO> getSysRelationRoleResourceList(QuerySysRelationRoleResourcePage querySysRelationRoleResourcePage){
        BatchResultDTO<SysRelationRoleResourceVO> resultDTO = new BatchResultDTO<SysRelationRoleResourceVO>();
        try{
            Integer record = sysRelationRoleResourceDAO.getPageCount(querySysRelationRoleResourcePage);
            querySysRelationRoleResourcePage.setRecord(record);
            resultDTO.setRecord(record);
            if (querySysRelationRoleResourcePage.getPageNo() > querySysRelationRoleResourcePage.getTotalPages()){
                resultDTO.setErrorDetail("获取角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<SysRelationRoleResourceVO> module = sysRelationRoleResourceDAO.getPageList(querySysRelationRoleResourcePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#SysRelationRoleResourceServiceImpl called getSysRelationRoleResourceList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<SysRelationRoleResourceVO> getsysRelationRoleResource(QuerySysRelationRoleResourceByPrimaryKey querySysRelationRoleResourceByPrimaryKey){
        ResultDTO<SysRelationRoleResourceVO> resultDTO = new ResultDTO<SysRelationRoleResourceVO>();
        try{
            SysRelationRoleResourceVO sysRelationRoleResourceVO = sysRelationRoleResourceDAO.getSysRelationRoleResourceByPrimaryKey(querySysRelationRoleResourceByPrimaryKey.getInfoId());
            if(null != sysRelationRoleResourceVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(sysRelationRoleResourceVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）对象失败");
            }
        }catch (Exception e){
            log.error("#SysRelationRoleResourceServiceImpl called getSysRelationRoleResource error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）对象失败");
        }
        return resultDTO;
    }

}
