package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:16:14
* @description: [数据库实体BEAN]系统banner图片维护
**/

@Data
public class BaseBannerPO implements Serializable {

    /**
    *   
    */
    private Long bannerId;
    /**
    *   
    */
    private String bannerUrl;
    /**
    *   
    */
    private String bannerLinks;
    /**
    *   
    */
    private Integer bannerIndex;
    /**
    *   
    */
    private Integer bannerStatus;
}
