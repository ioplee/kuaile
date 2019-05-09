package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GamePlayerBettingDAO;
import com.hw.bean.PO.GamePlayerBettingPO;
import com.hw.bean.VO.GamePlayerBettingVO;
import com.hw.bean.BO.QueryGamePlayerBettingPage;
import com.hw.bean.BO.QueryGamePlayerBettingByPrimaryKey;
import com.hw.services.GamePlayerBettingService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 玩家投注表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GamePlayerBettingServiceImpl implements GamePlayerBettingService{

    @Autowired
    private GamePlayerBettingDAO gamePlayerBettingDAO;

    @Override
    public BaseResultDTO addGamePlayerBetting(GamePlayerBettingPO gamePlayerBettingPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gamePlayerBettingDAO.insertGamePlayerBetting(gamePlayerBettingPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加玩家投注表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GamePlayerBettingServiceImpl called addGamePlayerBetting error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加玩家投注表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGamePlayerBetting(GamePlayerBettingPO gamePlayerBettingPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gamePlayerBettingDAO.updateGamePlayerBetting(gamePlayerBettingPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改玩家投注表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GamePlayerBettingServiceImpl called modifyGamePlayerBetting error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改玩家投注表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GamePlayerBettingVO> getGamePlayerBettingList(QueryGamePlayerBettingPage queryGamePlayerBettingPage){
        BatchResultDTO<GamePlayerBettingVO> resultDTO = new BatchResultDTO<GamePlayerBettingVO>();
        try{
            Integer record = gamePlayerBettingDAO.getPageCount(queryGamePlayerBettingPage);
            queryGamePlayerBettingPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGamePlayerBettingPage.getPageNo() > queryGamePlayerBettingPage.getTotalPages()){
                resultDTO.setErrorDetail("获取玩家投注表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GamePlayerBettingVO> module = gamePlayerBettingDAO.getPageList(queryGamePlayerBettingPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GamePlayerBettingServiceImpl called getGamePlayerBettingList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家投注表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GamePlayerBettingVO> getgamePlayerBetting(QueryGamePlayerBettingByPrimaryKey queryGamePlayerBettingByPrimaryKey){
        ResultDTO<GamePlayerBettingVO> resultDTO = new ResultDTO<GamePlayerBettingVO>();
        try{
            GamePlayerBettingVO gamePlayerBettingVO = gamePlayerBettingDAO.getGamePlayerBettingByPrimaryKey(queryGamePlayerBettingByPrimaryKey.getBettingId());
            if(null != gamePlayerBettingVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gamePlayerBettingVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取玩家投注表对象失败");
            }
        }catch (Exception e){
            log.error("#GamePlayerBettingServiceImpl called getGamePlayerBetting error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家投注表对象失败");
        }
        return resultDTO;
    }

}
