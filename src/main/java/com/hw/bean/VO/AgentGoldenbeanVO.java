package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]代理商金豆信息表
**/

@Data
public class AgentGoldenbeanVO implements Serializable {

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
