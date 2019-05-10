package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:12:27
* @description: [数据库实体BEAN]代理商金豆表
**/

@Data
public class AgentGoldenbeanPO implements Serializable {

    private static final long serialVersionUID = -4045701082908637293L;
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
