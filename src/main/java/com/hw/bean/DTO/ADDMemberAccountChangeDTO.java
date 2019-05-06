package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]会员金豆和银行账户转账记录
**/

@Data
public class ADDMemberAccountChangeDTO implements Serializable {

    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   记录类型
    */
    @ApiModelProperty(value = "infoType" , required = true)
    @NotNull(message = "infoType不允许为空")
    private Integer infoType;
    /**
    *   变动金豆数
    */
    @ApiModelProperty(value = "changeCounts" , required = true)
    @NotNull(message = "changeCounts不允许为空")
    private Long changeCounts;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
    /**
    *   记录时间
    */
    @ApiModelProperty(value = "infoTime" , required = true)
    @NotNull(message = "infoTime不允许为空")
    private String infoTime;
    /**
    *   备注
    */
    @ApiModelProperty(value = "infoDesc")
    private String infoDesc;
}