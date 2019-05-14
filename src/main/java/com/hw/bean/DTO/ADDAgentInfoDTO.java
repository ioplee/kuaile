package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]代理商信息表
**/

@Data
public class ADDAgentInfoDTO implements Serializable {

    private static final long serialVersionUID = -3406945813433984003L;
    /**
    *   代理商名称
    */
    @ApiModelProperty(value = "agentName 代理商名称" , required = true)
    @NotNull(message = "agentName不允许为空")
    private String agentName;
    /**
    *   代理商编码
    */
    @ApiModelProperty(value = "agentCode 代理商编码" , required = true)
    @NotNull(message = "agentCode不允许为空")
    private Integer agentCode;
    /**
    *   QQ号码
    */
    @ApiModelProperty(value = "qq" , required = true)
    @NotNull(message = "qq不允许为空")
    private String qq;
    /**
    *   商家说明
    */
    @ApiModelProperty(value = "agentDesc 代理商描述" , required = true)
    @NotNull(message = "agentDesc不允许为空")
    private String agentDesc;
    /**
    *   手机号码
    */
    @ApiModelProperty(value = "mobile 代理商联系电话" , required = true)
    @NotNull(message = "mobile不允许为空")
    private String mobile;
    /**
    *   商家状态
    */
    @ApiModelProperty(value = "agentStatus 代理商状态(-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "agentStatus不允许为空")
    private Integer agentStatus;
    /**
    *   创建人
    */
    @ApiModelProperty(value = "creator 后台创建人")
    private String creator;
    /**
    *   充值返点
    */
    @ApiModelProperty(value = "rechargePoint 充值返点(0-100)" , required = true)
    @NotNull(message = "rechargePoint不允许为空")
    private Integer rechargePoint;
    /**
    *   提现返点
    */
    @ApiModelProperty(value = "cashPoint 提现返点(0-100)" , required = true)
    @NotNull(message = "cashPoint不允许为空")
    private Integer cashPoint;
    /**
    *   入住平台日期
    */
    @ApiModelProperty(value = "registerDate 代理商注册平台时间(2019-10-12 23:23:23)" , required = true)
    @NotNull(message = "registerDate不允许为空")
    private String registerDate;
    /**
    *   登录账户
    */
    @ApiModelProperty(value = "agentAccount 代理商登录账户" , required = true)
    @NotNull(message = "agentAccount不允许为空")
    private String agentAccount;
    /**
    *   登录密码
    */
    @ApiModelProperty(value = "agentPassword 代理商登录密码" , required = true)
    @NotNull(message = "agentPassword不允许为空")
    private String agentPassword;
}