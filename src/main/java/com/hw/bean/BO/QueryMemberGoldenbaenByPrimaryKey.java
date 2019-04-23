package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:31:31
* @description: [BO query bean]会员金豆表，用于记录会员当前可使用金豆（注意此表不是金豆明细，仅为会员当前可用金豆）
**/

@Data
public class QueryMemberGoldenbaenByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long beanId;
}