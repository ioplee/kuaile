package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]活动-大转盘抽奖记录表
**/

@Data
public class ActivityLotteryInfoVO implements Serializable {

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
