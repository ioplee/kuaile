package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]用户授信记录表
**/

@Data
public class QuerySecurityTokenByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 3789252627902136498L;
    @ApiModelProperty(value = "授信记录ID" , required = true)
    @NotNull(message = "授信记录ID不允许为空")
    private Long tokenId;
}