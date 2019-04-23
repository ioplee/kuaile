package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:16:13
* @description: [数据库实体BEAN]活动-大转盘抽奖记录表
**/

@Data
public class ActivityLotteryInfoPO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   
    */
    private String infoTime;
    /**
    *   
    */
    private Long optionId;
    /**
    *   
    */
    private Long beanCounts;
    /**
    *   
    */
    private Integer infoStatus;
}
