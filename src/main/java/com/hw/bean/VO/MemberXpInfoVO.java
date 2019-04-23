package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:20
* @description: [数据库View BEAN]会员获取经验值明细表
**/

@Data
public class MemberXpInfoVO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   1、充值 加经验值（1元加1经验值）
            2、 经验值兑换金豆 减经验值（1经验值兑换1金豆）
            一期暂时按固定比例，后续完善时改成按配置计算
    */
    private Integer xpType;
    /**
    *   
    */
    private Integer xpValue;
    /**
    *   
    */
    private String xpGettime;
    /**
    *   
    */
    private Integer infoStatus;
}
