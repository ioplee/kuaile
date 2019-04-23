package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:31:31
* @description: [BO query bean]会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投
**/

@Data
public class QueryMemberGoldenbeanInfoByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long infoId;
}