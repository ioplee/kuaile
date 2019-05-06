package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:10
* @description: [数据库实体BEAN]banner广告图
**/

@Data
public class BaseBannerPO implements Serializable {

    /**
    *   图片ID
    */
    private Long bannerId;
    /**
    *   图片地址
    */
    private String bannerUrl;
    /**
    *   图片链接配置
    */
    private String bannerLinks;
    /**
    *   图片排序位
    */
    private Integer bannerIndex;
    /**
    *   图片状态
    */
    private Integer bannerStatus;
}
