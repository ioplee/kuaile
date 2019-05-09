package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.BaseBannerDAO;
import com.hw.bean.PO.BaseBannerPO;
import com.hw.bean.VO.BaseBannerVO;
import com.hw.bean.BO.QueryBaseBannerPage;
import com.hw.bean.BO.QueryBaseBannerByPrimaryKey;
import com.hw.services.BaseBannerService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: banner广告图 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class BaseBannerServiceImpl implements BaseBannerService{

    @Autowired
    private BaseBannerDAO baseBannerDAO;

    @Override
    public BaseResultDTO addBaseBanner(BaseBannerPO baseBannerPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = baseBannerDAO.insertBaseBanner(baseBannerPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加banner广告图信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#BaseBannerServiceImpl called addBaseBanner error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加banner广告图出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyBaseBanner(BaseBannerPO baseBannerPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = baseBannerDAO.updateBaseBanner(baseBannerPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改banner广告图信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#BaseBannerServiceImpl called modifyBaseBanner error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改banner广告图出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<BaseBannerVO> getBaseBannerList(QueryBaseBannerPage queryBaseBannerPage){
        BatchResultDTO<BaseBannerVO> resultDTO = new BatchResultDTO<BaseBannerVO>();
        try{
            Integer record = baseBannerDAO.getPageCount(queryBaseBannerPage);
            queryBaseBannerPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryBaseBannerPage.getPageNo() > queryBaseBannerPage.getTotalPages()){
                resultDTO.setErrorDetail("获取banner广告图列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<BaseBannerVO> module = baseBannerDAO.getPageList(queryBaseBannerPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#BaseBannerServiceImpl called getBaseBannerList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取banner广告图列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<BaseBannerVO> getbaseBanner(QueryBaseBannerByPrimaryKey queryBaseBannerByPrimaryKey){
        ResultDTO<BaseBannerVO> resultDTO = new ResultDTO<BaseBannerVO>();
        try{
            BaseBannerVO baseBannerVO = baseBannerDAO.getBaseBannerByPrimaryKey(queryBaseBannerByPrimaryKey.getBannerId());
            if(null != baseBannerVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(baseBannerVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取banner广告图对象失败");
            }
        }catch (Exception e){
            log.error("#BaseBannerServiceImpl called getBaseBanner error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取banner广告图对象失败");
        }
        return resultDTO;
    }

}
