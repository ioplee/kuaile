package com.hw.services.impl;

import com.hw.bean.BO.QueryMemberInfoByAgent;
import com.hw.utils.MD5;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberInfoDAO;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.bean.VO.MemberInfoVO;
import com.hw.bean.BO.QueryMemberInfoPage;
import com.hw.bean.BO.QueryMemberInfoByPrimaryKey;
import com.hw.services.MemberInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 会员表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberInfoServiceImpl implements MemberInfoService{

    @Autowired
    private MemberInfoDAO memberInfoDAO;

    @Override
    public BaseResultDTO addMemberInfo(MemberInfoPO memberInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            if (memberInfoDAO.exist(memberInfoPO.getMemberMobile()) == 0){
                memberInfoPO.setLoginPass(MD5.md5(memberInfoPO.getLoginPass()));
                Integer number = memberInfoDAO.insertMemberInfo(memberInfoPO);
                if(number == 1){
                    addResultDTO.setResultCode("1");
                    addResultDTO.setSuccess(true);
                }else{
                    addResultDTO.setErrorDetail("添加会员表信息失败");
                    addResultDTO.setSuccess(true);
                    addResultDTO.setResultCode("0");
                }
            }else {
                addResultDTO.setErrorDetail("玩家手机已经被注册过");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }

        }catch (Exception e){
            log.error("#MemberInfoServiceImpl called addMemberInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberInfo(MemberInfoPO memberInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            if (memberInfoDAO.existByUser(memberInfoPO.getMemberMobile(),memberInfoPO.getMemberId()) == 0){
                Integer number = memberInfoDAO.updateMemberInfo(memberInfoPO);
                if(number == 1){
                    modifyResultDTO.setResultCode("1");
                    modifyResultDTO.setSuccess(true);
                }else{
                    modifyResultDTO.setErrorDetail("修改会员表信息失败");
                    modifyResultDTO.setSuccess(true);
                    modifyResultDTO.setResultCode("0");
                }
            }else {
                modifyResultDTO.setErrorDetail("玩家手机已经被注册过");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberInfoServiceImpl called modifyMemberInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberInfoVO> getMemberInfoList(QueryMemberInfoPage queryMemberInfoPage){
        BatchResultDTO<MemberInfoVO> resultDTO = new BatchResultDTO<MemberInfoVO>();
        try{
            Integer record = memberInfoDAO.getPageCount(queryMemberInfoPage);
            queryMemberInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            List<MemberInfoVO> module = memberInfoDAO.getPageList(queryMemberInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberInfoServiceImpl called getMemberInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public BatchResultDTO<MemberInfoVO> getMemberInfoListByAgent(QueryMemberInfoByAgent queryMemberInfoByAgent) {
        BatchResultDTO<MemberInfoVO> resultDTO = new BatchResultDTO<MemberInfoVO>();
        try{
            Integer record = memberInfoDAO.getPageListCountByAgent(queryMemberInfoByAgent);
            queryMemberInfoByAgent.setRecord(record);
            resultDTO.setRecord(record);
            List<MemberInfoVO> module = memberInfoDAO.getPageListByAgent(queryMemberInfoByAgent);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch (Exception e){
            log.error("#MemberInfoServiceImpl called getMemberInfoListByAgent error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理商的会员表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberInfoVO> getmemberInfo(QueryMemberInfoByPrimaryKey queryMemberInfoByPrimaryKey){
        ResultDTO<MemberInfoVO> resultDTO = new ResultDTO<MemberInfoVO>();
        try{
            MemberInfoVO memberInfoVO = memberInfoDAO.getMemberInfoByPrimaryKey(queryMemberInfoByPrimaryKey.getMemberId());
            if(null != memberInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberInfoServiceImpl called getMemberInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员表对象失败");
        }
        return resultDTO;
    }

}
