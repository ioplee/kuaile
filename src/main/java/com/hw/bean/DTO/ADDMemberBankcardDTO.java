package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]会员银行账户表
**/

@Data
public class ADDMemberBankcardDTO implements Serializable {

    private static final long serialVersionUID = 706733102559055954L;
    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   存款金额
    */
    @ApiModelProperty(value = "accountBalance" , required = true)
    @NotNull(message = "accountBalance不允许为空")
    private Long accountBalance;
    /**
    *   银行账户状态
    */
    @ApiModelProperty(value = "cardStatus" , required = true)
    @NotNull(message = "cardStatus不允许为空")
    private Integer cardStatus;
}