package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]会员金豆账户表
**/

@Data
public class QueryMemberGoldenbaenByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 6160965037515989481L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long beanId;
}