package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:05
* @description: [数据库View BEAN]大转盘获奖记录表
**/

@Data
public class ActivityLotteryInfoVO implements Serializable {

    /**
    *   中奖记录ID
    */
    private Long infoId;
    /**
    *   中奖会员ID
    */
    private Long memberId;
    /**
    *   中奖时间
    */
    private String infoTime;
    /**
    *   中奖奖项ID
    */
    private Long optionId;
    /**
    *   中奖金豆
    */
    private Long beanCounts;
    /**
    *   记录状态
    */
    private Integer infoStatus;
}
