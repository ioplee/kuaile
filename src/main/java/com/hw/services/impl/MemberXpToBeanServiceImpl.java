package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberXpToBeanDAO;
import com.hw.bean.PO.MemberXpToBeanPO;
import com.hw.bean.VO.MemberXpToBeanVO;
import com.hw.bean.BO.QueryMemberXpToBeanPage;
import com.hw.bean.BO.QueryMemberXpToBeanByPrimaryKey;
import com.hw.services.MemberXpToBeanService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:45
* @description: 会员经验兑换金豆记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberXpToBeanServiceImpl implements MemberXpToBeanService{

    @Autowired
    private MemberXpToBeanDAO memberXpToBeanDAO;

    @Override
    public BaseResultDTO addMemberXpToBean(MemberXpToBeanPO memberXpToBeanPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberXpToBeanDAO.insertMemberXpToBean(memberXpToBeanPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员经验兑换金豆记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberXpToBeanServiceImpl called addMemberXpToBean error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员经验兑换金豆记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberXpToBean(MemberXpToBeanPO memberXpToBeanPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberXpToBeanDAO.updateMemberXpToBean(memberXpToBeanPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员经验兑换金豆记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberXpToBeanServiceImpl called modifyMemberXpToBean error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员经验兑换金豆记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberXpToBeanVO> getMemberXpToBeanList(QueryMemberXpToBeanPage queryMemberXpToBeanPage){
        BatchResultDTO<MemberXpToBeanVO> resultDTO = new BatchResultDTO<MemberXpToBeanVO>();
        try{
            Integer record = memberXpToBeanDAO.getPageCount(queryMemberXpToBeanPage);
            queryMemberXpToBeanPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberXpToBeanPage.getPageNo() > queryMemberXpToBeanPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员经验兑换金豆记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberXpToBeanVO> module = memberXpToBeanDAO.getPageList(queryMemberXpToBeanPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberXpToBeanServiceImpl called getMemberXpToBeanList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员经验兑换金豆记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberXpToBeanVO> getmemberXpToBean(QueryMemberXpToBeanByPrimaryKey queryMemberXpToBeanByPrimaryKey){
        ResultDTO<MemberXpToBeanVO> resultDTO = new ResultDTO<MemberXpToBeanVO>();
        try{
            MemberXpToBeanVO memberXpToBeanVO = memberXpToBeanDAO.getMemberXpToBeanByPrimaryKey(queryMemberXpToBeanByPrimaryKey.getExchangeId());
            if(null != memberXpToBeanVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberXpToBeanVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员经验兑换金豆记录表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberXpToBeanServiceImpl called getMemberXpToBean error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员经验兑换金豆记录表对象失败");
        }
        return resultDTO;
    }

}
