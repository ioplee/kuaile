package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:13:04
* @description: [数据库View BEAN]代理商金豆明细表
**/

@Data
public class AgentGoldenbeanInfoVO implements Serializable {

    private static final long serialVersionUID = -6561589173904286648L;
    /**
    *   明细记录ID
    */
    private Long infoId;
    /**
    *   代理商iD
    */
    private Long agentId;
    /**
    *   记录类型(1代理商上分增加记录 2代理商下分扣减记录 3代理商给玩家上分扣减)
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
    *   记录状态(-1删除 0停用 1有效)
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
