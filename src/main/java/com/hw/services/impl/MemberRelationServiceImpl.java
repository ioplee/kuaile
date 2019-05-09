package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberRelationDAO;
import com.hw.bean.PO.MemberRelationPO;
import com.hw.bean.VO.MemberRelationVO;
import com.hw.bean.BO.QueryMemberRelationPage;
import com.hw.bean.BO.QueryMemberRelationByPrimaryKey;
import com.hw.services.MemberRelationService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 玩家关系族谱表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberRelationServiceImpl implements MemberRelationService{

    @Autowired
    private MemberRelationDAO memberRelationDAO;

    @Override
    public BaseResultDTO addMemberRelation(MemberRelationPO memberRelationPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberRelationDAO.insertMemberRelation(memberRelationPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加玩家关系族谱表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberRelationServiceImpl called addMemberRelation error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加玩家关系族谱表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberRelation(MemberRelationPO memberRelationPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberRelationDAO.updateMemberRelation(memberRelationPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改玩家关系族谱表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberRelationServiceImpl called modifyMemberRelation error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改玩家关系族谱表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberRelationVO> getMemberRelationList(QueryMemberRelationPage queryMemberRelationPage){
        BatchResultDTO<MemberRelationVO> resultDTO = new BatchResultDTO<MemberRelationVO>();
        try{
            Integer record = memberRelationDAO.getPageCount(queryMemberRelationPage);
            queryMemberRelationPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberRelationPage.getPageNo() > queryMemberRelationPage.getTotalPages()){
                resultDTO.setErrorDetail("获取玩家关系族谱表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberRelationVO> module = memberRelationDAO.getPageList(queryMemberRelationPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberRelationServiceImpl called getMemberRelationList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家关系族谱表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberRelationVO> getmemberRelation(QueryMemberRelationByPrimaryKey queryMemberRelationByPrimaryKey){
        ResultDTO<MemberRelationVO> resultDTO = new ResultDTO<MemberRelationVO>();
        try{
            MemberRelationVO memberRelationVO = memberRelationDAO.getMemberRelationByPrimaryKey(queryMemberRelationByPrimaryKey.getRealtionId());
            if(null != memberRelationVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberRelationVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取玩家关系族谱表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberRelationServiceImpl called getMemberRelation error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家关系族谱表对象失败");
        }
        return resultDTO;
    }

}
