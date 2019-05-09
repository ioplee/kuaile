package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]游戏数据源表
**/

@Data
public class ADDGameDataSourceDTO implements Serializable {

    /**
    *   数据源名称
    */
    @ApiModelProperty(value = "sourceName" , required = true)
    @NotNull(message = "sourceName不允许为空")
    private String sourceName;
    /**
    *   数据源描述
    */
    @ApiModelProperty(value = "sourceDesc")
    private String sourceDesc;
    /**
    *   数据源刷新数据周期，每期开奖时间间隔
    */
    @ApiModelProperty(value = "sourceStepTime" , required = true)
    @NotNull(message = "sourceStepTime不允许为空")
    private Integer sourceStepTime;
    /**
    *   每天开始时间
    */
    @ApiModelProperty(value = "sourceStartTime" , required = true)
    @NotNull(message = "sourceStartTime不允许为空")
    private String sourceStartTime;
    /**
    *   每天结束时间
    */
    @ApiModelProperty(value = "sourceEndTime" , required = true)
    @NotNull(message = "sourceEndTime不允许为空")
    private String sourceEndTime;
    /**
    *   数据源状态-1删除 0停用 1有效
    */
    @ApiModelProperty(value = "sourceStatus" , required = true)
    @NotNull(message = "sourceStatus不允许为空")
    private Integer sourceStatus;
}