package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]游戏开奖结果-三数组合类分类 36
**/

@Data
public class ADDGameResultRule36DTO implements Serializable {

    /**
    *   游戏类型ID
    */
    @ApiModelProperty(value = "gameTypeId" , required = true)
    @NotNull(message = "gameTypeId不允许为空")
    private Long gameTypeId;
    /**
    *   游戏ID
    */
    @ApiModelProperty(value = "gameId" , required = true)
    @NotNull(message = "gameId不允许为空")
    private Long gameId;
    /**
    *   游戏期数ID
    */
    @ApiModelProperty(value = "gamePhaseId" , required = true)
    @NotNull(message = "gamePhaseId不允许为空")
    private Long gamePhaseId;
    /**
    *   游戏日期
    */
    @ApiModelProperty(value = "gameDate" , required = true)
    @NotNull(message = "gameDate不允许为空")
    private String gameDate;
    /**
    *   第一组数值
    */
    @ApiModelProperty(value = "groupValue1" , required = true)
    @NotNull(message = "groupValue1不允许为空")
    private Integer groupValue1;
    /**
    *   第二组数值
    */
    @ApiModelProperty(value = "groupValue2" , required = true)
    @NotNull(message = "groupValue2不允许为空")
    private Integer groupValue2;
    /**
    *   第三组数值
    */
    @ApiModelProperty(value = "groupValue3" , required = true)
    @NotNull(message = "groupValue3不允许为空")
    private Integer groupValue3;
    /**
    *   和数
    */
    @ApiModelProperty(value = "groupSumValue" , required = true)
    @NotNull(message = "groupSumValue不允许为空")
    private Integer groupSumValue;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "recordStatus" , required = true)
    @NotNull(message = "recordStatus不允许为空")
    private Integer recordStatus;
    /**
    *   最后修改时间
    */
    @ApiModelProperty(value = "gmtModify" , required = true)
    @NotNull(message = "gmtModify不允许为空")
    private String gmtModify;
}