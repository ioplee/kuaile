package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]代理商信息表
**/

@Data
public class ModifyAgentInfoDTO implements Serializable {

    private static final long serialVersionUID = 1332159889808013628L;
    @ApiModelProperty(value = "代理商ID" , required = true)
    @NotNull(message = "代理商ID不允许为空")
    private Long agentId;

    /**
     *   代理商名称
     */
    @ApiModelProperty(value = "agentName 代理商名称" , required = true)
    @NotNull(message = "agentName不允许为空")
    private String agentName;

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
     *   登录账户
     */
    @ApiModelProperty(value = "agentAccount 代理商登录账户" , required = true)
    @NotNull(message = "agentAccount不允许为空")
    private String agentAccount;

}