package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:26
* @description: [ADD DTO Bean]会员银行账户（平台虚拟银行账户卡）表，用于记录当前用户可用取现或兑换金豆的虚拟货币数值
**/

@Data
public class ModifyMemberBankcardDTO extends ADDMemberBankcardDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long cardId;

}