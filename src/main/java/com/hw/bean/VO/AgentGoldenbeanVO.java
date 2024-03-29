package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:13:04
* @description: [数据库View BEAN]代理商金豆表
**/

@Data
public class AgentGoldenbeanVO implements Serializable {

    private static final long serialVersionUID = 3442859440543246670L;
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

    /**
     * 代理商名称
     */
    private String agentName;

    /**
     * 代理商手机号码
     */
    private String mobile;
}
