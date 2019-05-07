package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberAccountChangeDAO;
import com.hw.bean.PO.MemberAccountChangePO;
import com.hw.bean.VO.MemberAccountChangeVO;
import com.hw.bean.BO.QueryMemberAccountChangePage;
import com.hw.bean.BO.QueryMemberAccountChangeByPrimaryKey;
import com.hw.services.MemberAccountChangeService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 会员金豆和银行账户转账记录 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberAccountChangeServiceImpl implements MemberAccountChangeService{

    @Autowired
    private MemberAccountChangeDAO memberAccountChangeDAO;

    @Override
    public BaseResultDTO addMemberAccountChange(MemberAccountChangePO memberAccountChangePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberAccountChangeDAO.insertMemberAccountChange(memberAccountChangePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员金豆和银行账户转账记录信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberAccountChangeServiceImpl called addMemberAccountChange error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员金豆和银行账户转账记录出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberAccountChange(MemberAccountChangePO memberAccountChangePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberAccountChangeDAO.updateMemberAccountChange(memberAccountChangePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员金豆和银行账户转账记录信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberAccountChangeServiceImpl called modifyMemberAccountChange error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员金豆和银行账户转账记录出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberAccountChangeVO> getMemberAccountChangeList(QueryMemberAccountChangePage queryMemberAccountChangePage){
        BatchResultDTO<MemberAccountChangeVO> resultDTO = new BatchResultDTO<MemberAccountChangeVO>();
        try{
            Integer record = memberAccountChangeDAO.getPageCount(queryMemberAccountChangePage);
            queryMemberAccountChangePage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberAccountChangePage.getPageNo() > queryMemberAccountChangePage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员金豆和银行账户转账记录列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberAccountChangeVO> module = memberAccountChangeDAO.getPageList(queryMemberAccountChangePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberAccountChangeServiceImpl called getMemberAccountChangeList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员金豆和银行账户转账记录列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberAccountChangeVO> getmemberAccountChange(QueryMemberAccountChangeByPrimaryKey queryMemberAccountChangeByPrimaryKey){
        ResultDTO<MemberAccountChangeVO> resultDTO = new ResultDTO<MemberAccountChangeVO>();
        try{
            MemberAccountChangeVO memberAccountChangeVO = memberAccountChangeDAO.getMemberAccountChangeByPrimaryKey(queryMemberAccountChangeByPrimaryKey.getInfoId());
            if(null != memberAccountChangeVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberAccountChangeVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员金豆和银行账户转账记录对象失败");
            }
        }catch (Exception e){
            log.error("#MemberAccountChangeServiceImpl called getMemberAccountChange error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员金豆和银行账户转账记录对象失败");
        }
        return resultDTO;
    }

}
