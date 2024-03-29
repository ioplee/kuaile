package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]会员金豆账户明细表
**/

@Data
public class MemberGoldenbeanInfoVO implements Serializable {

    private static final long serialVersionUID = -5414148569554959721L;
    /**
    *   明细记录ID
    */
    private Long infoId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   明细类型
    */
    private Integer infoType;
    /**
    *   金豆数值
    */
    private Long benaCounts;
    /**
    *   业务记录ID
    */
    private Long bizId;
    /**
    *   记录状态
    */
    private Integer infpStatus;
}
