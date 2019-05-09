package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberLevelAgentDAO;
import com.hw.bean.PO.MemberLevelAgentPO;
import com.hw.bean.VO.MemberLevelAgentVO;
import com.hw.bean.BO.QueryMemberLevelAgentPage;
import com.hw.bean.BO.QueryMemberLevelAgentByPrimaryKey;
import com.hw.services.MemberLevelAgentService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 代理会员等级（直充模式下代理玩家各个等级的配置信息） Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberLevelAgentServiceImpl implements MemberLevelAgentService{

    @Autowired
    private MemberLevelAgentDAO memberLevelAgentDAO;

    @Override
    public BaseResultDTO addMemberLevelAgent(MemberLevelAgentPO memberLevelAgentPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberLevelAgentDAO.insertMemberLevelAgent(memberLevelAgentPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加代理会员等级（直充模式下代理玩家各个等级的配置信息）信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberLevelAgentServiceImpl called addMemberLevelAgent error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加代理会员等级（直充模式下代理玩家各个等级的配置信息）出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberLevelAgent(MemberLevelAgentPO memberLevelAgentPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberLevelAgentDAO.updateMemberLevelAgent(memberLevelAgentPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改代理会员等级（直充模式下代理玩家各个等级的配置信息）信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberLevelAgentServiceImpl called modifyMemberLevelAgent error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改代理会员等级（直充模式下代理玩家各个等级的配置信息）出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberLevelAgentVO> getMemberLevelAgentList(QueryMemberLevelAgentPage queryMemberLevelAgentPage){
        BatchResultDTO<MemberLevelAgentVO> resultDTO = new BatchResultDTO<MemberLevelAgentVO>();
        try{
            Integer record = memberLevelAgentDAO.getPageCount(queryMemberLevelAgentPage);
            queryMemberLevelAgentPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberLevelAgentPage.getPageNo() > queryMemberLevelAgentPage.getTotalPages()){
                resultDTO.setErrorDetail("获取代理会员等级（直充模式下代理玩家各个等级的配置信息）列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberLevelAgentVO> module = memberLevelAgentDAO.getPageList(queryMemberLevelAgentPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberLevelAgentServiceImpl called getMemberLevelAgentList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理会员等级（直充模式下代理玩家各个等级的配置信息）列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberLevelAgentVO> getmemberLevelAgent(QueryMemberLevelAgentByPrimaryKey queryMemberLevelAgentByPrimaryKey){
        ResultDTO<MemberLevelAgentVO> resultDTO = new ResultDTO<MemberLevelAgentVO>();
        try{
            MemberLevelAgentVO memberLevelAgentVO = memberLevelAgentDAO.getMemberLevelAgentByPrimaryKey(queryMemberLevelAgentByPrimaryKey.getLevelId());
            if(null != memberLevelAgentVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberLevelAgentVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取代理会员等级（直充模式下代理玩家各个等级的配置信息）对象失败");
            }
        }catch (Exception e){
            log.error("#MemberLevelAgentServiceImpl called getMemberLevelAgent error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理会员等级（直充模式下代理玩家各个等级的配置信息）对象失败");
        }
        return resultDTO;
    }

}
