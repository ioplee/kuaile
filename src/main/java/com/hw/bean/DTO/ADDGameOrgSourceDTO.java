package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]开奖数据源记录表
**/

@Data
public class ADDGameOrgSourceDTO implements Serializable {

    /**
    *   游戏类型ID
    */
    @ApiModelProperty(value = "gameOrgId" , required = true)
    @NotNull(message = "gameOrgId不允许为空")
    private Long gameOrgId;
    /**
    *   数据数值
    */
    @ApiModelProperty(value = "orgValue" , required = true)
    @NotNull(message = "orgValue不允许为空")
    private Integer orgValue;
    /**
    *   数据顺序
    */
    @ApiModelProperty(value = "orgIndex" , required = true)
    @NotNull(message = "orgIndex不允许为空")
    private Integer orgIndex;
    /**
    *   数据组别
    */
    @ApiModelProperty(value = "orgGroup" , required = true)
    @NotNull(message = "orgGroup不允许为空")
    private Integer orgGroup;
    /**
    *   最后修改时间
    */
    @ApiModelProperty(value = "gmtModify" , required = true)
    @NotNull(message = "gmtModify不允许为空")
    private String gmtModify;
}