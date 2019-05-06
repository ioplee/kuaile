package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]会员银行账户明细表
**/

@Data
public class QueryMemberBankcardInfoByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "明细ID" , required = true)
    @NotNull(message = "明细ID不允许为空")
    private Long infoId;
}