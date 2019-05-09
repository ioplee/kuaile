package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:05
* @description: [数据库View BEAN]开奖数据源记录表
**/

@Data
public class GameOrgSourceVO implements Serializable {

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
