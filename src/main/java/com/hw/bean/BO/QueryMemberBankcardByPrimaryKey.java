package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]会员银行账户表
**/

@Data
public class QueryMemberBankcardByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "卡ID" , required = true)
    @NotNull(message = "卡ID不允许为空")
    private Long cardId;
}