package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameInfoOptionsDAO;
import com.hw.bean.PO.GameInfoOptionsPO;
import com.hw.bean.VO.GameInfoOptionsVO;
import com.hw.bean.BO.QueryGameInfoOptionsPage;
import com.hw.bean.BO.QueryGameInfoOptionsByPrimaryKey;
import com.hw.services.GameInfoOptionsService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 游戏投注项 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameInfoOptionsServiceImpl implements GameInfoOptionsService{

    @Autowired
    private GameInfoOptionsDAO gameInfoOptionsDAO;

    @Override
    public BaseResultDTO addGameInfoOptions(GameInfoOptionsPO gameInfoOptionsPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameInfoOptionsDAO.insertGameInfoOptions(gameInfoOptionsPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏投注项信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameInfoOptionsServiceImpl called addGameInfoOptions error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏投注项出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameInfoOptions(GameInfoOptionsPO gameInfoOptionsPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameInfoOptionsDAO.updateGameInfoOptions(gameInfoOptionsPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏投注项信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameInfoOptionsServiceImpl called modifyGameInfoOptions error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏投注项出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameInfoOptionsVO> getGameInfoOptionsList(QueryGameInfoOptionsPage queryGameInfoOptionsPage){
        BatchResultDTO<GameInfoOptionsVO> resultDTO = new BatchResultDTO<GameInfoOptionsVO>();
        try{
            Integer record = gameInfoOptionsDAO.getPageCount(queryGameInfoOptionsPage);
            queryGameInfoOptionsPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameInfoOptionsPage.getPageNo() > queryGameInfoOptionsPage.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏投注项列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameInfoOptionsVO> module = gameInfoOptionsDAO.getPageList(queryGameInfoOptionsPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameInfoOptionsServiceImpl called getGameInfoOptionsList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏投注项列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameInfoOptionsVO> getgameInfoOptions(QueryGameInfoOptionsByPrimaryKey queryGameInfoOptionsByPrimaryKey){
        ResultDTO<GameInfoOptionsVO> resultDTO = new ResultDTO<GameInfoOptionsVO>();
        try{
            GameInfoOptionsVO gameInfoOptionsVO = gameInfoOptionsDAO.getGameInfoOptionsByPrimaryKey(queryGameInfoOptionsByPrimaryKey.getOptionId());
            if(null != gameInfoOptionsVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameInfoOptionsVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏投注项对象失败");
            }
        }catch (Exception e){
            log.error("#GameInfoOptionsServiceImpl called getGameInfoOptions error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏投注项对象失败");
        }
        return resultDTO;
    }

}
