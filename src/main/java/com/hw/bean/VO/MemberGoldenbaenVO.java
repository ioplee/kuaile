package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]会员金豆账户表
**/

@Data
public class MemberGoldenbaenVO implements Serializable {

    private static final long serialVersionUID = 2141532142689494496L;
    /**
    *   记录ID
    */
    private Long beanId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   金豆总数
    */
    private Long beanCount;
    /**
    *   账户状态
    */
    private Integer beanStatus;
}
