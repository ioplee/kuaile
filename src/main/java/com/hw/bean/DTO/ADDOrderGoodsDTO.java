package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]商品表
**/

@Data
public class ADDOrderGoodsDTO implements Serializable {

    private static final long serialVersionUID = -4090402028882916526L;
    /**
    *   商品分类ID
    */
    @ApiModelProperty(value = "goodsType" , required = true)
    @NotNull(message = "goodsType不允许为空")
    private Integer goodsType;
    /**
    *   商品名称
    */
    @ApiModelProperty(value = "goodsName" , required = true)
    @NotNull(message = "goodsName不允许为空")
    private String goodsName;
    /**
    *   商品金额
    */
    @ApiModelProperty(value = "goodsPrice" , required = true)
    @NotNull(message = "goodsPrice不允许为空")
    private Long goodsPrice;
    /**
    *   商品图片
    */
    @ApiModelProperty(value = "goodsImgUrl" , required = true)
    @NotNull(message = "goodsImgUrl不允许为空")
    private String goodsImgUrl;
    /**
    *   商品价格（金豆数）
    */
    @ApiModelProperty(value = "goodsBeans" , required = true)
    @NotNull(message = "goodsBeans不允许为空")
    private Long goodsBeans;
    /**
    *   奖品说明
    */
    @ApiModelProperty(value = "goodsDesc" , required = true)
    @NotNull(message = "goodsDesc不允许为空")
    private String goodsDesc;
    /**
    *   等级价格p0
    */
    @ApiModelProperty(value = "p0Beans" , required = true)
    @NotNull(message = "p0Beans不允许为空")
    private Long p0Beans;
    /**
    *   等级价格p1
    */
    @ApiModelProperty(value = "p1Beans" , required = true)
    @NotNull(message = "p1Beans不允许为空")
    private Long p1Beans;
    /**
    *   等级价格p2
    */
    @ApiModelProperty(value = "p2Beans" , required = true)
    @NotNull(message = "p2Beans不允许为空")
    private Long p2Beans;
    /**
    *   等级价格p3
    */
    @ApiModelProperty(value = "p3Beans" , required = true)
    @NotNull(message = "p3Beans不允许为空")
    private Long p3Beans;
    /**
    *   等级价格p4
    */
    @ApiModelProperty(value = "p4Beans" , required = true)
    @NotNull(message = "p4Beans不允许为空")
    private Long p4Beans;
    /**
    *   等级价格p5
    */
    @ApiModelProperty(value = "p5Beans" , required = true)
    @NotNull(message = "p5Beans不允许为空")
    private Long p5Beans;
    /**
    *   等级价格p6
    */
    @ApiModelProperty(value = "p6Beans" , required = true)
    @NotNull(message = "p6Beans不允许为空")
    private Long p6Beans;
    /**
    *   等级价格p7
    */
    @ApiModelProperty(value = "p7Beans" , required = true)
    @NotNull(message = "p7Beans不允许为空")
    private Long p7Beans;
    /**
    *   商品状态
    */
    @ApiModelProperty(value = "goodsStatus" , required = true)
    @NotNull(message = "goodsStatus不允许为空")
    private Integer goodsStatus;
    /**
    *   商品数量
    */
    @ApiModelProperty(value = "goodsAmount" , required = true)
    @NotNull(message = "goodsAmount不允许为空")
    private Long goodsAmount;
    /**
    *   是否推荐商品
    */
    @ApiModelProperty(value = "recommend" , required = true)
    @NotNull(message = "recommend不允许为空")
    private Integer recommend;
}