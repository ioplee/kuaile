package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-04-24 02:16:13
* @description: [数据库实体BEAN]代理商金豆信息表
**/

@Data
public class AgentGoldenbeanPO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long agentId;
    /**
    *   
    */
    private Long beanCounts;
    /**
    *   -1删除 0冻结停用 1有效
    */
    private Integer agentStatus;
}
