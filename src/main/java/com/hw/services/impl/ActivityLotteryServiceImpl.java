package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.ActivityLotteryDAO;
import com.hw.bean.PO.ActivityLotteryPO;
import com.hw.bean.VO.ActivityLotteryVO;
import com.hw.bean.BO.QueryActivityLotteryPage;
import com.hw.bean.BO.QueryActivityLotteryByPrimaryKey;
import com.hw.services.ActivityLotteryService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:43
* @description: 大转盘配置表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class ActivityLotteryServiceImpl implements ActivityLotteryService{

    @Autowired
    private ActivityLotteryDAO activityLotteryDAO;

    @Override
    public BaseResultDTO addActivityLottery(ActivityLotteryPO activityLotteryPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = activityLotteryDAO.insertActivityLottery(activityLotteryPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加大转盘配置表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#ActivityLotteryServiceImpl called addActivityLottery error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加大转盘配置表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyActivityLottery(ActivityLotteryPO activityLotteryPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = activityLotteryDAO.updateActivityLottery(activityLotteryPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改大转盘配置表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#ActivityLotteryServiceImpl called modifyActivityLottery error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改大转盘配置表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<ActivityLotteryVO> getActivityLotteryList(QueryActivityLotteryPage queryActivityLotteryPage){
        BatchResultDTO<ActivityLotteryVO> resultDTO = new BatchResultDTO<ActivityLotteryVO>();
        try{
            Integer record = activityLotteryDAO.getPageCount(queryActivityLotteryPage);
            queryActivityLotteryPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryActivityLotteryPage.getPageNo() > queryActivityLotteryPage.getTotalPages()){
                resultDTO.setErrorDetail("获取大转盘配置表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<ActivityLotteryVO> module = activityLotteryDAO.getPageList(queryActivityLotteryPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#ActivityLotteryServiceImpl called getActivityLotteryList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取大转盘配置表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<ActivityLotteryVO> getactivityLottery(QueryActivityLotteryByPrimaryKey queryActivityLotteryByPrimaryKey){
        ResultDTO<ActivityLotteryVO> resultDTO = new ResultDTO<ActivityLotteryVO>();
        try{
            ActivityLotteryVO activityLotteryVO = activityLotteryDAO.getActivityLotteryByPrimaryKey(queryActivityLotteryByPrimaryKey.getItemId());
            if(null != activityLotteryVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(activityLotteryVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取大转盘配置表对象失败");
            }
        }catch (Exception e){
            log.error("#ActivityLotteryServiceImpl called getActivityLottery error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取大转盘配置表对象失败");
        }
        return resultDTO;
    }

}
