package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]系统banner图片维护
**/

@Data
public class ADDBaseBannerDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "bannerUrl" , required = true)
    @NotNull(message = "bannerUrl不允许为空")
    private String bannerUrl;
    /**
    *   
    */
    @ApiModelProperty(value = "bannerLinks" , required = true)
    @NotNull(message = "bannerLinks不允许为空")
    private String bannerLinks;
    /**
    *   
    */
    @ApiModelProperty(value = "bannerIndex" , required = true)
    @NotNull(message = "bannerIndex不允许为空")
    private Integer bannerIndex;
    /**
    *   
    */
    @ApiModelProperty(value = "bannerStatus" , required = true)
    @NotNull(message = "bannerStatus不允许为空")
    private Integer bannerStatus;
}