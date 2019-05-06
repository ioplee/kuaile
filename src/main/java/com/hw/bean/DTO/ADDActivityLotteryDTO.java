package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:17
* @description: [ADD DTO Bean]大转盘配置表
**/

@Data
public class ADDActivityLotteryDTO implements Serializable {

    private static final long serialVersionUID = -7228923657434888189L;
    /**
    *   奖项名称
    */
    @ApiModelProperty(value = "itemTitle" , required = true)
    @NotNull(message = "itemTitle不允许为空")
    private String itemTitle;
    /**
    *   奖项图片
    */
    @ApiModelProperty(value = "itemImgUrl" , required = true)
    @NotNull(message = "itemImgUrl不允许为空")
    private String itemImgUrl;
    /**
    *   奖项金豆数
    */
    @ApiModelProperty(value = "itemBeanCounts" , required = true)
    @NotNull(message = "itemBeanCounts不允许为空")
    private Long itemBeanCounts;
    /**
    *   中奖几率
    */
    @ApiModelProperty(value = "itemProbability" , required = true)
    @NotNull(message = "itemProbability不允许为空")
    private Integer itemProbability;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "itemStatus" , required = true)
    @NotNull(message = "itemStatus不允许为空")
    private Integer itemStatus;
}