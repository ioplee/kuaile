package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:17
* @description: [ADD DTO Bean]代理商信息表
**/

@Data
public class ADDAgentInfoDTO implements Serializable {

    private static final long serialVersionUID = -3406945813433984003L;
    /**
    *   代理商名称
    */
    @ApiModelProperty(value = "agentName" , required = true)
    @NotNull(message = "agentName不允许为空")
    private String agentName;
    /**
    *   代理商编码
    */
    @ApiModelProperty(value = "agentCode" , required = true)
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
    @ApiModelProperty(value = "agentDesc" , required = true)
    @NotNull(message = "agentDesc不允许为空")
    private String agentDesc;
    /**
    *   手机号码
    */
    @ApiModelProperty(value = "mobile" , required = true)
    @NotNull(message = "mobile不允许为空")
    private String mobile;
    /**
    *   商家状态
    */
    @ApiModelProperty(value = "agentStatus" , required = true)
    @NotNull(message = "agentStatus不允许为空")
    private Integer agentStatus;
    /**
    *   创建人
    */
    @ApiModelProperty(value = "creator")
    private String creator;
    /**
    *   充值返点
    */
    @ApiModelProperty(value = "rechargePoint" , required = true)
    @NotNull(message = "rechargePoint不允许为空")
    private Integer rechargePoint;
    /**
    *   提现返点
    */
    @ApiModelProperty(value = "cashPoint" , required = true)
    @NotNull(message = "cashPoint不允许为空")
    private Integer cashPoint;
    /**
    *   入住平台日期
    */
    @ApiModelProperty(value = "registerDate" , required = true)
    @NotNull(message = "registerDate不允许为空")
    private String registerDate;
    /**
    *   登录账户
    */
    @ApiModelProperty(value = "agentAccount" , required = true)
    @NotNull(message = "agentAccount不允许为空")
    private String agentAccount;
    /**
    *   登录密码
    */
    @ApiModelProperty(value = "agentPassword" , required = true)
    @NotNull(message = "agentPassword不允许为空")
    private String agentPassword;
}