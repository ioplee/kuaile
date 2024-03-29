package com.hw.services.impl;

import com.hw.bean.VO.AgentGoldenBeanShowVO;
import com.hw.utils.MD5;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.AgentInfoDAO;
import com.hw.bean.PO.AgentInfoPO;
import com.hw.bean.VO.AgentInfoVO;
import com.hw.bean.BO.QueryAgentInfoPage;
import com.hw.bean.BO.QueryAgentInfoByPrimaryKey;
import com.hw.services.AgentInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 代理商信息表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class AgentInfoServiceImpl implements AgentInfoService{

    @Autowired
    private AgentInfoDAO agentInfoDAO;

    @Override
    public BaseResultDTO addAgentInfo(AgentInfoPO agentInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            if (agentInfoDAO.exisitAccount(agentInfoPO.getAgentAccount()) == 0){
                String password = MD5.md5(agentInfoPO.getAgentPassword());
                agentInfoPO.setAgentPassword(password);
                Integer number = agentInfoDAO.insertAgentInfo(agentInfoPO);
                if(number == 1){
                    addResultDTO.setResultCode("1");
                    addResultDTO.setSuccess(true);
                }else{
                    addResultDTO.setErrorDetail("添加代理商信息表信息失败");
                    addResultDTO.setSuccess(true);
                    addResultDTO.setResultCode("0");
                }
            }else {
                addResultDTO.setErrorDetail("账户已经存在,请使用不重复的登录账户");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("1");
            }
        }catch (Exception e){
            log.error("#AgentInfoServiceImpl called addAgentInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加代理商信息表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyAgentInfo(AgentInfoPO agentInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            if (agentInfoDAO.exisitAccountByUser(agentInfoPO.getAgentAccount(),agentInfoPO.getAgentId()) == 0){
                String password = MD5.md5(agentInfoPO.getAgentPassword());
                agentInfoPO.setAgentPassword(password);
                Integer number = agentInfoDAO.updateAgentInfo(agentInfoPO);
                if(number == 1){
                    modifyResultDTO.setResultCode("1");
                    modifyResultDTO.setSuccess(true);
                }else{
                    modifyResultDTO.setErrorDetail("修改代理商信息表信息失败");
                    modifyResultDTO.setSuccess(true);
                    modifyResultDTO.setResultCode("0");
                }
            }else{
                modifyResultDTO.setErrorDetail("账户已经被其他用户使用,请使用不重复的登录账户");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("1");
            }
        }catch (Exception e){
            log.error("#AgentInfoServiceImpl called modifyAgentInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改代理商信息表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<AgentInfoVO> getAgentInfoList(QueryAgentInfoPage queryAgentInfoPage){
        BatchResultDTO<AgentInfoVO> resultDTO = new BatchResultDTO<AgentInfoVO>();
        try{
            Integer record = agentInfoDAO.getPageCount(queryAgentInfoPage);
            queryAgentInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            List<AgentInfoVO> module = agentInfoDAO.getPageList(queryAgentInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#AgentInfoServiceImpl called getAgentInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理商信息表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO resetAgentStatus(AgentInfoPO agentInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = agentInfoDAO.resetStatus(agentInfoPO);
            resultDTO.setSuccess(true);
            if (number == 1){
                resultDTO.setResultCode("1");
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setErrorDetail("修改代理商状态失败");
            }
        }catch (Exception e){
            log.error("#AgentInfoServiceImpl called resetAgentStatus error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改代理商状态出错");
        }
        return resultDTO;
    }

    @Override
    public BatchResultDTO<AgentGoldenBeanShowVO> getAgentInfoListForGoldBean(QueryAgentInfoPage queryAgentInfoPage) {
        BatchResultDTO<AgentGoldenBeanShowVO> resultDTO = new BatchResultDTO<AgentGoldenBeanShowVO>();
        try {
            Integer record = agentInfoDAO.getAgentCount(queryAgentInfoPage);
            queryAgentInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            List<AgentGoldenBeanShowVO> module = agentInfoDAO.getAgentList(queryAgentInfoPage);
            resultDTO.setSuccess(true);
            resultDTO.setResultCode("1");
            if (null!= module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch (Exception e){
            log.error("#AgentInfoServiceImpl called getAgentInfoListForGoldBean error#",e);
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("查询代理商列表出错");
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<AgentInfoVO> getagentInfo(QueryAgentInfoByPrimaryKey queryAgentInfoByPrimaryKey){
        ResultDTO<AgentInfoVO> resultDTO = new ResultDTO<AgentInfoVO>();
        try{
            AgentInfoVO agentInfoVO = agentInfoDAO.getAgentInfoByPrimaryKey(queryAgentInfoByPrimaryKey.getAgentId());
            if(null != agentInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(agentInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取代理商信息表对象失败");
            }
        }catch (Exception e){
            log.error("#AgentInfoServiceImpl called getAgentInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取代理商信息表对象失败");
        }
        return resultDTO;
    }

}
