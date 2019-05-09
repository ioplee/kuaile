package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:12:28
* @description: [数据库实体BEAN]游戏开奖结果-三数求和-16
**/

@Data
public class GameResultRule29PO implements Serializable {

    /**
    *   出奖记录ID
    */
    private Long recordId;
    /**
    *   游戏类型ID
    */
    private Long gameTypeId;
    /**
    *   游戏ID
    */
    private Long gameId;
    /**
    *   游戏期数ID
    */
    private Long gamePhaseId;
    /**
    *   游戏日期
    */
    private String gameDate;
    /**
    *   第一组数值
    */
    private Integer groupValue1;
    /**
    *   第二组数值
    */
    private Integer groupValue2;
    /**
    *   第三组数值
    */
    private Integer groupValue3;
    /**
    *   和数
    */
    private Integer groupSumValue;
    /**
    *   记录状态
    */
    private Integer recordStatus;
    /**
    *   最后修改时间
    */
    private String gmtModify;
}
