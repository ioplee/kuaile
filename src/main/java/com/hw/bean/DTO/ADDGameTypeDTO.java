package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]游戏类型表
**/

@Data
public class ADDGameTypeDTO implements Serializable {

    private static final long serialVersionUID = -6722095084939842187L;
    /**
    *   类型名称
    */
    @ApiModelProperty(value = "typeName" , required = true)
    @NotNull(message = "typeName不允许为空")
    private String typeName;
    /**
    *   类型描述
    */
    @ApiModelProperty(value = "typeSummary" , required = true)
    @NotNull(message = "typeSummary不允许为空")
    private String typeSummary;
    /**
    *   游戏介绍
    */
    @ApiModelProperty(value = "typeContent")
    private String typeContent;
    /**
    *   类型状态
    */
    @ApiModelProperty(value = "typeStatus" , required = true)
    @NotNull(message = "typeStatus不允许为空")
    private Integer typeStatus;
    /**
    *   数据源类型
    */
    @ApiModelProperty(value = "orgType" , required = true)
    @NotNull(message = "orgType不允许为空")
    private Long orgType;
    /**
    *   数据源业务编码
    */
    @ApiModelProperty(value = "orgCode" , required = true)
    @NotNull(message = "orgCode不允许为空")
    private String orgCode;
}