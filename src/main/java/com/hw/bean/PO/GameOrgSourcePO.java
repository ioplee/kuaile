package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:12:27
* @description: [数据库实体BEAN]开奖数据源记录表
**/

@Data
public class GameOrgSourcePO implements Serializable {

    private static final long serialVersionUID = -4671713580049479915L;
    /**
    *   记录ID
    */
    private Long recordId;
    /**
    *   游戏类型ID
    */
    private Long gameOrgId;
    /**
    *   数据数值
    */
    private Integer orgValue;
    /**
    *   数据顺序
    */
    private Integer orgIndex;
    /**
    *   数据组别
    */
    private Integer orgGroup;
    /**
    *   最后修改时间
    */
    private String gmtModify;
}
