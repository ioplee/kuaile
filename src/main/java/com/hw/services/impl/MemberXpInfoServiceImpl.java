package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberXpInfoDAO;
import com.hw.bean.PO.MemberXpInfoPO;
import com.hw.bean.VO.MemberXpInfoVO;
import com.hw.bean.BO.QueryMemberXpInfoPage;
import com.hw.bean.BO.QueryMemberXpInfoByPrimaryKey;
import com.hw.services.MemberXpInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:45
* @description: 会员经验值明细表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberXpInfoServiceImpl implements MemberXpInfoService{

    @Autowired
    private MemberXpInfoDAO memberXpInfoDAO;

    @Override
    public BaseResultDTO addMemberXpInfo(MemberXpInfoPO memberXpInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberXpInfoDAO.insertMemberXpInfo(memberXpInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员经验值明细表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberXpInfoServiceImpl called addMemberXpInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员经验值明细表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberXpInfo(MemberXpInfoPO memberXpInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberXpInfoDAO.updateMemberXpInfo(memberXpInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员经验值明细表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberXpInfoServiceImpl called modifyMemberXpInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员经验值明细表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberXpInfoVO> getMemberXpInfoList(QueryMemberXpInfoPage queryMemberXpInfoPage){
        BatchResultDTO<MemberXpInfoVO> resultDTO = new BatchResultDTO<MemberXpInfoVO>();
        try{
            Integer record = memberXpInfoDAO.getPageCount(queryMemberXpInfoPage);
            queryMemberXpInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberXpInfoPage.getPageNo() > queryMemberXpInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员经验值明细表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberXpInfoVO> module = memberXpInfoDAO.getPageList(queryMemberXpInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberXpInfoServiceImpl called getMemberXpInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员经验值明细表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberXpInfoVO> getmemberXpInfo(QueryMemberXpInfoByPrimaryKey queryMemberXpInfoByPrimaryKey){
        ResultDTO<MemberXpInfoVO> resultDTO = new ResultDTO<MemberXpInfoVO>();
        try{
            MemberXpInfoVO memberXpInfoVO = memberXpInfoDAO.getMemberXpInfoByPrimaryKey(queryMemberXpInfoByPrimaryKey.getInfoId());
            if(null != memberXpInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberXpInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员经验值明细表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberXpInfoServiceImpl called getMemberXpInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员经验值明细表对象失败");
        }
        return resultDTO;
    }

}
