package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:12:27
* @description: [数据库实体BEAN]玩家投注表
**/

@Data
public class GamePlayerBettingPO implements Serializable {

    private static final long serialVersionUID = 5242426805253905363L;
    /**
    *   投注记录ID
    */
    private Long bettingId;
    /**
    *   游戏ID
    */
    private Long gameId;
    /**
    *   玩家ID
    */
    private Long playerId;
    /**
    *   游戏期数
    */
    private Long gamePhase;
    /**
    *   游戏选项ID
    */
    private Long optionId;
    /**
    *   投注金豆
    */
    private Long bettingAmount;
    /**
    *   记录状态
    */
    private Integer bettingStatus;
    /**
    *   最后修改时间
    */
    private String gmtModify;
}
