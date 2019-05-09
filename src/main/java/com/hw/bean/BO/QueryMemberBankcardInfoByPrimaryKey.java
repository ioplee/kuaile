package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]会员银行账户明细表
**/

@Data
public class QueryMemberBankcardInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -5565250828409549150L;
    @ApiModelProperty(value = "明细ID" , required = true)
    @NotNull(message = "明细ID不允许为空")
    private Long infoId;
}