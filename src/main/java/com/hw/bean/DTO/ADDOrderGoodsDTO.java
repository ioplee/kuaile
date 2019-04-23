package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:19
* @description: [ADD DTO Bean]平台商品表（用于金豆和资金转换）
**/

@Data
public class ADDOrderGoodsDTO implements Serializable {

    /**
    *   1 家用电器
            2 虚拟点卡
            3 手机数码
    */
    @ApiModelProperty(value = "goodsType" , required = true)
    @NotNull(message = "goodsType不允许为空")
    private Integer goodsType;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsName" , required = true)
    @NotNull(message = "goodsName不允许为空")
    private String goodsName;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsPrice" , required = true)
    @NotNull(message = "goodsPrice不允许为空")
    private Long goodsPrice;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsImgUrl" , required = true)
    @NotNull(message = "goodsImgUrl不允许为空")
    private String goodsImgUrl;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsBeans" , required = true)
    @NotNull(message = "goodsBeans不允许为空")
    private Long goodsBeans;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsDesc" , required = true)
    @NotNull(message = "goodsDesc不允许为空")
    private String goodsDesc;
    /**
    *   
    */
    @ApiModelProperty(value = "p0Beans" , required = true)
    @NotNull(message = "p0Beans不允许为空")
    private Long p0Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "p1Beans" , required = true)
    @NotNull(message = "p1Beans不允许为空")
    private Long p1Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "p2Beans" , required = true)
    @NotNull(message = "p2Beans不允许为空")
    private Long p2Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "p3Beans" , required = true)
    @NotNull(message = "p3Beans不允许为空")
    private Long p3Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "p4Beans" , required = true)
    @NotNull(message = "p4Beans不允许为空")
    private Long p4Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "p5Beans" , required = true)
    @NotNull(message = "p5Beans不允许为空")
    private Long p5Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "p6Beans" , required = true)
    @NotNull(message = "p6Beans不允许为空")
    private Long p6Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "p7Beans" , required = true)
    @NotNull(message = "p7Beans不允许为空")
    private Long p7Beans;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsStatus" , required = true)
    @NotNull(message = "goodsStatus不允许为空")
    private Integer goodsStatus;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsAmount" , required = true)
    @NotNull(message = "goodsAmount不允许为空")
    private Long goodsAmount;
    /**
    *   是否推荐商品0不是1推荐商品
    */
    @ApiModelProperty(value = "recommend" , required = true)
    @NotNull(message = "recommend不允许为空")
    private Integer recommend;
}