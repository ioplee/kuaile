package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]会员银行账户（平台虚拟银行账户卡）表，用于记录当前用户可用取现或兑换金豆的虚拟货币数值
**/

@Data
public class ADDMemberBankcardDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   用户当前账户余额（整数，平台自动在核算时扣除小数位）
    */
    @ApiModelProperty(value = "accountBalance" , required = true)
    @NotNull(message = "accountBalance不允许为空")
    private Long accountBalance;
    /**
    *   -1 删除 0 冻结 1有效
    */
    @ApiModelProperty(value = "cardStatus" , required = true)
    @NotNull(message = "cardStatus不允许为空")
    private Integer cardStatus;
}