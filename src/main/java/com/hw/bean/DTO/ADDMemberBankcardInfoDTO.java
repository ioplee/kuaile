package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -&
**/

@Data
public class ADDMemberBankcardInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   1、 购买商品 消耗账户余额 减余额
            2、 金豆转银行账户  加余额
            3、 现金转金豆 减余额
    */
    @ApiModelProperty(value = "infoType" , required = true)
    @NotNull(message = "infoType不允许为空")
    private Integer infoType;
    /**
    *   
    */
    @ApiModelProperty(value = "infoFee" , required = true)
    @NotNull(message = "infoFee不允许为空")
    private Long infoFee;
    /**
    *   
    */
    @ApiModelProperty(value = "bizId" , required = true)
    @NotNull(message = "bizId不允许为空")
    private Long bizId;
    /**
    *   -1 删除 0 停用、冻结 1 有效记录
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}