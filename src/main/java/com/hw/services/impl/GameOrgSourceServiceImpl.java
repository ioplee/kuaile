package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.GameOrgSourceDAO;
import com.hw.bean.PO.GameOrgSourcePO;
import com.hw.bean.VO.GameOrgSourceVO;
import com.hw.bean.BO.QueryGameOrgSourcePage;
import com.hw.bean.BO.QueryGameOrgSourceByPrimaryKey;
import com.hw.services.GameOrgSourceService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 开奖数据源记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class GameOrgSourceServiceImpl implements GameOrgSourceService{

    @Autowired
    private GameOrgSourceDAO gameOrgSourceDAO;

    @Override
    public BaseResultDTO addGameOrgSource(GameOrgSourcePO gameOrgSourcePO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = gameOrgSourceDAO.insertGameOrgSource(gameOrgSourcePO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加开奖数据源记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameOrgSourceServiceImpl called addGameOrgSource error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加开奖数据源记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyGameOrgSource(GameOrgSourcePO gameOrgSourcePO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = gameOrgSourceDAO.updateGameOrgSource(gameOrgSourcePO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改开奖数据源记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#GameOrgSourceServiceImpl called modifyGameOrgSource error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改开奖数据源记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<GameOrgSourceVO> getGameOrgSourceList(QueryGameOrgSourcePage queryGameOrgSourcePage){
        BatchResultDTO<GameOrgSourceVO> resultDTO = new BatchResultDTO<GameOrgSourceVO>();
        try{
            Integer record = gameOrgSourceDAO.getPageCount(queryGameOrgSourcePage);
            queryGameOrgSourcePage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryGameOrgSourcePage.getPageNo() > queryGameOrgSourcePage.getTotalPages()){
                resultDTO.setErrorDetail("获取开奖数据源记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<GameOrgSourceVO> module = gameOrgSourceDAO.getPageList(queryGameOrgSourcePage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#GameOrgSourceServiceImpl called getGameOrgSourceList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取开奖数据源记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<GameOrgSourceVO> getgameOrgSource(QueryGameOrgSourceByPrimaryKey queryGameOrgSourceByPrimaryKey){
        ResultDTO<GameOrgSourceVO> resultDTO = new ResultDTO<GameOrgSourceVO>();
        try{
            GameOrgSourceVO gameOrgSourceVO = gameOrgSourceDAO.getGameOrgSourceByPrimaryKey(queryGameOrgSourceByPrimaryKey.getRecordId());
            if(null != gameOrgSourceVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(gameOrgSourceVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取开奖数据源记录表对象失败");
            }
        }catch (Exception e){
            log.error("#GameOrgSourceServiceImpl called getGameOrgSource error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取开奖数据源记录表对象失败");
        }
        return resultDTO;
    }

}
