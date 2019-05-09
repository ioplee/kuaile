package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]新闻公告表
**/

@Data
public class QueryBaseNewsByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -8175876918819934492L;
    @ApiModelProperty(value = "新闻ID" , required = true)
    @NotNull(message = "新闻ID不允许为空")
    private Long newsId;
}