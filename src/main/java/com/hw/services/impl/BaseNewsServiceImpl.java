package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.BaseNewsDAO;
import com.hw.bean.PO.BaseNewsPO;
import com.hw.bean.VO.BaseNewsVO;
import com.hw.bean.BO.QueryBaseNewsPage;
import com.hw.bean.BO.QueryBaseNewsByPrimaryKey;
import com.hw.services.BaseNewsService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:49
* @description: 新闻公告表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class BaseNewsServiceImpl implements BaseNewsService{

    @Autowired
    private BaseNewsDAO baseNewsDAO;

    @Override
    public BaseResultDTO addBaseNews(BaseNewsPO baseNewsPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = baseNewsDAO.insertBaseNews(baseNewsPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加新闻公告表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#BaseNewsServiceImpl called addBaseNews error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加新闻公告表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyBaseNews(BaseNewsPO baseNewsPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = baseNewsDAO.updateBaseNews(baseNewsPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改新闻公告表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#BaseNewsServiceImpl called modifyBaseNews error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改新闻公告表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<BaseNewsVO> getBaseNewsList(QueryBaseNewsPage queryBaseNewsPage){
        BatchResultDTO<BaseNewsVO> resultDTO = new BatchResultDTO<BaseNewsVO>();
        try{
            Integer record = baseNewsDAO.getPageCount(queryBaseNewsPage);
            queryBaseNewsPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryBaseNewsPage.getPageNo() > queryBaseNewsPage.getTotalPages()){
                resultDTO.setErrorDetail("获取新闻公告表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<BaseNewsVO> module = baseNewsDAO.getPageList(queryBaseNewsPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#BaseNewsServiceImpl called getBaseNewsList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取新闻公告表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<BaseNewsVO> getbaseNews(QueryBaseNewsByPrimaryKey queryBaseNewsByPrimaryKey){
        ResultDTO<BaseNewsVO> resultDTO = new ResultDTO<BaseNewsVO>();
        try{
            BaseNewsVO baseNewsVO = baseNewsDAO.getBaseNewsByPrimaryKey(queryBaseNewsByPrimaryKey.getNewsId());
            if(null != baseNewsVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(baseNewsVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取新闻公告表对象失败");
            }
        }catch (Exception e){
            log.error("#BaseNewsServiceImpl called getBaseNews error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取新闻公告表对象失败");
        }
        return resultDTO;
    }

}
