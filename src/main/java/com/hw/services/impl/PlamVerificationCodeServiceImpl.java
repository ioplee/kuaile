package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.PlamVerificationCodeDAO;
import com.hw.bean.PO.PlamVerificationCodePO;
import com.hw.bean.VO.PlamVerificationCodeVO;
import com.hw.bean.BO.QueryPlamVerificationCodePage;
import com.hw.bean.BO.QueryPlamVerificationCodeByPrimaryKey;
import com.hw.services.PlamVerificationCodeService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:51
* @description: 验证码记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class PlamVerificationCodeServiceImpl implements PlamVerificationCodeService{

    @Autowired
    private PlamVerificationCodeDAO plamVerificationCodeDAO;

    @Override
    public BaseResultDTO addPlamVerificationCode(PlamVerificationCodePO plamVerificationCodePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = plamVerificationCodeDAO.insertPlamVerificationCode(plamVerificationCodePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加验证码记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#PlamVerificationCodeServiceImpl called addPlamVerificationCode error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加验证码记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyPlamVerificationCode(PlamVerificationCodePO plamVerificationCodePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = plamVerificationCodeDAO.updatePlamVerificationCode(plamVerificationCodePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改验证码记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#PlamVerificationCodeServiceImpl called modifyPlamVerificationCode error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改验证码记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<PlamVerificationCodeVO> getPlamVerificationCodeList(QueryPlamVerificationCodePage queryPlamVerificationCodePage){
        BatchResultDTO<PlamVerificationCodeVO> resultDTO = new BatchResultDTO<PlamVerificationCodeVO>();
        try{
            Integer record = plamVerificationCodeDAO.getPageCount(queryPlamVerificationCodePage);
            queryPlamVerificationCodePage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryPlamVerificationCodePage.getPageNo() > queryPlamVerificationCodePage.getTotalPages()){
                resultDTO.setErrorDetail("获取验证码记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<PlamVerificationCodeVO> module = plamVerificationCodeDAO.getPageList(queryPlamVerificationCodePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#PlamVerificationCodeServiceImpl called getPlamVerificationCodeList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取验证码记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<PlamVerificationCodeVO> getplamVerificationCode(QueryPlamVerificationCodeByPrimaryKey queryPlamVerificationCodeByPrimaryKey){
        ResultDTO<PlamVerificationCodeVO> resultDTO = new ResultDTO<PlamVerificationCodeVO>();
        try{
            PlamVerificationCodeVO plamVerificationCodeVO = plamVerificationCodeDAO.getPlamVerificationCodeByPrimaryKey(queryPlamVerificationCodeByPrimaryKey.getCodeId());
            if(null != plamVerificationCodeVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(plamVerificationCodeVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取验证码记录表对象失败");
            }
        }catch (Exception e){
            log.error("#PlamVerificationCodeServiceImpl called getPlamVerificationCode error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取验证码记录表对象失败");
        }
        return resultDTO;
    }

}
