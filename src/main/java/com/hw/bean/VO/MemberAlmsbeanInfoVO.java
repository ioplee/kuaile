package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP
**/

@Data
public class MemberAlmsbeanInfoVO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   
    */
    private String getDate;
    /**
    *   
    */
    private Long beanCounts;
    /**
    *   
    */
    private Integer infoStatus;
}
