package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameResultRule11DAO;
import com.hw.bean.PO.GameResultRule11PO;
import com.hw.bean.VO.GameResultRule11VO;
import com.hw.bean.BO.QueryGameResultRule11Page;
import com.hw.bean.BO.QueryGameResultRule11ByPrimaryKey;
import com.hw.services.GameResultRule11Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 游戏开奖结果-二数求和 11 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameResultRule11ServiceImpl implements GameResultRule11Service{

    @Autowired
    private GameResultRule11DAO gameResultRule11DAO;

    @Override
    public BaseResultDTO addGameResultRule11(GameResultRule11PO gameResultRule11PO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule11DAO.insertGameResultRule11(gameResultRule11PO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏开奖结果-二数求和 11信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule11ServiceImpl called addGameResultRule11 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏开奖结果-二数求和 11出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameResultRule11(GameResultRule11PO gameResultRule11PO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule11DAO.updateGameResultRule11(gameResultRule11PO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏开奖结果-二数求和 11信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule11ServiceImpl called modifyGameResultRule11 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏开奖结果-二数求和 11出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameResultRule11VO> getGameResultRule11List(QueryGameResultRule11Page queryGameResultRule11Page){
        BatchResultDTO<GameResultRule11VO> resultDTO = new BatchResultDTO<GameResultRule11VO>();
        try{
            Integer record = gameResultRule11DAO.getPageCount(queryGameResultRule11Page);
            queryGameResultRule11Page.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameResultRule11Page.getPageNo() > queryGameResultRule11Page.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏开奖结果-二数求和 11列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameResultRule11VO> module = gameResultRule11DAO.getPageList(queryGameResultRule11Page);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameResultRule11ServiceImpl called getGameResultRule11List error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-二数求和 11列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameResultRule11VO> getgameResultRule11(QueryGameResultRule11ByPrimaryKey queryGameResultRule11ByPrimaryKey){
        ResultDTO<GameResultRule11VO> resultDTO = new ResultDTO<GameResultRule11VO>();
        try{
            GameResultRule11VO gameResultRule11VO = gameResultRule11DAO.getGameResultRule11ByPrimaryKey(queryGameResultRule11ByPrimaryKey.getRecordId());
            if(null != gameResultRule11VO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameResultRule11VO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏开奖结果-二数求和 11对象失败");
            }
        }catch (Exception e){
            log.error("#GameResultRule11ServiceImpl called getGameResultRule11 error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-二数求和 11对象失败");
        }
        return resultDTO;
    }

}
