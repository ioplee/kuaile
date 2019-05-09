package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberLevelPlayerDAO;
import com.hw.bean.PO.MemberLevelPlayerPO;
import com.hw.bean.VO.MemberLevelPlayerVO;
import com.hw.bean.BO.QueryMemberLevelPlayerPage;
import com.hw.bean.BO.QueryMemberLevelPlayerByPrimaryKey;
import com.hw.services.MemberLevelPlayerService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 玩家会员等级表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberLevelPlayerServiceImpl implements MemberLevelPlayerService{

    @Autowired
    private MemberLevelPlayerDAO memberLevelPlayerDAO;

    @Override
    public BaseResultDTO addMemberLevelPlayer(MemberLevelPlayerPO memberLevelPlayerPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberLevelPlayerDAO.insertMemberLevelPlayer(memberLevelPlayerPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加玩家会员等级表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberLevelPlayerServiceImpl called addMemberLevelPlayer error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加玩家会员等级表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberLevelPlayer(MemberLevelPlayerPO memberLevelPlayerPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberLevelPlayerDAO.updateMemberLevelPlayer(memberLevelPlayerPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改玩家会员等级表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberLevelPlayerServiceImpl called modifyMemberLevelPlayer error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改玩家会员等级表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberLevelPlayerVO> getMemberLevelPlayerList(QueryMemberLevelPlayerPage queryMemberLevelPlayerPage){
        BatchResultDTO<MemberLevelPlayerVO> resultDTO = new BatchResultDTO<MemberLevelPlayerVO>();
        try{
            Integer record = memberLevelPlayerDAO.getPageCount(queryMemberLevelPlayerPage);
            queryMemberLevelPlayerPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberLevelPlayerPage.getPageNo() > queryMemberLevelPlayerPage.getTotalPages()){
                resultDTO.setErrorDetail("获取玩家会员等级表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberLevelPlayerVO> module = memberLevelPlayerDAO.getPageList(queryMemberLevelPlayerPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberLevelPlayerServiceImpl called getMemberLevelPlayerList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家会员等级表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberLevelPlayerVO> getmemberLevelPlayer(QueryMemberLevelPlayerByPrimaryKey queryMemberLevelPlayerByPrimaryKey){
        ResultDTO<MemberLevelPlayerVO> resultDTO = new ResultDTO<MemberLevelPlayerVO>();
        try{
            MemberLevelPlayerVO memberLevelPlayerVO = memberLevelPlayerDAO.getMemberLevelPlayerByPrimaryKey(queryMemberLevelPlayerByPrimaryKey.getLevelId());
            if(null != memberLevelPlayerVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberLevelPlayerVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取玩家会员等级表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberLevelPlayerServiceImpl called getMemberLevelPlayer error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家会员等级表对象失败");
        }
        return resultDTO;
    }

}
