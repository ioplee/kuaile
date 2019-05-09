package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:05
* @description: [数据库View BEAN]游戏数据源表
**/

@Data
public class GameDataSourceVO implements Serializable {

    /**
    *   数据源ID
    */
    private Long sourceId;
    /**
    *   数据源名称
    */
    private String sourceName;
    /**
    *   数据源描述
    */
    private String sourceDesc;
    /**
    *   数据源刷新数据周期，每期开奖时间间隔
    */
    private Integer sourceStepTime;
    /**
    *   每天开始时间
    */
    private String sourceStartTime;
    /**
    *   每天结束时间
    */
    private String sourceEndTime;
    /**
    *   数据源状态-1删除 0停用 1有效
    */
    private Integer sourceStatus;
}
