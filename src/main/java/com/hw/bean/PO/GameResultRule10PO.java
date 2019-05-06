package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:10
* @description: [数据库实体BEAN]游戏开奖结果-群数第一位 10
**/

@Data
public class GameResultRule10PO implements Serializable {

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
    *   规则类型
    */
    private Integer ruleType;
    /**
    *   第1个数值
    */
    private Integer value1;
    /**
    *   第2个数值
    */
    private Integer value2;
    /**
    *   第三个数字
    */
    private Integer value3;
    /**
    *   第四个数字
    */
    private Integer value4;
    /**
    *   第五个数字
    */
    private Integer value5;
    /**
    *   第六个数字
    */
    private Integer value6;
    /**
    *   第七个数字
    */
    private Integer value7;
    /**
    *   第八个数字
    */
    private Integer value8;
    /**
    *   第九个数字
    */
    private Integer value9;
    /**
    *   第十个数字
    */
    private Integer value10;
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
