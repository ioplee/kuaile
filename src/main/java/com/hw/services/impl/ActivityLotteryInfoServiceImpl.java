package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.ActivityLotteryInfoDAO;
import com.hw.bean.PO.ActivityLotteryInfoPO;
import com.hw.bean.VO.ActivityLotteryInfoVO;
import com.hw.bean.BO.QueryActivityLotteryInfoPage;
import com.hw.bean.BO.QueryActivityLotteryInfoByPrimaryKey;
import com.hw.services.ActivityLotteryInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 大转盘获奖记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class ActivityLotteryInfoServiceImpl implements ActivityLotteryInfoService{

    @Autowired
    private ActivityLotteryInfoDAO activityLotteryInfoDAO;

    @Override
    public BaseResultDTO addActivityLotteryInfo(ActivityLotteryInfoPO activityLotteryInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = activityLotteryInfoDAO.insertActivityLotteryInfo(activityLotteryInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加大转盘获奖记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#ActivityLotteryInfoServiceImpl called addActivityLotteryInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加大转盘获奖记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyActivityLotteryInfo(ActivityLotteryInfoPO activityLotteryInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = activityLotteryInfoDAO.updateActivityLotteryInfo(activityLotteryInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改大转盘获奖记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#ActivityLotteryInfoServiceImpl called modifyActivityLotteryInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改大转盘获奖记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<ActivityLotteryInfoVO> getActivityLotteryInfoList(QueryActivityLotteryInfoPage queryActivityLotteryInfoPage){
        BatchResultDTO<ActivityLotteryInfoVO> resultDTO = new BatchResultDTO<ActivityLotteryInfoVO>();
        try{
            Integer record = activityLotteryInfoDAO.getPageCount(queryActivityLotteryInfoPage);
            queryActivityLotteryInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryActivityLotteryInfoPage.getPageNo() > queryActivityLotteryInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取大转盘获奖记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<ActivityLotteryInfoVO> module = activityLotteryInfoDAO.getPageList(queryActivityLotteryInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#ActivityLotteryInfoServiceImpl called getActivityLotteryInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取大转盘获奖记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<ActivityLotteryInfoVO> getactivityLotteryInfo(QueryActivityLotteryInfoByPrimaryKey queryActivityLotteryInfoByPrimaryKey){
        ResultDTO<ActivityLotteryInfoVO> resultDTO = new ResultDTO<ActivityLotteryInfoVO>();
        try{
            ActivityLotteryInfoVO activityLotteryInfoVO = activityLotteryInfoDAO.getActivityLotteryInfoByPrimaryKey(queryActivityLotteryInfoByPrimaryKey.getInfoId());
            if(null != activityLotteryInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(activityLotteryInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取大转盘获奖记录表对象失败");
            }
        }catch (Exception e){
            log.error("#ActivityLotteryInfoServiceImpl called getActivityLotteryInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取大转盘获奖记录表对象失败");
        }
        return resultDTO;
    }

}
