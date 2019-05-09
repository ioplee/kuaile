package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]新闻公告表
**/

@Data
public class ModifyBaseNewsDTO extends ADDBaseNewsDTO {

    @ApiModelProperty(value = "新闻ID" , required = true)
    @NotNull(message = "新闻ID不允许为空")
    private Long newsId;

}