package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameResultRule10DAO;
import com.hw.bean.PO.GameResultRule10PO;
import com.hw.bean.VO.GameResultRule10VO;
import com.hw.bean.BO.QueryGameResultRule10Page;
import com.hw.bean.BO.QueryGameResultRule10ByPrimaryKey;
import com.hw.services.GameResultRule10Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 游戏开奖结果-群数第一位 10 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameResultRule10ServiceImpl implements GameResultRule10Service{

    @Autowired
    private GameResultRule10DAO gameResultRule10DAO;

    @Override
    public BaseResultDTO addGameResultRule10(GameResultRule10PO gameResultRule10PO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule10DAO.insertGameResultRule10(gameResultRule10PO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏开奖结果-群数第一位 10信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule10ServiceImpl called addGameResultRule10 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏开奖结果-群数第一位 10出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameResultRule10(GameResultRule10PO gameResultRule10PO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule10DAO.updateGameResultRule10(gameResultRule10PO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏开奖结果-群数第一位 10信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule10ServiceImpl called modifyGameResultRule10 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏开奖结果-群数第一位 10出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameResultRule10VO> getGameResultRule10List(QueryGameResultRule10Page queryGameResultRule10Page){
        BatchResultDTO<GameResultRule10VO> resultDTO = new BatchResultDTO<GameResultRule10VO>();
        try{
            Integer record = gameResultRule10DAO.getPageCount(queryGameResultRule10Page);
            queryGameResultRule10Page.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameResultRule10Page.getPageNo() > queryGameResultRule10Page.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏开奖结果-群数第一位 10列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameResultRule10VO> module = gameResultRule10DAO.getPageList(queryGameResultRule10Page);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameResultRule10ServiceImpl called getGameResultRule10List error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-群数第一位 10列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameResultRule10VO> getgameResultRule10(QueryGameResultRule10ByPrimaryKey queryGameResultRule10ByPrimaryKey){
        ResultDTO<GameResultRule10VO> resultDTO = new ResultDTO<GameResultRule10VO>();
        try{
            GameResultRule10VO gameResultRule10VO = gameResultRule10DAO.getGameResultRule10ByPrimaryKey(queryGameResultRule10ByPrimaryKey.getRecordId());
            if(null != gameResultRule10VO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameResultRule10VO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏开奖结果-群数第一位 10对象失败");
            }
        }catch (Exception e){
            log.error("#GameResultRule10ServiceImpl called getGameResultRule10 error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-群数第一位 10对象失败");
        }
        return resultDTO;
    }

}
