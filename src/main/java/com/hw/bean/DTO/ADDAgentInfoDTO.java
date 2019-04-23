package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]平台代理商信息
**/

@Data
public class ADDAgentInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "agentName" , required = true)
    @NotNull(message = "agentName不允许为空")
    private String agentName;
    /**
    *   代理商编码，用于代理商充值时平台录入查询确定代理商身份
    */
    @ApiModelProperty(value = "agentCode" , required = true)
    @NotNull(message = "agentCode不允许为空")
    private Integer agentCode;
    /**
    *   
    */
    @ApiModelProperty(value = "qq" , required = true)
    @NotNull(message = "qq不允许为空")
    private String qq;
    /**
    *   
    */
    @ApiModelProperty(value = "agentDesc" , required = true)
    @NotNull(message = "agentDesc不允许为空")
    private String agentDesc;
    /**
    *   
    */
    @ApiModelProperty(value = "mobile" , required = true)
    @NotNull(message = "mobile不允许为空")
    private String mobile;
    /**
    *   -1删除 0停用冻结 1有效
    */
    @ApiModelProperty(value = "agentStatus" , required = true)
    @NotNull(message = "agentStatus不允许为空")
    private Integer agentStatus;
    /**
    *   
    */
    @ApiModelProperty(value = "creator")
    private String creator;
    /**
    *   0-99的整数（会员充值返点，金豆）
    */
    @ApiModelProperty(value = "rechargePoint" , required = true)
    @NotNull(message = "rechargePoint不允许为空")
    private Integer rechargePoint;
    /**
    *   0-99整数（商品提现时，返回金豆数）
    */
    @ApiModelProperty(value = "cashPoint" , required = true)
    @NotNull(message = "cashPoint不允许为空")
    private Integer cashPoint;
    /**
    *   
    */
    @ApiModelProperty(value = "registerDate" , required = true)
    @NotNull(message = "registerDate不允许为空")
    private String registerDate;
    /**
    *   默认登录账户为手机号码
    */
    @ApiModelProperty(value = "agentAccount" , required = true)
    @NotNull(message = "agentAccount不允许为空")
    private String agentAccount;
    /**
    *   数字和字母组成的6-16位密码，md5加密
    */
    @ApiModelProperty(value = "agentPassword" , required = true)
    @NotNull(message = "agentPassword不允许为空")
    private String agentPassword;
}