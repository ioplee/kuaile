package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:07
* @description: [数据库View BEAN]会员经验值明细表
**/

@Data
public class MemberXpInfoVO implements Serializable {

    /**
    *   明细记录ID
    */
    private Long infoId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   经验类型
    */
    private Integer xpType;
    /**
    *   经验值
    */
    private Integer xpValue;
    /**
    *   获取日期
    */
    private String xpGettime;
    /**
    *   记录状态
    */
    private Integer infoStatus;
}
