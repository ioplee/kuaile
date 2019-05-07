package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GamePhaseDAO;
import com.hw.bean.PO.GamePhasePO;
import com.hw.bean.VO.GamePhaseVO;
import com.hw.bean.BO.QueryGamePhasePage;
import com.hw.bean.BO.QueryGamePhaseByPrimaryKey;
import com.hw.services.GamePhaseService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 游戏期数信息 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GamePhaseServiceImpl implements GamePhaseService{

    @Autowired
    private GamePhaseDAO gamePhaseDAO;

    @Override
    public BaseResultDTO addGamePhase(GamePhasePO gamePhasePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gamePhaseDAO.insertGamePhase(gamePhasePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏期数信息信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GamePhaseServiceImpl called addGamePhase error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏期数信息出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGamePhase(GamePhasePO gamePhasePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gamePhaseDAO.updateGamePhase(gamePhasePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏期数信息信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GamePhaseServiceImpl called modifyGamePhase error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏期数信息出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GamePhaseVO> getGamePhaseList(QueryGamePhasePage queryGamePhasePage){
        BatchResultDTO<GamePhaseVO> resultDTO = new BatchResultDTO<GamePhaseVO>();
        try{
            Integer record = gamePhaseDAO.getPageCount(queryGamePhasePage);
            queryGamePhasePage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGamePhasePage.getPageNo() > queryGamePhasePage.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏期数信息列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GamePhaseVO> module = gamePhaseDAO.getPageList(queryGamePhasePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GamePhaseServiceImpl called getGamePhaseList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏期数信息列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GamePhaseVO> getgamePhase(QueryGamePhaseByPrimaryKey queryGamePhaseByPrimaryKey){
        ResultDTO<GamePhaseVO> resultDTO = new ResultDTO<GamePhaseVO>();
        try{
            GamePhaseVO gamePhaseVO = gamePhaseDAO.getGamePhaseByPrimaryKey(queryGamePhaseByPrimaryKey.getPhaseId());
            if(null != gamePhaseVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gamePhaseVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏期数信息对象失败");
            }
        }catch (Exception e){
            log.error("#GamePhaseServiceImpl called getGamePhase error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏期数信息对象失败");
        }
        return resultDTO;
    }

}
