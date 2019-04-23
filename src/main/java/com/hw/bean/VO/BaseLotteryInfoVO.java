package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]平台提供的各种福利活动列表
**/

@Data
public class BaseLotteryInfoVO implements Serializable {

    /**
    *   
    */
    private Long lotteryId;
    /**
    *   
    */
    private String lotteryTitle;
    /**
    *   
    */
    private String lotteryContent;
    /**
    *   
    */
    private String beginDate;
    /**
    *   
    */
    private String endDate;
    /**
    *   
    */
    private String imgUrl;
    /**
    *   -1全体会员
            0 p0会员及以上
            1 p1会员及以
            2 p2会员及以
            3 p3会员及以
            4 p4会员及以
            5 p5会员及以
            6 p6会员及以
            7 p7会员及以
    */
    private Integer targetMember;
    /**
    *   -1删除 0停用 1有效
    */
    private Integer lotteryStatus;
}
