package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:16:14
* @description: [数据库实体BEAN]会员等级定义表
**/

@Data
public class MemberLevelPO implements Serializable {

    /**
    *   
    */
    private Long levelId;
    /**
    *   
    */
    private String levelTitle;
    /**
    *   
    */
    private Integer levelXp;
    /**
    *   好友升级奖励金豆数，默认0，整数
    */
    private Integer levelUpReward;
    /**
    *   好友充值奖励（抽佣比例）0-100的整数
    */
    private Integer levelCreditCommision;
    /**
    *   
    */
    private Integer levelSigninMultiples;
    /**
    *   等级每日救济金豆数
    */
    private Integer levelAlmsBean;
    /**
    *   -1 删除 0停用 1有效
    */
    private Integer levelStatus;
    /**
    *   为保证排版美观，加排序位。
    */
    private Integer levelIndex;
}
