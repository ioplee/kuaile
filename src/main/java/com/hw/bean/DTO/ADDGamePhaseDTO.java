package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]游戏期数信息
**/

@Data
public class ADDGamePhaseDTO implements Serializable {

    private static final long serialVersionUID = -4617731345254195617L;
    /**
    *   游戏期数编号
    */
    @ApiModelProperty(value = "phaseNo" , required = true)
    @NotNull(message = "phaseNo不允许为空")
    private String phaseNo;
    /**
    *   游戏ID
    */
    @ApiModelProperty(value = "gameId" , required = true)
    @NotNull(message = "gameId不允许为空")
    private Long gameId;
    /**
    *   期数日期
    */
    @ApiModelProperty(value = "phaseDate" , required = true)
    @NotNull(message = "phaseDate不允许为空")
    private String phaseDate;
    /**
    *   状态
    */
    @ApiModelProperty(value = "phaseStatus" , required = true)
    @NotNull(message = "phaseStatus不允许为空")
    private Integer phaseStatus;
    /**
    *   最后修改时间
    */
    @ApiModelProperty(value = "gmtModify" , required = true)
    @NotNull(message = "gmtModify不允许为空")
    private String gmtModify;
}