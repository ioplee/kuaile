package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]会员经验值明细表
**/

@Data
public class ADDMemberXpInfoDTO implements Serializable {

    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   经验类型
    */
    @ApiModelProperty(value = "xpType" , required = true)
    @NotNull(message = "xpType不允许为空")
    private Integer xpType;
    /**
    *   经验值
    */
    @ApiModelProperty(value = "xpValue" , required = true)
    @NotNull(message = "xpValue不允许为空")
    private Integer xpValue;
    /**
    *   获取日期
    */
    @ApiModelProperty(value = "xpGettime" , required = true)
    @NotNull(message = "xpGettime不允许为空")
    private String xpGettime;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}