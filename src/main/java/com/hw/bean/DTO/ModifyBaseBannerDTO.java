package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]banner广告图
**/

@Data
public class ModifyBaseBannerDTO extends ADDBaseBannerDTO {

    private static final long serialVersionUID = 1908284149514981601L;
    @ApiModelProperty(value = "图片ID" , required = true)
    @NotNull(message = "图片ID不允许为空")
    private Long bannerId;

}