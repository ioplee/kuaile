package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberGoldenbaenDAO;
import com.hw.bean.PO.MemberGoldenbaenPO;
import com.hw.bean.VO.MemberGoldenbaenVO;
import com.hw.bean.BO.QueryMemberGoldenbaenPage;
import com.hw.bean.BO.QueryMemberGoldenbaenByPrimaryKey;
import com.hw.services.MemberGoldenbaenService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 会员金豆账户表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberGoldenbaenServiceImpl implements MemberGoldenbaenService{

    @Autowired
    private MemberGoldenbaenDAO memberGoldenbaenDAO;

    @Override
    public BaseResultDTO addMemberGoldenbaen(MemberGoldenbaenPO memberGoldenbaenPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberGoldenbaenDAO.insertMemberGoldenbaen(memberGoldenbaenPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员金豆账户表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberGoldenbaenServiceImpl called addMemberGoldenbaen error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员金豆账户表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberGoldenbaen(MemberGoldenbaenPO memberGoldenbaenPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberGoldenbaenDAO.updateMemberGoldenbaen(memberGoldenbaenPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员金豆账户表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberGoldenbaenServiceImpl called modifyMemberGoldenbaen error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员金豆账户表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberGoldenbaenVO> getMemberGoldenbaenList(QueryMemberGoldenbaenPage queryMemberGoldenbaenPage){
        BatchResultDTO<MemberGoldenbaenVO> resultDTO = new BatchResultDTO<MemberGoldenbaenVO>();
        try{
            Integer record = memberGoldenbaenDAO.getPageCount(queryMemberGoldenbaenPage);
            queryMemberGoldenbaenPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberGoldenbaenPage.getPageNo() > queryMemberGoldenbaenPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员金豆账户表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberGoldenbaenVO> module = memberGoldenbaenDAO.getPageList(queryMemberGoldenbaenPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberGoldenbaenServiceImpl called getMemberGoldenbaenList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员金豆账户表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberGoldenbaenVO> getmemberGoldenbaen(QueryMemberGoldenbaenByPrimaryKey queryMemberGoldenbaenByPrimaryKey){
        ResultDTO<MemberGoldenbaenVO> resultDTO = new ResultDTO<MemberGoldenbaenVO>();
        try{
            MemberGoldenbaenVO memberGoldenbaenVO = memberGoldenbaenDAO.getMemberGoldenbaenByPrimaryKey(queryMemberGoldenbaenByPrimaryKey.getBeanId());
            if(null != memberGoldenbaenVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberGoldenbaenVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员金豆账户表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberGoldenbaenServiceImpl called getMemberGoldenbaen error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员金豆账户表对象失败");
        }
        return resultDTO;
    }

}
