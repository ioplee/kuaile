package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:12:27
* @description: [数据库实体BEAN]代理商金豆明细表
**/

@Data
public class AgentGoldenbeanInfoPO implements Serializable {

    private static final long serialVersionUID = -4180279205584213252L;
    /**
    *   明细记录ID
    */
    private Long infoId;
    /**
    *   代理商iD
    */
    private Long agentId;
    /**
    *   记录类型(1平台给代理商上分 2平台给代理商下分 3代理商给玩家上分联动下分)
    */
    private Integer infoType;
    /**
    *   金豆数值
    */
    private Long beanCounts;
    /**
    *   业务记录ID
    */
    private Long bizId;
    /**
    *   记录状态
    */
    private Integer infoStatus;
    /**
    *   基础金豆数
    */
    private Long baseCounts;
    /**
    *   返点金豆数
    */
    private Long rebateCounts;
}
