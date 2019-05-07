package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameResultRule36DAO;
import com.hw.bean.PO.GameResultRule36PO;
import com.hw.bean.VO.GameResultRule36VO;
import com.hw.bean.BO.QueryGameResultRule36Page;
import com.hw.bean.BO.QueryGameResultRule36ByPrimaryKey;
import com.hw.services.GameResultRule36Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 游戏开奖结果-三数组合类分类 36 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameResultRule36ServiceImpl implements GameResultRule36Service{

    @Autowired
    private GameResultRule36DAO gameResultRule36DAO;

    @Override
    public BaseResultDTO addGameResultRule36(GameResultRule36PO gameResultRule36PO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule36DAO.insertGameResultRule36(gameResultRule36PO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏开奖结果-三数组合类分类 36信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule36ServiceImpl called addGameResultRule36 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏开奖结果-三数组合类分类 36出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameResultRule36(GameResultRule36PO gameResultRule36PO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule36DAO.updateGameResultRule36(gameResultRule36PO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏开奖结果-三数组合类分类 36信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule36ServiceImpl called modifyGameResultRule36 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏开奖结果-三数组合类分类 36出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameResultRule36VO> getGameResultRule36List(QueryGameResultRule36Page queryGameResultRule36Page){
        BatchResultDTO<GameResultRule36VO> resultDTO = new BatchResultDTO<GameResultRule36VO>();
        try{
            Integer record = gameResultRule36DAO.getPageCount(queryGameResultRule36Page);
            queryGameResultRule36Page.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameResultRule36Page.getPageNo() > queryGameResultRule36Page.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏开奖结果-三数组合类分类 36列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameResultRule36VO> module = gameResultRule36DAO.getPageList(queryGameResultRule36Page);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameResultRule36ServiceImpl called getGameResultRule36List error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-三数组合类分类 36列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameResultRule36VO> getgameResultRule36(QueryGameResultRule36ByPrimaryKey queryGameResultRule36ByPrimaryKey){
        ResultDTO<GameResultRule36VO> resultDTO = new ResultDTO<GameResultRule36VO>();
        try{
            GameResultRule36VO gameResultRule36VO = gameResultRule36DAO.getGameResultRule36ByPrimaryKey(queryGameResultRule36ByPrimaryKey.getRecordId());
            if(null != gameResultRule36VO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameResultRule36VO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏开奖结果-三数组合类分类 36对象失败");
            }
        }catch (Exception e){
            log.error("#GameResultRule36ServiceImpl called getGameResultRule36 error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-三数组合类分类 36对象失败");
        }
        return resultDTO;
    }

}
