package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:09
* @description: [数据库实体BEAN]大转盘配置表
**/

@Data
public class ActivityLotteryPO implements Serializable {

    private static final long serialVersionUID = -5074872345614693503L;
    /**
    *   奖项ID
    */
    private Long itemId;
    /**
    *   奖项名称
    */
    private String itemTitle;
    /**
    *   奖项图片
    */
    private String itemImgUrl;
    /**
    *   奖项金豆数
    */
    private Long itemBeanCounts;
    /**
    *   中奖几率
    */
    private Integer itemProbability;
    /**
    *   记录状态
    */
    private Integer itemStatus;
}
