package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]玩家会员等级表
**/

@Data
public class MemberLevelPlayerVO implements Serializable {

    /**
    *   等级ID
    */
    private Long levelId;
    /**
    *   等级标题
    */
    private String levelTitle;
    /**
    *   所需经验数
    */
    private Integer levelXp;
    /**
    *   升级奖励金豆数
    */
    private Integer levelUpReward;
    /**
    *   充值奖励比例
    */
    private Integer levelCreditCommision;
    /**
    *   签到奖励金豆基数
    */
    private Integer levelSigninMultiples;
    /**
    *   每日救济金豆数
    */
    private Integer levelAlmsBean;
    /**
    *   等级状态
    */
    private Integer levelStatus;
    /**
    *   排序位
    */
    private Integer levelIndex;
}
