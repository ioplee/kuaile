package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]banner广告图
**/

@Data
public class QueryBaseBannerByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 5095667573873621210L;
    @ApiModelProperty(value = "图片ID" , required = true)
    @NotNull(message = "图片ID不允许为空")
    private Long bannerId;
}