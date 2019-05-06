package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:06
* @description: [数据库View BEAN]玩家投注表
**/

@Data
public class GamePlayerBettingVO implements Serializable {

    private static final long serialVersionUID = -2575962959354643577L;
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
