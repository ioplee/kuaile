package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:12:27
* @description: [数据库实体BEAN]游戏投注项
**/

@Data
public class GameInfoOptionsPO implements Serializable {

    private static final long serialVersionUID = 1173957209514231849L;
    /**
    *   选项ID
    */
    private Long optionId;
    /**
    *   选项标题
    */
    private String optionTitle;
    /**
    *   选项值
    */
    private Integer optionValue;
    /**
    *   标准赔率
    */
    private Integer optionOdds;
    /**
    *   选项状态
    */
    private Integer optionStatus;
    /**
    *   游戏ID
    */
    private Long 游戏ID;
    /**
    *   
    */
    private Long optionMaxValue;
}
