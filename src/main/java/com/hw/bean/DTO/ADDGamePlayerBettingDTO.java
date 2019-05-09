package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]玩家投注表
**/

@Data
public class ADDGamePlayerBettingDTO implements Serializable {

    /**
    *   游戏ID
    */
    @ApiModelProperty(value = "gameId" , required = true)
    @NotNull(message = "gameId不允许为空")
    private Long gameId;
    /**
    *   玩家ID
    */
    @ApiModelProperty(value = "playerId" , required = true)
    @NotNull(message = "playerId不允许为空")
    private Long playerId;
    /**
    *   游戏期数
    */
    @ApiModelProperty(value = "gamePhase" , required = true)
    @NotNull(message = "gamePhase不允许为空")
    private Long gamePhase;
    /**
    *   游戏选项ID
    */
    @ApiModelProperty(value = "optionId" , required = true)
    @NotNull(message = "optionId不允许为空")
    private Long optionId;
    /**
    *   投注金豆
    */
    @ApiModelProperty(value = "bettingAmount" , required = true)
    @NotNull(message = "bettingAmount不允许为空")
    private Long bettingAmount;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "bettingStatus" , required = true)
    @NotNull(message = "bettingStatus不允许为空")
    private Integer bettingStatus;
    /**
    *   最后修改时间
    */
    @ApiModelProperty(value = "gmtModify" , required = true)
    @NotNull(message = "gmtModify不允许为空")
    private String gmtModify;
}