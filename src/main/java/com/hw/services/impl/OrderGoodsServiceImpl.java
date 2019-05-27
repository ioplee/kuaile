package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.OrderGoodsDAO;
import com.hw.bean.PO.OrderGoodsPO;
import com.hw.bean.VO.OrderGoodsVO;
import com.hw.bean.BO.QueryOrderGoodsPage;
import com.hw.bean.BO.QueryOrderGoodsByPrimaryKey;
import com.hw.services.OrderGoodsService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 商品表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class OrderGoodsServiceImpl implements OrderGoodsService{

    @Autowired
    private OrderGoodsDAO orderGoodsDAO;

    @Override
    public BaseResultDTO addOrderGoods(OrderGoodsPO orderGoodsPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = orderGoodsDAO.insertOrderGoods(orderGoodsPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加商品表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#OrderGoodsServiceImpl called addOrderGoods error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加商品表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyOrderGoods(OrderGoodsPO orderGoodsPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = orderGoodsDAO.updateOrderGoods(orderGoodsPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改商品表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#OrderGoodsServiceImpl called modifyOrderGoods error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改商品表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<OrderGoodsVO> getOrderGoodsList(QueryOrderGoodsPage queryOrderGoodsPage){
        BatchResultDTO<OrderGoodsVO> resultDTO = new BatchResultDTO<OrderGoodsVO>();
        try{
            Integer record = orderGoodsDAO.getPageCount(queryOrderGoodsPage);
            queryOrderGoodsPage.setRecord(record);
            resultDTO.setRecord(record);
            List<OrderGoodsVO> module = orderGoodsDAO.getPageList(queryOrderGoodsPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#OrderGoodsServiceImpl called getOrderGoodsList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取商品表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setOrderGoodsStatus(OrderGoodsPO orderGoodsPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = orderGoodsDAO.setOrderGoodsStatus(orderGoodsPO.getGoodsId(),orderGoodsPO.getGoodsStatus());
            if (number == 1){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("设置商品状态失败");
            }
        }catch (Exception e){
            log.error("#OrderGoodsServiceImpl called setOrderGoodsStatus error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("设置商品状态出错");
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<OrderGoodsVO> getorderGoods(QueryOrderGoodsByPrimaryKey queryOrderGoodsByPrimaryKey){
        ResultDTO<OrderGoodsVO> resultDTO = new ResultDTO<OrderGoodsVO>();
        try{
            OrderGoodsVO orderGoodsVO = orderGoodsDAO.getOrderGoodsByPrimaryKey(queryOrderGoodsByPrimaryKey.getGoodsId());
            if(null != orderGoodsVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(orderGoodsVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取商品表对象失败");
            }
        }catch (Exception e){
            log.error("#OrderGoodsServiceImpl called getOrderGoods error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取商品表对象失败");
        }
        return resultDTO;
    }

}
