package com.hw.services.impl;

import com.github.pagehelper.Page;
import com.hw.biz.dao.OrderDAO;
import com.hw.biz.model.OrderDO;
import com.hw.services.AgentServices;
import com.hw.services.OrderServices;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OrderServicesImpl implements OrderServices {

    @Resource
    private OrderDAO orderDAO;

    @Resource
    private AgentServices agentServices;

    @Override
    public Page<OrderDO> findOrderByPage(Map<String, String> params, int pageNo, int pageSize) {
        return null;
    }

    @Override
    public List<OrderDO> findOrderByParams(Map<String, String> params) {
        return null;
    }

    @Override
    public List<OrderDO> findOrderByUserId(Long userId) {
        return null;
    }

    @Override
    public Long calculateFlowNum(Integer period, Long userId) {
        return null;
    }

    @Override
    public Long calculateLossNum(Integer period, Long userId) {
        return null;
    }

    @Override
    public void bet(List<Long> orderIds) {

    }

    @Override
    public void bet(OrderDO orderDO) {

    }

    @Override
    @Transactional
    public void payCallback(String orderIds, Integer paymentChannel, String channelOrderId) {
        String[] orderIdsArray = orderIds.split(",");
        OrderDO tempOrderDO = null;
        for(String tempId : orderIdsArray) {
            tempOrderDO = orderDAO.findOrderById(new Long(tempId));
            agentServices.payCommission(tempOrderDO);
            orderDAO.update(tempOrderDO);
            tempOrderDO = null;
        }
    }

}
