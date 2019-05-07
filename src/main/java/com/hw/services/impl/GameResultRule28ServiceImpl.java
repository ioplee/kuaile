package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameResultRule28DAO;
import com.hw.bean.PO.GameResultRule28PO;
import com.hw.bean.VO.GameResultRule28VO;
import com.hw.bean.BO.QueryGameResultRule28Page;
import com.hw.bean.BO.QueryGameResultRule28ByPrimaryKey;
import com.hw.services.GameResultRule28Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 游戏开奖结果-三数求和-28 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameResultRule28ServiceImpl implements GameResultRule28Service{

    @Autowired
    private GameResultRule28DAO gameResultRule28DAO;

    @Override
    public BaseResultDTO addGameResultRule28(GameResultRule28PO gameResultRule28PO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule28DAO.insertGameResultRule28(gameResultRule28PO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏开奖结果-三数求和-28信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule28ServiceImpl called addGameResultRule28 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏开奖结果-三数求和-28出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameResultRule28(GameResultRule28PO gameResultRule28PO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule28DAO.updateGameResultRule28(gameResultRule28PO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏开奖结果-三数求和-28信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule28ServiceImpl called modifyGameResultRule28 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏开奖结果-三数求和-28出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameResultRule28VO> getGameResultRule28List(QueryGameResultRule28Page queryGameResultRule28Page){
        BatchResultDTO<GameResultRule28VO> resultDTO = new BatchResultDTO<GameResultRule28VO>();
        try{
            Integer record = gameResultRule28DAO.getPageCount(queryGameResultRule28Page);
            queryGameResultRule28Page.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameResultRule28Page.getPageNo() > queryGameResultRule28Page.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-28列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameResultRule28VO> module = gameResultRule28DAO.getPageList(queryGameResultRule28Page);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameResultRule28ServiceImpl called getGameResultRule28List error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-28列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameResultRule28VO> getgameResultRule28(QueryGameResultRule28ByPrimaryKey queryGameResultRule28ByPrimaryKey){
        ResultDTO<GameResultRule28VO> resultDTO = new ResultDTO<GameResultRule28VO>();
        try{
            GameResultRule28VO gameResultRule28VO = gameResultRule28DAO.getGameResultRule28ByPrimaryKey(queryGameResultRule28ByPrimaryKey.getRecordId());
            if(null != gameResultRule28VO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameResultRule28VO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-28对象失败");
            }
        }catch (Exception e){
            log.error("#GameResultRule28ServiceImpl called getGameResultRule28 error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-28对象失败");
        }
        return resultDTO;
    }

}
