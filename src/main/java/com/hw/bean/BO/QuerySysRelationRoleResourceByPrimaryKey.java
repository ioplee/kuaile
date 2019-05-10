package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:08:58
* @description: [BO query bean]角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）
**/

@Data
public class QuerySysRelationRoleResourceByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -2676017237142801211L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;
}