package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.SysLogDAO;
import com.hw.bean.PO.SysLogPO;
import com.hw.bean.VO.SysLogVO;
import com.hw.bean.BO.QuerySysLogPage;
import com.hw.bean.BO.QuerySysLogByPrimaryKey;
import com.hw.services.SysLogService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:44
* @description: 系统日志 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class SysLogServiceImpl implements SysLogService{

    @Autowired
    private SysLogDAO sysLogDAO;

    @Override
    public BaseResultDTO addSysLog(SysLogPO sysLogPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = sysLogDAO.insertSysLog(sysLogPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加系统日志信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysLogServiceImpl called addSysLog error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加系统日志出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifySysLog(SysLogPO sysLogPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = sysLogDAO.updateSysLog(sysLogPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改系统日志信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysLogServiceImpl called modifySysLog error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改系统日志出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<SysLogVO> getSysLogList(QuerySysLogPage querySysLogPage){
        BatchResultDTO<SysLogVO> resultDTO = new BatchResultDTO<SysLogVO>();
        try{
            Integer record = sysLogDAO.getPageCount(querySysLogPage);
            querySysLogPage.setRecord(record);
            resultDTO.setRecord(record);
            if (querySysLogPage.getPageNo() > querySysLogPage.getTotalPages()){
                resultDTO.setErrorDetail("获取系统日志列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<SysLogVO> module = sysLogDAO.getPageList(querySysLogPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#SysLogServiceImpl called getSysLogList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统日志列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<SysLogVO> getsysLog(QuerySysLogByPrimaryKey querySysLogByPrimaryKey){
        ResultDTO<SysLogVO> resultDTO = new ResultDTO<SysLogVO>();
        try{
            SysLogVO sysLogVO = sysLogDAO.getSysLogByPrimaryKey(querySysLogByPrimaryKey.getLogId());
            if(null != sysLogVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(sysLogVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取系统日志对象失败");
            }
        }catch (Exception e){
            log.error("#SysLogServiceImpl called getSysLog error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统日志对象失败");
        }
        return resultDTO;
    }

}
