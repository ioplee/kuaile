package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:19
* @description: [ADD DTO Bean]
**/

@Data
public class ADDOrderGoodsMemberDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   
    */
    @ApiModelProperty(value = "goodsId" , required = true)
    @NotNull(message = "goodsId不允许为空")
    private Long goodsId;
    /**
    *   订单总金豆数
            
    */
    @ApiModelProperty(value = "beanTotal" , required = true)
    @NotNull(message = "beanTotal不允许为空")
    private Long beanTotal;
    /**
    *   订单中商品所值金豆数
    */
    @ApiModelProperty(value = "beanBase" , required = true)
    @NotNull(message = "beanBase不允许为空")
    private Long beanBase;
    /**
    *   订单平台抽佣金豆数
    */
    @ApiModelProperty(value = "beanRebate" , required = true)
    @NotNull(message = "beanRebate不允许为空")
    private Long beanRebate;
    /**
    *   
    */
    @ApiModelProperty(value = "orderDate" , required = true)
    @NotNull(message = "orderDate不允许为空")
    private String orderDate;
    /**
    *   -1冻结 0 购买 1已出售（转手代理商） 2平台回购
    */
    @ApiModelProperty(value = "orderStatus" , required = true)
    @NotNull(message = "orderStatus不允许为空")
    private Integer orderStatus;
    /**
    *   
    */
    @ApiModelProperty(value = "agentId" , required = true)
    @NotNull(message = "agentId不允许为空")
    private Long agentId;
    /**
    *   
    */
    @ApiModelProperty(value = "grantDate" , required = true)
    @NotNull(message = "grantDate不允许为空")
    private String grantDate;
    /**
    *   
    */
    @ApiModelProperty(value = "grantBean" , required = true)
    @NotNull(message = "grantBean不允许为空")
    private Long grantBean;
    /**
    *   
    */
    @ApiModelProperty(value = "grantRebate" , required = true)
    @NotNull(message = "grantRebate不允许为空")
    private Long grantRebate;
    /**
    *   
    */
    @ApiModelProperty(value = "buyBackDate" , required = true)
    @NotNull(message = "buyBackDate不允许为空")
    private String buyBackDate;
    /**
    *   
    */
    @ApiModelProperty(value = "buyBackBean" , required = true)
    @NotNull(message = "buyBackBean不允许为空")
    private Long buyBackBean;
}