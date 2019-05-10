package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]会员经验值明细表
**/

@Data
public class MemberXpInfoVO implements Serializable {

    private static final long serialVersionUID = -4477569764499285899L;
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
