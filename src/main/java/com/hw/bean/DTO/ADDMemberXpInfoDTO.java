package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:19
* @description: [ADD DTO Bean]会员获取经验值明细表
**/

@Data
public class ADDMemberXpInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   1、充值 加经验值（1元加1经验值）
            2、 经验值兑换金豆 减经验值（1经验值兑换1金豆）
            一期暂时按固定比例，后续完善时改成按配置计算
    */
    @ApiModelProperty(value = "xpType" , required = true)
    @NotNull(message = "xpType不允许为空")
    private Integer xpType;
    /**
    *   
    */
    @ApiModelProperty(value = "xpValue" , required = true)
    @NotNull(message = "xpValue不允许为空")
    private Integer xpValue;
    /**
    *   
    */
    @ApiModelProperty(value = "xpGettime" , required = true)
    @NotNull(message = "xpGettime不允许为空")
    private String xpGettime;
    /**
    *   
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}