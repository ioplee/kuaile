package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:04
* @description: [数据库View BEAN]大转盘配置表
**/

@Data
public class ActivityLotteryVO implements Serializable {

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
