package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]会员表
**/

@Data
public class QueryMemberInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 5789223446705590654L;
    @ApiModelProperty(value = "会员ID" , required = true)
    @NotNull(message = "会员ID不允许为空")
    private Long memberId;
}