package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.SysUserDAO;
import com.hw.bean.PO.SysUserPO;
import com.hw.bean.VO.SysUserVO;
import com.hw.bean.BO.QuerySysUserPage;
import com.hw.bean.BO.QuerySysUserByPrimaryKey;
import com.hw.services.SysUserService;

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

    @Override
    public BaseResultDTO addSysUser(SysUserPO sysUserPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = sysUserDAO.insertSysUser(sysUserPO);
            if(number == 1){
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
