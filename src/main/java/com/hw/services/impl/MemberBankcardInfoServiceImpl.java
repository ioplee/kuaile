package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberBankcardInfoDAO;
import com.hw.bean.PO.MemberBankcardInfoPO;
import com.hw.bean.VO.MemberBankcardInfoVO;
import com.hw.bean.BO.QueryMemberBankcardInfoPage;
import com.hw.bean.BO.QueryMemberBankcardInfoByPrimaryKey;
import com.hw.services.MemberBankcardInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 会员银行账户明细表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberBankcardInfoServiceImpl implements MemberBankcardInfoService{

    @Autowired
    private MemberBankcardInfoDAO memberBankcardInfoDAO;

    @Override
    public BaseResultDTO addMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberBankcardInfoDAO.insertMemberBankcardInfo(memberBankcardInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员银行账户明细表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberBankcardInfoServiceImpl called addMemberBankcardInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员银行账户明细表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberBankcardInfoDAO.updateMemberBankcardInfo(memberBankcardInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员银行账户明细表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberBankcardInfoServiceImpl called modifyMemberBankcardInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员银行账户明细表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberBankcardInfoVO> getMemberBankcardInfoList(QueryMemberBankcardInfoPage queryMemberBankcardInfoPage){
        BatchResultDTO<MemberBankcardInfoVO> resultDTO = new BatchResultDTO<MemberBankcardInfoVO>();
        try{
            Integer record = memberBankcardInfoDAO.getPageCount(queryMemberBankcardInfoPage);
            queryMemberBankcardInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberBankcardInfoPage.getPageNo() > queryMemberBankcardInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员银行账户明细表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberBankcardInfoVO> module = memberBankcardInfoDAO.getPageList(queryMemberBankcardInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberBankcardInfoServiceImpl called getMemberBankcardInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员银行账户明细表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberBankcardInfoVO> getmemberBankcardInfo(QueryMemberBankcardInfoByPrimaryKey queryMemberBankcardInfoByPrimaryKey){
        ResultDTO<MemberBankcardInfoVO> resultDTO = new ResultDTO<MemberBankcardInfoVO>();
        try{
            MemberBankcardInfoVO memberBankcardInfoVO = memberBankcardInfoDAO.getMemberBankcardInfoByPrimaryKey(queryMemberBankcardInfoByPrimaryKey.getInfoId());
            if(null != memberBankcardInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberBankcardInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员银行账户明细表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberBankcardInfoServiceImpl called getMemberBankcardInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员银行账户明细表对象失败");
        }
        return resultDTO;
    }

}
