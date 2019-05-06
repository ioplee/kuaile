package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.OrderGoodsPO;
import com.hw.bean.VO.OrderGoodsVO;
import com.hw.bean.BO.QueryOrderGoodsPage;
import com.hw.bean.BO.QueryOrderGoodsByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:31
* @description: 商品表 Service 接口
**/

public interface OrderGoodsService {

    /**
    * Add 商品表 dto.
    *
    * @param orderGoodsPO  商品表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addOrderGoods(OrderGoodsPO orderGoodsPO);

    /**
    * Modify 商品表 dto.
    *
    * @param orderGoodsPO  商品表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyOrderGoods(OrderGoodsPO orderGoodsPO);

    /**
    * Gets OrderGoods info.
    *
    * @param queryOrderGoodsByPrimaryKey the query OrderGoods bean by primary key
    * @return the info
    */
    public ResultDTO<OrderGoodsVO> getorderGoods(QueryOrderGoodsByPrimaryKey queryOrderGoodsByPrimaryKey);

    /**
    * Gets OrderGoods list.
    *
    * @param queryOrderGoodsPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<OrderGoodsVO> getOrderGoodsList(QueryOrderGoodsPage queryOrderGoodsPage);
}
