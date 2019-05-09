package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameInfoDAO;
import com.hw.bean.PO.GameInfoPO;
import com.hw.bean.VO.GameInfoVO;
import com.hw.bean.BO.QueryGameInfoPage;
import com.hw.bean.BO.QueryGameInfoByPrimaryKey;
import com.hw.services.GameInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 游戏信息表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameInfoServiceImpl implements GameInfoService{

    @Autowired
    private GameInfoDAO gameInfoDAO;

    @Override
    public BaseResultDTO addGameInfo(GameInfoPO gameInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameInfoDAO.insertGameInfo(gameInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏信息表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameInfoServiceImpl called addGameInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏信息表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameInfo(GameInfoPO gameInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameInfoDAO.updateGameInfo(gameInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏信息表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameInfoServiceImpl called modifyGameInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏信息表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameInfoVO> getGameInfoList(QueryGameInfoPage queryGameInfoPage){
        BatchResultDTO<GameInfoVO> resultDTO = new BatchResultDTO<GameInfoVO>();
        try{
            Integer record = gameInfoDAO.getPageCount(queryGameInfoPage);
            queryGameInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameInfoPage.getPageNo() > queryGameInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏信息表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameInfoVO> module = gameInfoDAO.getPageList(queryGameInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameInfoServiceImpl called getGameInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏信息表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameInfoVO> getgameInfo(QueryGameInfoByPrimaryKey queryGameInfoByPrimaryKey){
        ResultDTO<GameInfoVO> resultDTO = new ResultDTO<GameInfoVO>();
        try{
            GameInfoVO gameInfoVO = gameInfoDAO.getGameInfoByPrimaryKey(queryGameInfoByPrimaryKey.getGameId());
            if(null != gameInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏信息表对象失败");
            }
        }catch (Exception e){
            log.error("#GameInfoServiceImpl called getGameInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏信息表对象失败");
        }
        return resultDTO;
    }

}
