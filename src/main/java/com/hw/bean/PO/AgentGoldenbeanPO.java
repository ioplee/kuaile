package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-07 00:49:09
* @description: [数据库实体BEAN]代理商金豆表
**/

@Data
public class AgentGoldenbeanPO implements Serializable {

    /**
    *   记录ID
    */
    private Long infoId;
    /**
    *   代理商ID
    */
    private Long agentId;
    /**
    *   金豆数
    */
    private Long beanCounts;
    /**
    *   账户状态
    */
    private Integer agentStatus;
}
