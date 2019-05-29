package com.hw.services.impl;

import com.hw.bean.PO.AgentGoldenbeanInfoPO;
import com.hw.dao.AgentGoldenbeanInfoDAO;
import com.hw.utils.biz.AgentGoldenBeanType;
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
* @create: 2019-05-10 00:12:49
* @description: 代理商金豆表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class AgentGoldenbeanServiceImpl implements AgentGoldenbeanService{

    @Autowired
    private AgentGoldenbeanDAO agentGoldenbeanDAO;

    @Autowired
    private AgentGoldenbeanInfoDAO agentGoldenbeanInfoDAO;

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
    public BaseResultDTO upAgentGoldenBean(AgentGoldenbeanPO agentGoldenbeanPO) {
        BaseResultDTO upResultDTO = new BaseResultDTO();
        try {
            //首先判断代理商金豆记录是否存在,存在则直接上分,不存在则创建一条代理商金豆总数记录
            Integer agentGoldenBeanRecord = agentGoldenbeanDAO.existAgentGoldenBeanRecord(agentGoldenbeanPO.getAgentId());
            if (agentGoldenBeanRecord == 0){
                //如果代理商没有金豆总记录数,则创建一条金豆总记录数
                agentGoldenbeanDAO.insertAgentGoldenbean(agentGoldenbeanPO);
                //添加金豆记录明细
                AgentGoldenbeanInfoPO infoPO = new AgentGoldenbeanInfoPO();
                infoPO.setAgentId(agentGoldenbeanPO.getAgentId());
                infoPO.setBeanCounts(agentGoldenbeanPO.getBeanCounts());//添加金豆数
                infoPO.setBaseCounts(agentGoldenbeanPO.getBeanCounts());//基础金豆数,此处为0
                infoPO.setInfoType(AgentGoldenBeanType.UPGoldenBeanPlam.getValue());//金豆明细记录类型
                infoPO.setInfoStatus(1);//记录状态 1有效
                infoPO.setRebateCounts(0l);//返点0
                agentGoldenbeanInfoDAO.insertAgentGoldenbeanInfo(infoPO);
            }else if (agentGoldenBeanRecord == 1){
                //累加代理商金豆数
                agentGoldenbeanDAO.upAgentGoldenBean(agentGoldenbeanPO.getBeanCounts(),agentGoldenbeanPO.getAgentId());
                //添加金豆记录明细
                AgentGoldenbeanInfoPO infoPO = new AgentGoldenbeanInfoPO();
                infoPO.setAgentId(agentGoldenbeanPO.getAgentId());
                infoPO.setBeanCounts(agentGoldenbeanPO.getBeanCounts());//添加金豆数
                infoPO.setBaseCounts(agentGoldenbeanPO.getBeanCounts());//基础金豆数,此处为0
                infoPO.setInfoType(AgentGoldenBeanType.UPGoldenBeanPlam.getValue());//金豆明细记录类型
                infoPO.setInfoStatus(1);//记录状态 1有效
                infoPO.setRebateCounts(0l);//返点0
                agentGoldenbeanInfoDAO.insertAgentGoldenbeanInfo(infoPO);
            }else {
                //如果不是0/1 说明代理商总金豆数有问题.则提示用户代理商存在问题.运维上线查看
                upResultDTO.setResultCode("0");
                upResultDTO.setSuccess(false);
                upResultDTO.setErrorDetail("代理商记录异常,请运维人员进行排查.");
                return upResultDTO;
            }
            upResultDTO.setResultCode("1");
            upResultDTO.setSuccess(true);
        }catch (Exception e){
            log.error("#AgentGoldenbeanServiceImpl called upAgentGoldenBean error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            upResultDTO.setResultCode("0");
            upResultDTO.setSuccess(false);
            upResultDTO.setErrorDetail("代理商上分出错");
        }
        return upResultDTO;
    }

    @Override
    public BaseResultDTO downAgentGoldenBean(AgentGoldenbeanPO agentGoldenbeanPO) {
        BaseResultDTO downResultDTO = new BaseResultDTO();
        try {
            //首先判断代理商金豆记录是否存在,存在则直接上分,不存在则创建一条代理商金豆总数记录
            Integer agentGoldenBeanRecord = agentGoldenbeanDAO.existAgentGoldenBeanRecord(agentGoldenbeanPO.getAgentId());
            if (agentGoldenBeanRecord == 0){
                //如果代理商没有金豆总记录数,则创建一条金豆总记录数
                downResultDTO.setResultCode("0");
                downResultDTO.setSuccess(false);
                downResultDTO.setErrorDetail("代理商记录异常,不允许没有上分的代理商进行下分操作,请运维人员进行排查.");
                return downResultDTO;
            }else if (agentGoldenBeanRecord == 1){
                //扣减代理商金豆数
                agentGoldenbeanDAO.downAgentGoldenBean(agentGoldenbeanPO.getBeanCounts(),agentGoldenbeanPO.getAgentId());
                //添加金豆记录明细
                AgentGoldenbeanInfoPO infoPO = new AgentGoldenbeanInfoPO();
                infoPO.setAgentId(agentGoldenbeanPO.getAgentId());
                infoPO.setBeanCounts(agentGoldenbeanPO.getBeanCounts());//添加金豆数
                infoPO.setBaseCounts(agentGoldenbeanPO.getBeanCounts());//基础金豆数,此处为0
                infoPO.setInfoType(AgentGoldenBeanType.DownGoldenBeanToSellUser.getValue());//金豆明细记录类型(平台给代理商下分)
                infoPO.setInfoStatus(1);//记录状态 1有效
                infoPO.setRebateCounts(0l);//返点0
                agentGoldenbeanInfoDAO.insertAgentGoldenbeanInfo(infoPO);
            }else {
                //如果不是0/1 说明代理商总金豆数有问题.则提示用户代理商存在问题.运维上线查看
                downResultDTO.setResultCode("0");
                downResultDTO.setSuccess(false);
                downResultDTO.setErrorDetail("代理商记录异常,请运维人员进行排查.");
                return downResultDTO;
            }
            downResultDTO.setResultCode("1");
            downResultDTO.setSuccess(true);
        }catch (Exception e){
            log.error("#AgentGoldenbeanServiceImpl called downAgentGoldenBean error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            downResultDTO.setResultCode("0");
            downResultDTO.setSuccess(false);
            downResultDTO.setErrorDetail("代理商下分出错");
        }
        return downResultDTO;
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
