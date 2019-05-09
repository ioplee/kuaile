package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]游戏开奖结果-群数第一位 10
**/

@Data
public class ADDGameResultRule10DTO implements Serializable {

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
    *   规则类型
    */
    @ApiModelProperty(value = "ruleType" , required = true)
    @NotNull(message = "ruleType不允许为空")
    private Integer ruleType;
    /**
    *   第1个数值
    */
    @ApiModelProperty(value = "value1" , required = true)
    @NotNull(message = "value1不允许为空")
    private Integer value1;
    /**
    *   第2个数值
    */
    @ApiModelProperty(value = "value2" , required = true)
    @NotNull(message = "value2不允许为空")
    private Integer value2;
    /**
    *   第三个数字
    */
    @ApiModelProperty(value = "value3")
    private Integer value3;
    /**
    *   第四个数字
    */
    @ApiModelProperty(value = "value4")
    private Integer value4;
    /**
    *   第五个数字
    */
    @ApiModelProperty(value = "value5")
    private Integer value5;
    /**
    *   第六个数字
    */
    @ApiModelProperty(value = "value6")
    private Integer value6;
    /**
    *   第七个数字
    */
    @ApiModelProperty(value = "value7")
    private Integer value7;
    /**
    *   第八个数字
    */
    @ApiModelProperty(value = "value8")
    private Integer value8;
    /**
    *   第九个数字
    */
    @ApiModelProperty(value = "value9")
    private Integer value9;
    /**
    *   第十个数字
    */
    @ApiModelProperty(value = "value10")
    private Integer value10;
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