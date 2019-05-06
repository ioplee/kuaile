package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]会员金豆账户明细表
**/

@Data
public class QueryMemberGoldenbeanInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -3280980574425537917L;
    @ApiModelProperty(value = "明细记录ID" , required = true)
    @NotNull(message = "明细记录ID不允许为空")
    private Long infoId;
}