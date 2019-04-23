package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]会员 金豆账户和虚拟银行账户之间转换记录
**/

@Data
public class MemberAccountChangeVO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   1 金豆存入银行账户
            2 从银行账户取金豆
    */
    private Integer infoType;
    /**
    *   
    */
    private Long changeCounts;
    /**
    *   
    */
    private Integer infoStatus;
    /**
    *   
    */
    private String infoTime;
    /**
    *   
    */
    private String infoDesc;
}
