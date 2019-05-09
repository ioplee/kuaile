package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]游戏信息表
**/

@Data
public class ADDGameInfoDTO implements Serializable {

    /**
    *   游戏名称
    */
    @ApiModelProperty(value = "gameName" , required = true)
    @NotNull(message = "gameName不允许为空")
    private String gameName;
    /**
    *   游戏帮助
    */
    @ApiModelProperty(value = "gameHelp" , required = true)
    @NotNull(message = "gameHelp不允许为空")
    private String gameHelp;
    /**
    *   游戏时间
    */
    @ApiModelProperty(value = "gameTime" , required = true)
    @NotNull(message = "gameTime不允许为空")
    private String gameTime;
    /**
    *   游戏每期时间间隔
    */
    @ApiModelProperty(value = "gameStep" , required = true)
    @NotNull(message = "gameStep不允许为空")
    private Integer gameStep;
    /**
    *   游戏共多少期
    */
    @ApiModelProperty(value = "gameCount" , required = true)
    @NotNull(message = "gameCount不允许为空")
    private Integer gameCount;
    /**
    *   游戏每日开始时间
    */
    @ApiModelProperty(value = "gameBeginTime" , required = true)
    @NotNull(message = "gameBeginTime不允许为空")
    private String gameBeginTime;
    /**
    *   游戏每日结束时间
    */
    @ApiModelProperty(value = "gameEdnTime" , required = true)
    @NotNull(message = "gameEdnTime不允许为空")
    private String gameEdnTime;
    /**
    *   投注范围开始
    */
    @ApiModelProperty(value = "gameBetMin" , required = true)
    @NotNull(message = "gameBetMin不允许为空")
    private Long gameBetMin;
    /**
    *   投注范围结束
    */
    @ApiModelProperty(value = "gameBetMax" , required = true)
    @NotNull(message = "gameBetMax不允许为空")
    private Long gameBetMax;
    /**
    *   最高中奖额
    */
    @ApiModelProperty(value = "gameWinnerAmount" , required = true)
    @NotNull(message = "gameWinnerAmount不允许为空")
    private Long gameWinnerAmount;
    /**
    *   游戏状态
    */
    @ApiModelProperty(value = "gameStatus" , required = true)
    @NotNull(message = "gameStatus不允许为空")
    private Integer gameStatus;
    /**
    *   游戏类型ID
    */
    @ApiModelProperty(value = "gameTypeId" , required = true)
    @NotNull(message = "gameTypeId不允许为空")
    private Long gameTypeId;
}