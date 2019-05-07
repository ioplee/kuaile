package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.AgentGoldenbeanDAO;
import com.hw.bean.PO.AgentGoldenbeanPO;
import com.hw.bean.VO.AgentGoldenbeanVO;
import com.hw.bean.BO.QueryAgentGoldenbeanPage;
import com.hw.bean.BO.QueryAgentGoldenbeanByPrimaryKey;
import com.hw.services.AgentGoldenbeanService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:43
* @description: 代理商金豆表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class AgentGoldenbeanServiceImpl implements AgentGoldenbeanService{

    @Autowired
    private AgentGoldenbeanDAO agentGoldenbeanDAO;

    @Override
    public BaseResultDTO addAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = agentGoldenbeanDAO.insertAgentGoldenbean(agentGoldenbeanPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加代理商金豆表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#AgentGoldenbeanServiceImpl called addAgentGoldenbean error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加代理商金豆表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = agentGoldenbeanDAO.updateAgentGoldenbean(agentGoldenbeanPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改代理商金豆表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#AgentGoldenbeanServiceImpl called modifyAgentGoldenbean error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改代理商金豆表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<AgentGoldenbeanVO> getAgentGoldenbeanList(QueryAgentGoldenbeanPage queryAgentGoldenbeanPage){
        BatchResultDTO<AgentGoldenbeanVO> resultDTO = new BatchResultDTO<AgentGoldenbeanVO>();
        try{
            Integer record = agentGoldenbeanDAO.getPageCount(queryAgentGoldenbeanPage);
            queryAgentGoldenbeanPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryAgentGoldenbeanPage.getPageNo() > queryAgentGoldenbeanPage.getTotalPages()){
                resultDTO.setErrorDetail("获取代理商金豆表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<AgentGoldenbeanVO> module = agentGoldenbeanDAO.getPageList(queryAgentGoldenbeanPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#AgentGoldenbeanServiceImpl called getAgentGoldenbeanList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理商金豆表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<AgentGoldenbeanVO> getagentGoldenbean(QueryAgentGoldenbeanByPrimaryKey queryAgentGoldenbeanByPrimaryKey){
        ResultDTO<AgentGoldenbeanVO> resultDTO = new ResultDTO<AgentGoldenbeanVO>();
        try{
            AgentGoldenbeanVO agentGoldenbeanVO = agentGoldenbeanDAO.getAgentGoldenbeanByPrimaryKey(queryAgentGoldenbeanByPrimaryKey.getInfoId());
            if(null != agentGoldenbeanVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(agentGoldenbeanVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取代理商金豆表对象失败");
            }
        }catch (Exception e){
            log.error("#AgentGoldenbeanServiceImpl called getAgentGoldenbean error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理商金豆表对象失败");
        }
        return resultDTO;
    }

}
