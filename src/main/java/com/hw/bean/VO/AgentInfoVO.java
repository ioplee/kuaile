package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]平台代理商信息
**/

@Data
public class AgentInfoVO implements Serializable {

    /**
    *   
    */
    private Long agentId;
    /**
    *   
    */
    private String agentName;
    /**
    *   代理商编码，用于代理商充值时平台录入查询确定代理商身份
    */
    private Integer agentCode;
    /**
    *   
    */
    private String qq;
    /**
    *   
    */
    private String agentDesc;
    /**
    *   
    */
    private String mobile;
    /**
    *   -1删除 0停用冻结 1有效
    */
    private Integer agentStatus;
    /**
    *   
    */
    private String creator;
    /**
    *   0-99的整数（会员充值返点，金豆）
    */
    private Integer rechargePoint;
    /**
    *   0-99整数（商品提现时，返回金豆数）
    */
    private Integer cashPoint;
    /**
    *   
    */
    private String registerDate;
    /**
    *   默认登录账户为手机号码
    */
    private String agentAccount;
    /**
    *   数字和字母组成的6-16位密码，md5加密
    */
    private String agentPassword;
}
