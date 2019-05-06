package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:06
* @description: [数据库View BEAN]banner广告图
**/

@Data
public class BaseBannerVO implements Serializable {

    private static final long serialVersionUID = 8977338256354661084L;
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
