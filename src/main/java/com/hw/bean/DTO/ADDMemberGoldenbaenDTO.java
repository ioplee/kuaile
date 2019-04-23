package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]会员金豆表，用于记录会员当前可使用金豆（注意此表不是金豆明细，仅为会员当前可用金豆）
**/

@Data
public class ADDMemberGoldenbaenDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   会员当前金豆可用数值（整数）
    */
    @ApiModelProperty(value = "beanCount" , required = true)
    @NotNull(message = "beanCount不允许为空")
    private Long beanCount;
    /**
    *   -1 删除 0 冻结 1有效
    */
    @ApiModelProperty(value = "beanStatus" , required = true)
    @NotNull(message = "beanStatus不允许为空")
    private Integer beanStatus;
}