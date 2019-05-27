package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]奖品表
**/

@Data
public class ADDOrderGoodsDTO implements Serializable {

    private static final long serialVersionUID = -4090402028882916526L;
    /**
    *   奖品分类ID
    */
    @ApiModelProperty(value = "goodsType 奖品类型(1电子卡2其他)" , required = true)
    @NotNull(message = "goodsType不允许为空")
    private Integer goodsType = 1;
    /**
    *   奖品名称
    */
    @ApiModelProperty(value = "goodsName 奖品名称" , required = true)
    @NotNull(message = "goodsName不允许为空")
    private String goodsName;
    /**
    *   奖品金额
    */
    @ApiModelProperty(value = "goodsPrice 奖品单价" , required = true)
    @NotNull(message = "goodsPrice不允许为空")
    private Long goodsPrice;
    /**
    *   奖品图片
    */
    @ApiModelProperty(value = "goodsImgUrl 奖品图片地址" , required = true)
    @NotNull(message = "goodsImgUrl不允许为空")
    private String goodsImgUrl;
    /**
    *   奖品价格（金豆数）
    */
    @ApiModelProperty(value = "goodsBeans 奖品所需金豆数" , required = true)
    @NotNull(message = "goodsBeans不允许为空")
    private Long goodsBeans;
    /**
    *   奖品说明
    */
    @ApiModelProperty(value = "goodsDesc 奖品描述")
    private String goodsDesc;
    /**
    *   等级价格p0
    */
    @ApiModelProperty(value = "p0Beans P0级用户所需金豆数" , required = true)
    @NotNull(message = "p0Beans不允许为空")
    private Long p0Beans;
    /**
    *   等级价格p1
    */
    @ApiModelProperty(value = "p1Beans P1级用户所需金豆数" , required = true)
    @NotNull(message = "p1Beans不允许为空")
    private Long p1Beans;
    /**
    *   等级价格p2
    */
    @ApiModelProperty(value = "p2Beans P2级用户所需金豆数" , required = true)
    @NotNull(message = "p2Beans不允许为空")
    private Long p2Beans;
    /**
    *   等级价格p3
    */
    @ApiModelProperty(value = "p3Beans P3级用户所需金豆数" , required = true)
    @NotNull(message = "p3Beans不允许为空")
    private Long p3Beans;
    /**
    *   等级价格p4
    */
    @ApiModelProperty(value = "p4Beans P4级用户所需金豆数" , required = true)
    @NotNull(message = "p4Beans不允许为空")
    private Long p4Beans;
    /**
    *   等级价格p5
    */
    @ApiModelProperty(value = "p5Beans P5级用户所需金豆数" , required = true)
    @NotNull(message = "p5Beans不允许为空")
    private Long p5Beans;
    /**
    *   等级价格p6
    */
    @ApiModelProperty(value = "p6Beans P6级用户所需金豆数" , required = true)
    @NotNull(message = "p6Beans不允许为空")
    private Long p6Beans;
    /**
    *   等级价格p7
    */
    @ApiModelProperty(value = "p7Beans P7级用户所需金豆数" , required = true)
    @NotNull(message = "p7Beans不允许为空")
    private Long p7Beans;
    /**
    *   奖品状态
    */
    @ApiModelProperty(value = "goodsStatus 奖品状态(-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "goodsStatus不允许为空")
    private Integer goodsStatus = 1;
    /**
    *   奖品数量
    */
    @ApiModelProperty(value = "goodsAmount 奖品数量" , required = true)
    @NotNull(message = "goodsAmount不允许为空")
    private Long goodsAmount = 999999l;
    /**
    *   是否推荐奖品
    */
    @ApiModelProperty(value = "recommend 是否为推荐奖品(0不推荐 1推荐奖品)" , required = true)
    @NotNull(message = "recommend不允许为空")
    private Integer recommend = 0;
}