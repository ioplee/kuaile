package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]大转盘定义表
**/

@Data
public class ActivityLotteryVO implements Serializable {

    /**
    *   
    */
    private Long itemId;
    /**
    *   
    */
    private String itemTitle;
    /**
    *   
    */
    private String itemImgUrl;
    /**
    *   
    */
    private Long itemBeanCounts;
    /**
    *   中奖几率 0-100,0表示不会中，100代表肯定中
    */
    private Integer itemProbability;
    /**
    *   -1 删除 0停用 1有效
    */
    private Integer itemStatus;
}
