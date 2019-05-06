package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:10
* @description: [数据库实体BEAN]游戏类型表
**/

@Data
public class GameTypePO implements Serializable {

    /**
    *   类型ID
    */
    private Long typeId;
    /**
    *   类型名称
    */
    private String typeName;
    /**
    *   类型描述
    */
    private String typeSummary;
    /**
    *   游戏介绍
    */
    private String typeContent;
    /**
    *   类型状态
    */
    private Integer typeStatus;
    /**
    *   数据源类型
    */
    private Integer orgType;
    /**
    *   数据源业务编码
    */
    private String orgCode;
}
