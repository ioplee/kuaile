package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]banner广告图
**/

@Data
public class ADDBaseBannerDTO implements Serializable {

    private static final long serialVersionUID = -7658344228623550559L;
    /**
    *   图片地址
    */
    @ApiModelProperty(value = "bannerUrl" , required = true)
    @NotNull(message = "bannerUrl不允许为空")
    private String bannerUrl;
    /**
    *   图片链接配置
    */
    @ApiModelProperty(value = "bannerLinks" , required = true)
    @NotNull(message = "bannerLinks不允许为空")
    private String bannerLinks;
    /**
    *   图片排序位
    */
    @ApiModelProperty(value = "bannerIndex" , required = true)
    @NotNull(message = "bannerIndex不允许为空")
    private Integer bannerIndex;
    /**
    *   图片状态
    */
    @ApiModelProperty(value = "bannerStatus" , required = true)
    @NotNull(message = "bannerStatus不允许为空")
    private Integer bannerStatus;
}