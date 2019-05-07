package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.BaseLotteryInfoDAO;
import com.hw.bean.PO.BaseLotteryInfoPO;
import com.hw.bean.VO.BaseLotteryInfoVO;
import com.hw.bean.BO.QueryBaseLotteryInfoPage;
import com.hw.bean.BO.QueryBaseLotteryInfoByPrimaryKey;
import com.hw.services.BaseLotteryInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:44
* @description: 玩家福利列表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class BaseLotteryInfoServiceImpl implements BaseLotteryInfoService{

    @Autowired
    private BaseLotteryInfoDAO baseLotteryInfoDAO;

    @Override
    public BaseResultDTO addBaseLotteryInfo(BaseLotteryInfoPO baseLotteryInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = baseLotteryInfoDAO.insertBaseLotteryInfo(baseLotteryInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加玩家福利列表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#BaseLotteryInfoServiceImpl called addBaseLotteryInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加玩家福利列表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyBaseLotteryInfo(BaseLotteryInfoPO baseLotteryInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = baseLotteryInfoDAO.updateBaseLotteryInfo(baseLotteryInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改玩家福利列表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#BaseLotteryInfoServiceImpl called modifyBaseLotteryInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改玩家福利列表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<BaseLotteryInfoVO> getBaseLotteryInfoList(QueryBaseLotteryInfoPage queryBaseLotteryInfoPage){
        BatchResultDTO<BaseLotteryInfoVO> resultDTO = new BatchResultDTO<BaseLotteryInfoVO>();
        try{
            Integer record = baseLotteryInfoDAO.getPageCount(queryBaseLotteryInfoPage);
            queryBaseLotteryInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryBaseLotteryInfoPage.getPageNo() > queryBaseLotteryInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取玩家福利列表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<BaseLotteryInfoVO> module = baseLotteryInfoDAO.getPageList(queryBaseLotteryInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#BaseLotteryInfoServiceImpl called getBaseLotteryInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家福利列表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<BaseLotteryInfoVO> getbaseLotteryInfo(QueryBaseLotteryInfoByPrimaryKey queryBaseLotteryInfoByPrimaryKey){
        ResultDTO<BaseLotteryInfoVO> resultDTO = new ResultDTO<BaseLotteryInfoVO>();
        try{
            BaseLotteryInfoVO baseLotteryInfoVO = baseLotteryInfoDAO.getBaseLotteryInfoByPrimaryKey(queryBaseLotteryInfoByPrimaryKey.getLotteryId());
            if(null != baseLotteryInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(baseLotteryInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取玩家福利列表对象失败");
            }
        }catch (Exception e){
            log.error("#BaseLotteryInfoServiceImpl called getBaseLotteryInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家福利列表对象失败");
        }
        return resultDTO;
    }

}
