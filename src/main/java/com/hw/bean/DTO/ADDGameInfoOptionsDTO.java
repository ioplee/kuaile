package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]游戏投注项
**/

@Data
public class ADDGameInfoOptionsDTO implements Serializable {

    /**
    *   选项标题
    */
    @ApiModelProperty(value = "optionTitle" , required = true)
    @NotNull(message = "optionTitle不允许为空")
    private String optionTitle;
    /**
    *   选项值
    */
    @ApiModelProperty(value = "optionValue" , required = true)
    @NotNull(message = "optionValue不允许为空")
    private Integer optionValue;
    /**
    *   标准赔率
    */
    @ApiModelProperty(value = "optionOdds" , required = true)
    @NotNull(message = "optionOdds不允许为空")
    private Integer optionOdds;
    /**
    *   选项状态
    */
    @ApiModelProperty(value = "optionStatus" , required = true)
    @NotNull(message = "optionStatus不允许为空")
    private Integer optionStatus;
    /**
    *   游戏ID
    */
    @ApiModelProperty(value = "游戏ID" , required = true)
    @NotNull(message = "游戏ID不允许为空")
    private Long 游戏ID;
    /**
    *   
    */
    @ApiModelProperty(value = "optionMaxValue" , required = true)
    @NotNull(message = "optionMaxValue不允许为空")
    private Long optionMaxValue;
}