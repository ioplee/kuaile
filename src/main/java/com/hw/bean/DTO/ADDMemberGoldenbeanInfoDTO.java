package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]会员金豆账户明细表
**/

@Data
public class ADDMemberGoldenbeanInfoDTO implements Serializable {

    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   明细类型
    */
    @ApiModelProperty(value = "infoType" , required = true)
    @NotNull(message = "infoType不允许为空")
    private Integer infoType;
    /**
    *   金豆数值
    */
    @ApiModelProperty(value = "benaCounts" , required = true)
    @NotNull(message = "benaCounts不允许为空")
    private Long benaCounts;
    /**
    *   业务记录ID
    */
    @ApiModelProperty(value = "bizId" , required = true)
    @NotNull(message = "bizId不允许为空")
    private Long bizId;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "infpStatus" , required = true)
    @NotNull(message = "infpStatus不允许为空")
    private Integer infpStatus;
}