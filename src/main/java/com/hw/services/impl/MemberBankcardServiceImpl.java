package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberBankcardDAO;
import com.hw.bean.PO.MemberBankcardPO;
import com.hw.bean.VO.MemberBankcardVO;
import com.hw.bean.BO.QueryMemberBankcardPage;
import com.hw.bean.BO.QueryMemberBankcardByPrimaryKey;
import com.hw.services.MemberBankcardService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 会员银行账户表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberBankcardServiceImpl implements MemberBankcardService{

    @Autowired
    private MemberBankcardDAO memberBankcardDAO;

    @Override
    public BaseResultDTO addMemberBankcard(MemberBankcardPO memberBankcardPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberBankcardDAO.insertMemberBankcard(memberBankcardPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员银行账户表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberBankcardServiceImpl called addMemberBankcard error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员银行账户表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberBankcard(MemberBankcardPO memberBankcardPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberBankcardDAO.updateMemberBankcard(memberBankcardPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员银行账户表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberBankcardServiceImpl called modifyMemberBankcard error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员银行账户表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberBankcardVO> getMemberBankcardList(QueryMemberBankcardPage queryMemberBankcardPage){
        BatchResultDTO<MemberBankcardVO> resultDTO = new BatchResultDTO<MemberBankcardVO>();
        try{
            Integer record = memberBankcardDAO.getPageCount(queryMemberBankcardPage);
            queryMemberBankcardPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberBankcardPage.getPageNo() > queryMemberBankcardPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员银行账户表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberBankcardVO> module = memberBankcardDAO.getPageList(queryMemberBankcardPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberBankcardServiceImpl called getMemberBankcardList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员银行账户表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberBankcardVO> getmemberBankcard(QueryMemberBankcardByPrimaryKey queryMemberBankcardByPrimaryKey){
        ResultDTO<MemberBankcardVO> resultDTO = new ResultDTO<MemberBankcardVO>();
        try{
            MemberBankcardVO memberBankcardVO = memberBankcardDAO.getMemberBankcardByPrimaryKey(queryMemberBankcardByPrimaryKey.getCardId());
            if(null != memberBankcardVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberBankcardVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员银行账户表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberBankcardServiceImpl called getMemberBankcard error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员银行账户表对象失败");
        }
        return resultDTO;
    }

}
