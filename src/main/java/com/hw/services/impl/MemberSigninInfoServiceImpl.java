package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberSigninInfoDAO;
import com.hw.bean.PO.MemberSigninInfoPO;
import com.hw.bean.VO.MemberSigninInfoVO;
import com.hw.bean.BO.QueryMemberSigninInfoPage;
import com.hw.bean.BO.QueryMemberSigninInfoByPrimaryKey;
import com.hw.services.MemberSigninInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 会员签到记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberSigninInfoServiceImpl implements MemberSigninInfoService{

    @Autowired
    private MemberSigninInfoDAO memberSigninInfoDAO;

    @Override
    public BaseResultDTO addMemberSigninInfo(MemberSigninInfoPO memberSigninInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberSigninInfoDAO.insertMemberSigninInfo(memberSigninInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员签到记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberSigninInfoServiceImpl called addMemberSigninInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员签到记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberSigninInfo(MemberSigninInfoPO memberSigninInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberSigninInfoDAO.updateMemberSigninInfo(memberSigninInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员签到记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberSigninInfoServiceImpl called modifyMemberSigninInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员签到记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberSigninInfoVO> getMemberSigninInfoList(QueryMemberSigninInfoPage queryMemberSigninInfoPage){
        BatchResultDTO<MemberSigninInfoVO> resultDTO = new BatchResultDTO<MemberSigninInfoVO>();
        try{
            Integer record = memberSigninInfoDAO.getPageCount(queryMemberSigninInfoPage);
            queryMemberSigninInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberSigninInfoPage.getPageNo() > queryMemberSigninInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员签到记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberSigninInfoVO> module = memberSigninInfoDAO.getPageList(queryMemberSigninInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberSigninInfoServiceImpl called getMemberSigninInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员签到记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberSigninInfoVO> getmemberSigninInfo(QueryMemberSigninInfoByPrimaryKey queryMemberSigninInfoByPrimaryKey){
        ResultDTO<MemberSigninInfoVO> resultDTO = new ResultDTO<MemberSigninInfoVO>();
        try{
            MemberSigninInfoVO memberSigninInfoVO = memberSigninInfoDAO.getMemberSigninInfoByPrimaryKey(queryMemberSigninInfoByPrimaryKey.getInfoId());
            if(null != memberSigninInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberSigninInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员签到记录表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberSigninInfoServiceImpl called getMemberSigninInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员签到记录表对象失败");
        }
        return resultDTO;
    }

}
