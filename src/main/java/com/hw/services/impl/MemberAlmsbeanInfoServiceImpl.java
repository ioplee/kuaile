package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberAlmsbeanInfoDAO;
import com.hw.bean.PO.MemberAlmsbeanInfoPO;
import com.hw.bean.VO.MemberAlmsbeanInfoVO;
import com.hw.bean.BO.QueryMemberAlmsbeanInfoPage;
import com.hw.bean.BO.QueryMemberAlmsbeanInfoByPrimaryKey;
import com.hw.services.MemberAlmsbeanInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 会员每日救济金豆领取记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberAlmsbeanInfoServiceImpl implements MemberAlmsbeanInfoService{

    @Autowired
    private MemberAlmsbeanInfoDAO memberAlmsbeanInfoDAO;

    @Override
    public BaseResultDTO addMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberAlmsbeanInfoDAO.insertMemberAlmsbeanInfo(memberAlmsbeanInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员每日救济金豆领取记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberAlmsbeanInfoServiceImpl called addMemberAlmsbeanInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员每日救济金豆领取记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberAlmsbeanInfoDAO.updateMemberAlmsbeanInfo(memberAlmsbeanInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员每日救济金豆领取记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberAlmsbeanInfoServiceImpl called modifyMemberAlmsbeanInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员每日救济金豆领取记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberAlmsbeanInfoVO> getMemberAlmsbeanInfoList(QueryMemberAlmsbeanInfoPage queryMemberAlmsbeanInfoPage){
        BatchResultDTO<MemberAlmsbeanInfoVO> resultDTO = new BatchResultDTO<MemberAlmsbeanInfoVO>();
        try{
            Integer record = memberAlmsbeanInfoDAO.getPageCount(queryMemberAlmsbeanInfoPage);
            queryMemberAlmsbeanInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberAlmsbeanInfoPage.getPageNo() > queryMemberAlmsbeanInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员每日救济金豆领取记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberAlmsbeanInfoVO> module = memberAlmsbeanInfoDAO.getPageList(queryMemberAlmsbeanInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberAlmsbeanInfoServiceImpl called getMemberAlmsbeanInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员每日救济金豆领取记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberAlmsbeanInfoVO> getmemberAlmsbeanInfo(QueryMemberAlmsbeanInfoByPrimaryKey queryMemberAlmsbeanInfoByPrimaryKey){
        ResultDTO<MemberAlmsbeanInfoVO> resultDTO = new ResultDTO<MemberAlmsbeanInfoVO>();
        try{
            MemberAlmsbeanInfoVO memberAlmsbeanInfoVO = memberAlmsbeanInfoDAO.getMemberAlmsbeanInfoByPrimaryKey(queryMemberAlmsbeanInfoByPrimaryKey.getInfoId());
            if(null != memberAlmsbeanInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberAlmsbeanInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员每日救济金豆领取记录表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberAlmsbeanInfoServiceImpl called getMemberAlmsbeanInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员每日救济金豆领取记录表对象失败");
        }
        return resultDTO;
    }

}
