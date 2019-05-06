package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:07
* @description: [数据库View BEAN]商品表
**/

@Data
public class OrderGoodsVO implements Serializable {

    private static final long serialVersionUID = 6028681525925022346L;
    /**
    *   商品ID
    */
    private Long goodsId;
    /**
    *   商品分类ID
    */
    private Integer goodsType;
    /**
    *   商品名称
    */
    private String goodsName;
    /**
    *   商品金额
    */
    private Long goodsPrice;
    /**
    *   商品图片
    */
    private String goodsImgUrl;
    /**
    *   商品价格（金豆数）
    */
    private Long goodsBeans;
    /**
    *   奖品说明
    */
    private String goodsDesc;
    /**
    *   等级价格p0
    */
    private Long p0Beans;
    /**
    *   等级价格p1
    */
    private Long p1Beans;
    /**
    *   等级价格p2
    */
    private Long p2Beans;
    /**
    *   等级价格p3
    */
    private Long p3Beans;
    /**
    *   等级价格p4
    */
    private Long p4Beans;
    /**
    *   等级价格p5
    */
    private Long p5Beans;
    /**
    *   等级价格p6
    */
    private Long p6Beans;
    /**
    *   等级价格p7
    */
    private Long p7Beans;
    /**
    *   商品状态
    */
    private Integer goodsStatus;
    /**
    *   商品数量
    */
    private Long goodsAmount;
    /**
    *   是否推荐商品
    */
    private Integer recommend;
}
