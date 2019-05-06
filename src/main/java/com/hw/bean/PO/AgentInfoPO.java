package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:10
* @description: [数据库实体BEAN]代理商信息表
**/

@Data
public class AgentInfoPO implements Serializable {

    private static final long serialVersionUID = -5128984684589376134L;
    /**
    *   代理商ID
    */
    private Long agentId;
    /**
    *   代理商名称
    */
    private String agentName;
    /**
    *   代理商编码
    */
    private Integer agentCode;
    /**
    *   QQ号码
    */
    private String qq;
    /**
    *   商家说明
    */
    private String agentDesc;
    /**
    *   手机号码
    */
    private String mobile;
    /**
    *   商家状态
    */
    private Integer agentStatus;
    /**
    *   创建人
    */
    private String creator;
    /**
    *   充值返点
    */
    private Integer rechargePoint;
    /**
    *   提现返点
    */
    private Integer cashPoint;
    /**
    *   入住平台日期
    */
    private String registerDate;
    /**
    *   登录账户
    */
    private String agentAccount;
    /**
    *   登录密码
    */
    private String agentPassword;
}
