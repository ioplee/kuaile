package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:08:58
* @description: [BO query bean]系统用户表
**/

@Data
public class QuerySysUserByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 1738431865002366869L;
    @ApiModelProperty(value = "用户ID" , required = true)
    @NotNull(message = "用户ID不允许为空")
    private Long userId;
}