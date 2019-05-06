package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:06
* @description: [数据库View BEAN]会员金豆和银行账户转账记录
**/

@Data
public class MemberAccountChangeVO implements Serializable {

    /**
    *   记录ID
    */
    private Long infoId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   记录类型
    */
    private Integer infoType;
    /**
    *   变动金豆数
    */
    private Long changeCounts;
    /**
    *   记录状态
    */
    private Integer infoStatus;
    /**
    *   记录时间
    */
    private String infoTime;
    /**
    *   备注
    */
    private String infoDesc;
}
