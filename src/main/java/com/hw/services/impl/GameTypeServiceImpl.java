package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameTypeDAO;
import com.hw.bean.PO.GameTypePO;
import com.hw.bean.VO.GameTypeVO;
import com.hw.bean.BO.QueryGameTypePage;
import com.hw.bean.BO.QueryGameTypeByPrimaryKey;
import com.hw.services.GameTypeService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 游戏类型表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameTypeServiceImpl implements GameTypeService{

    @Autowired
    private GameTypeDAO gameTypeDAO;

    @Override
    public BaseResultDTO addGameType(GameTypePO gameTypePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameTypeDAO.insertGameType(gameTypePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加游戏类型表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameTypeServiceImpl called addGameType error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加游戏类型表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameType(GameTypePO gameTypePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameTypeDAO.updateGameType(gameTypePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改游戏类型表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameTypeServiceImpl called modifyGameType error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改游戏类型表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameTypeVO> getGameTypeList(QueryGameTypePage queryGameTypePage){
        BatchResultDTO<GameTypeVO> resultDTO = new BatchResultDTO<GameTypeVO>();
        try{
            Integer record = gameTypeDAO.getPageCount(queryGameTypePage);
            queryGameTypePage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameTypePage.getPageNo() > queryGameTypePage.getTotalPages()){
                resultDTO.setErrorDetail("获取游戏类型表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameTypeVO> module = gameTypeDAO.getPageList(queryGameTypePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameTypeServiceImpl called getGameTypeList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏类型表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameTypeVO> getgameType(QueryGameTypeByPrimaryKey queryGameTypeByPrimaryKey){
        ResultDTO<GameTypeVO> resultDTO = new ResultDTO<GameTypeVO>();
        try{
            GameTypeVO gameTypeVO = gameTypeDAO.getGameTypeByPrimaryKey(queryGameTypeByPrimaryKey.getTypeId());
            if(null != gameTypeVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameTypeVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取游戏类型表对象失败");
            }
        }catch (Exception e){
            log.error("#GameTypeServiceImpl called getGameType error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取游戏类型表对象失败");
        }
        return resultDTO;
    }

}
