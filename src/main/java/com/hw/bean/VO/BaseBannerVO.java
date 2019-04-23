package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]系统banner图片维护
**/

@Data
public class BaseBannerVO implements Serializable {

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
