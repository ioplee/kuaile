package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:06
* @description: [数据库View BEAN]游戏信息表
**/

@Data
public class GameInfoVO implements Serializable {

    private static final long serialVersionUID = -5678411994141423810L;
    /**
    *   游戏ID
    */
    private Long gameId;
    /**
    *   游戏名称
    */
    private String gameName;
    /**
    *   游戏帮助
    */
    private String gameHelp;
    /**
    *   游戏时间
    */
    private String gameTime;
    /**
    *   游戏每期时间间隔
    */
    private Integer gameStep;
    /**
    *   游戏共多少期
    */
    private Integer gameCount;
    /**
    *   游戏每日开始时间
    */
    private String gameBeginTime;
    /**
    *   游戏每日结束时间
    */
    private String gameEdnTime;
    /**
    *   投注范围开始
    */
    private Long gameBetMin;
    /**
    *   投注范围结束
    */
    private Long gameBetMax;
    /**
    *   最高中奖额
    */
    private Long gameWinnerAmount;
    /**
    *   游戏状态
    */
    private Integer gameStatus;
}
