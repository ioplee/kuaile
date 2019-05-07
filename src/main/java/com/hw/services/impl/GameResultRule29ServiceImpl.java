package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameResultRule29DAO;
import com.hw.bean.PO.GameResultRule29PO;
import com.hw.bean.VO.GameResultRule29VO;
import com.hw.bean.BO.QueryGameResultRule29Page;
import com.hw.bean.BO.QueryGameResultRule29ByPrimaryKey;
import com.hw.services.GameResultRule29Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 游戏开奖结果-三数求和-16 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameResultRule29ServiceImpl implements GameResultRule29Service{

    @Autowired
    private GameResultRule29DAO gameResultRule29DAO;

    @Override
    public BaseResultDTO addGameResultRule29(GameResultRule29PO gameResultRule29PO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule29DAO.insertGameResultRule29(gameResultRule29PO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏开奖结果-三数求和-16信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule29ServiceImpl called addGameResultRule29 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏开奖结果-三数求和-16出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameResultRule29(GameResultRule29PO gameResultRule29PO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameResultRule29DAO.updateGameResultRule29(gameResultRule29PO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏开奖结果-三数求和-16信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameResultRule29ServiceImpl called modifyGameResultRule29 error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏开奖结果-三数求和-16出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameResultRule29VO> getGameResultRule29List(QueryGameResultRule29Page queryGameResultRule29Page){
        BatchResultDTO<GameResultRule29VO> resultDTO = new BatchResultDTO<GameResultRule29VO>();
        try{
            Integer record = gameResultRule29DAO.getPageCount(queryGameResultRule29Page);
            queryGameResultRule29Page.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameResultRule29Page.getPageNo() > queryGameResultRule29Page.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-16列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameResultRule29VO> module = gameResultRule29DAO.getPageList(queryGameResultRule29Page);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameResultRule29ServiceImpl called getGameResultRule29List error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-16列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameResultRule29VO> getgameResultRule29(QueryGameResultRule29ByPrimaryKey queryGameResultRule29ByPrimaryKey){
        ResultDTO<GameResultRule29VO> resultDTO = new ResultDTO<GameResultRule29VO>();
        try{
            GameResultRule29VO gameResultRule29VO = gameResultRule29DAO.getGameResultRule29ByPrimaryKey(queryGameResultRule29ByPrimaryKey.getRecordId());
            if(null != gameResultRule29VO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameResultRule29VO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-16对象失败");
            }
        }catch (Exception e){
            log.error("#GameResultRule29ServiceImpl called getGameResultRule29 error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏开奖结果-三数求和-16对象失败");
        }
        return resultDTO;
    }

}
