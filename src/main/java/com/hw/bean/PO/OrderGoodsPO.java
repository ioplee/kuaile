package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:16:14
* @description: [数据库实体BEAN]平台商品表（用于金豆和资金转换）
**/

@Data
public class OrderGoodsPO implements Serializable {

    /**
    *   
    */
    private Long goodsId;
    /**
    *   1 家用电器
            2 虚拟点卡
            3 手机数码
    */
    private Integer goodsType;
    /**
    *   
    */
    private String goodsName;
    /**
    *   
    */
    private Long goodsPrice;
    /**
    *   
    */
    private String goodsImgUrl;
    /**
    *   
    */
    private Long goodsBeans;
    /**
    *   
    */
    private String goodsDesc;
    /**
    *   
    */
    private Long p0Beans;
    /**
    *   
    */
    private Long p1Beans;
    /**
    *   
    */
    private Long p2Beans;
    /**
    *   
    */
    private Long p3Beans;
    /**
    *   
    */
    private Long p4Beans;
    /**
    *   
    */
    private Long p5Beans;
    /**
    *   
    */
    private Long p6Beans;
    /**
    *   
    */
    private Long p7Beans;
    /**
    *   
    */
    private Integer goodsStatus;
    /**
    *   
    */
    private Long goodsAmount;
    /**
    *   是否推荐商品0不是1推荐商品
    */
    private Integer recommend;
}
