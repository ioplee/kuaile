package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.AgentGoldenbeanInfoDAO;
import com.hw.bean.PO.AgentGoldenbeanInfoPO;
import com.hw.bean.VO.AgentGoldenbeanInfoVO;
import com.hw.bean.BO.QueryAgentGoldenbeanInfoPage;
import com.hw.bean.BO.QueryAgentGoldenbeanInfoByPrimaryKey;
import com.hw.services.AgentGoldenbeanInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 代理商金豆明细表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class AgentGoldenbeanInfoServiceImpl implements AgentGoldenbeanInfoService{

    @Autowired
    private AgentGoldenbeanInfoDAO agentGoldenbeanInfoDAO;

    @Override
    public BaseResultDTO addAgentGoldenbeanInfo(AgentGoldenbeanInfoPO agentGoldenbeanInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = agentGoldenbeanInfoDAO.insertAgentGoldenbeanInfo(agentGoldenbeanInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加代理商金豆明细表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#AgentGoldenbeanInfoServiceImpl called addAgentGoldenbeanInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加代理商金豆明细表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyAgentGoldenbeanInfo(AgentGoldenbeanInfoPO agentGoldenbeanInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = agentGoldenbeanInfoDAO.updateAgentGoldenbeanInfo(agentGoldenbeanInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改代理商金豆明细表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#AgentGoldenbeanInfoServiceImpl called modifyAgentGoldenbeanInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改代理商金豆明细表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<AgentGoldenbeanInfoVO> getAgentGoldenbeanInfoList(QueryAgentGoldenbeanInfoPage queryAgentGoldenbeanInfoPage){
        BatchResultDTO<AgentGoldenbeanInfoVO> resultDTO = new BatchResultDTO<AgentGoldenbeanInfoVO>();
        try{
            Integer record = agentGoldenbeanInfoDAO.getPageCount(queryAgentGoldenbeanInfoPage);
            queryAgentGoldenbeanInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            List<AgentGoldenbeanInfoVO> module = agentGoldenbeanInfoDAO.getPageList(queryAgentGoldenbeanInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#AgentGoldenbeanInfoServiceImpl called getAgentGoldenbeanInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理商金豆明细表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<AgentGoldenbeanInfoVO> getagentGoldenbeanInfo(QueryAgentGoldenbeanInfoByPrimaryKey queryAgentGoldenbeanInfoByPrimaryKey){
        ResultDTO<AgentGoldenbeanInfoVO> resultDTO = new ResultDTO<AgentGoldenbeanInfoVO>();
        try{
            AgentGoldenbeanInfoVO agentGoldenbeanInfoVO = agentGoldenbeanInfoDAO.getAgentGoldenbeanInfoByPrimaryKey(queryAgentGoldenbeanInfoByPrimaryKey.getInfoId());
            if(null != agentGoldenbeanInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(agentGoldenbeanInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取代理商金豆明细表对象失败");
            }
        }catch (Exception e){
            log.error("#AgentGoldenbeanInfoServiceImpl called getAgentGoldenbeanInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理商金豆明细表对象失败");
        }
        return resultDTO;
    }

}
