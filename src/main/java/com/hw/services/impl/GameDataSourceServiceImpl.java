package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameDataSourceDAO;
import com.hw.bean.PO.GameDataSourcePO;
import com.hw.bean.VO.GameDataSourceVO;
import com.hw.bean.BO.QueryGameDataSourcePage;
import com.hw.bean.BO.QueryGameDataSourceByPrimaryKey;
import com.hw.services.GameDataSourceService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 游戏数据源表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameDataSourceServiceImpl implements GameDataSourceService{

    @Autowired
    private GameDataSourceDAO gameDataSourceDAO;

    @Override
    public BaseResultDTO addGameDataSource(GameDataSourcePO gameDataSourcePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameDataSourceDAO.insertGameDataSource(gameDataSourcePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏数据源表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameDataSourceServiceImpl called addGameDataSource error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏数据源表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameDataSource(GameDataSourcePO gameDataSourcePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameDataSourceDAO.updateGameDataSource(gameDataSourcePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏数据源表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameDataSourceServiceImpl called modifyGameDataSource error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏数据源表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameDataSourceVO> getGameDataSourceList(QueryGameDataSourcePage queryGameDataSourcePage){
        BatchResultDTO<GameDataSourceVO> resultDTO = new BatchResultDTO<GameDataSourceVO>();
        try{
            Integer record = gameDataSourceDAO.getPageCount(queryGameDataSourcePage);
            queryGameDataSourcePage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameDataSourcePage.getPageNo() > queryGameDataSourcePage.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏数据源表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameDataSourceVO> module = gameDataSourceDAO.getPageList(queryGameDataSourcePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameDataSourceServiceImpl called getGameDataSourceList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏数据源表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameDataSourceVO> getgameDataSource(QueryGameDataSourceByPrimaryKey queryGameDataSourceByPrimaryKey){
        ResultDTO<GameDataSourceVO> resultDTO = new ResultDTO<GameDataSourceVO>();
        try{
            GameDataSourceVO gameDataSourceVO = gameDataSourceDAO.getGameDataSourceByPrimaryKey(queryGameDataSourceByPrimaryKey.getSourceId());
            if(null != gameDataSourceVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameDataSourceVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏数据源表对象失败");
            }
        }catch (Exception e){
            log.error("#GameDataSourceServiceImpl called getGameDataSource error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏数据源表对象失败");
        }
        return resultDTO;
    }

}
