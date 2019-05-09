package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.OrderGoodsMemberPO;
import com.hw.bean.VO.OrderGoodsMemberVO;
import com.hw.bean.BO.QueryOrderGoodsMemberPage;
import com.hw.bean.BO.QueryOrderGoodsMemberByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:41
* @description: 玩家购买商品表 Service 接口
**/

public interface OrderGoodsMemberService {

    /**
    * Add 玩家购买商品表 dto.
    *
    * @param orderGoodsMemberPO  玩家购买商品表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO);

    /**
    * Modify 玩家购买商品表 dto.
    *
    * @param orderGoodsMemberPO  玩家购买商品表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO);

    /**
    * Gets OrderGoodsMember info.
    *
    * @param queryOrderGoodsMemberByPrimaryKey the query OrderGoodsMember bean by primary key
    * @return the info
    */
    public ResultDTO<OrderGoodsMemberVO> getorderGoodsMember(QueryOrderGoodsMemberByPrimaryKey queryOrderGoodsMemberByPrimaryKey);

    /**
    * Gets OrderGoodsMember list.
    *
    * @param queryOrderGoodsMemberPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<OrderGoodsMemberVO> getOrderGoodsMemberList(QueryOrderGoodsMemberPage queryOrderGoodsMemberPage);
}
