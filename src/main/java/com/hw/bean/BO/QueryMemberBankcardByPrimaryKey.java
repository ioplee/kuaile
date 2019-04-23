package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:31:31
* @description: [BO query bean]会员银行账户（平台虚拟银行账户卡）表，用于记录当前用户可用取现或兑换金豆的虚拟货币数值
**/

@Data
public class QueryMemberBankcardByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long cardId;
}