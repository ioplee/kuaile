package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]会员金豆和银行账户转账记录
**/

@Data
public class QueryMemberAccountChangeByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 6252677837427935001L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;
}