package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.OrderGoodsMemberDAO;
import com.hw.bean.PO.OrderGoodsMemberPO;
import com.hw.bean.VO.OrderGoodsMemberVO;
import com.hw.bean.BO.QueryOrderGoodsMemberPage;
import com.hw.bean.BO.QueryOrderGoodsMemberByPrimaryKey;
import com.hw.services.OrderGoodsMemberService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:45
* @description: 玩家购买商品表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class OrderGoodsMemberServiceImpl implements OrderGoodsMemberService{

    @Autowired
    private OrderGoodsMemberDAO orderGoodsMemberDAO;

    @Override
    public BaseResultDTO addOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = orderGoodsMemberDAO.insertOrderGoodsMember(orderGoodsMemberPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加玩家购买商品表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#OrderGoodsMemberServiceImpl called addOrderGoodsMember error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加玩家购买商品表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = orderGoodsMemberDAO.updateOrderGoodsMember(orderGoodsMemberPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改玩家购买商品表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#OrderGoodsMemberServiceImpl called modifyOrderGoodsMember error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改玩家购买商品表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<OrderGoodsMemberVO> getOrderGoodsMemberList(QueryOrderGoodsMemberPage queryOrderGoodsMemberPage){
        BatchResultDTO<OrderGoodsMemberVO> resultDTO = new BatchResultDTO<OrderGoodsMemberVO>();
        try{
            Integer record = orderGoodsMemberDAO.getPageCount(queryOrderGoodsMemberPage);
            queryOrderGoodsMemberPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryOrderGoodsMemberPage.getPageNo() > queryOrderGoodsMemberPage.getTotalPages()){
                resultDTO.setErrorDetail("获取玩家购买商品表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<OrderGoodsMemberVO> module = orderGoodsMemberDAO.getPageList(queryOrderGoodsMemberPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#OrderGoodsMemberServiceImpl called getOrderGoodsMemberList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家购买商品表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<OrderGoodsMemberVO> getorderGoodsMember(QueryOrderGoodsMemberByPrimaryKey queryOrderGoodsMemberByPrimaryKey){
        ResultDTO<OrderGoodsMemberVO> resultDTO = new ResultDTO<OrderGoodsMemberVO>();
        try{
            OrderGoodsMemberVO orderGoodsMemberVO = orderGoodsMemberDAO.getOrderGoodsMemberByPrimaryKey(queryOrderGoodsMemberByPrimaryKey.getOrderId());
            if(null != orderGoodsMemberVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(orderGoodsMemberVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取玩家购买商品表对象失败");
            }
        }catch (Exception e){
            log.error("#OrderGoodsMemberServiceImpl called getOrderGoodsMember error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取玩家购买商品表对象失败");
        }
        return resultDTO;
    }

}
