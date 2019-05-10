package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:08:58
* @description: [BO query bean]系统角色表
**/

@Data
public class QuerySysRoleByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 6897833691626610757L;
    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long roleId;
}