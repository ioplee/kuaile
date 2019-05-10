package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:08:58
* @description: [BO query bean]用户具有角色记录表
**/

@Data
public class QuerySysRelationUserRoleByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -8146949315381736603L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;
}