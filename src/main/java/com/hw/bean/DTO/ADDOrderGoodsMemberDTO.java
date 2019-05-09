package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]玩家购买商品表
**/

@Data
public class ADDOrderGoodsMemberDTO implements Serializable {

    /**
    *   玩家ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   商品ID
    */
    @ApiModelProperty(value = "goodsId" , required = true)
    @NotNull(message = "goodsId不允许为空")
    private Long goodsId;
    /**
    *   购买订单金豆总数
    */
    @ApiModelProperty(value = "beanTotal" , required = true)
    @NotNull(message = "beanTotal不允许为空")
    private Long beanTotal;
    /**
    *   购买订单金豆数
    */
    @ApiModelProperty(value = "beanBase" , required = true)
    @NotNull(message = "beanBase不允许为空")
    private Long beanBase;
    /**
    *   购买订单手续费
    */
    @ApiModelProperty(value = "beanRebate" , required = true)
    @NotNull(message = "beanRebate不允许为空")
    private Long beanRebate;
    /**
    *   购买交易时间
    */
    @ApiModelProperty(value = "orderDate" , required = true)
    @NotNull(message = "orderDate不允许为空")
    private String orderDate;
    /**
    *   订单状态
    */
    @ApiModelProperty(value = "orderStatus" , required = true)
    @NotNull(message = "orderStatus不允许为空")
    private Integer orderStatus;
    /**
    *   受让代理商ID
    */
    @ApiModelProperty(value = "agentId" , required = true)
    @NotNull(message = "agentId不允许为空")
    private Long agentId;
    /**
    *   受让日期
    */
    @ApiModelProperty(value = "grantDate" , required = true)
    @NotNull(message = "grantDate不允许为空")
    private String grantDate;
    /**
    *   受让金豆数
    */
    @ApiModelProperty(value = "grantBean" , required = true)
    @NotNull(message = "grantBean不允许为空")
    private Long grantBean;
    /**
    *   受让佣金
    */
    @ApiModelProperty(value = "grantRebate" , required = true)
    @NotNull(message = "grantRebate不允许为空")
    private Long grantRebate;
    /**
    *   回购日期
    */
    @ApiModelProperty(value = "buyBackDate" , required = true)
    @NotNull(message = "buyBackDate不允许为空")
    private String buyBackDate;
    /**
    *   回购金豆数
    */
    @ApiModelProperty(value = "buyBackBean" , required = true)
    @NotNull(message = "buyBackBean不允许为空")
    private Long buyBackBean;
}