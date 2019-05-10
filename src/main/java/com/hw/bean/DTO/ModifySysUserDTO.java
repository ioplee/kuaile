package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 11:11:09
* @description: [ADD DTO Bean]系统用户表
**/

@Data
public class ModifySysUserDTO extends ADDSysUserDTO {

    private static final long serialVersionUID = -1807849014857503374L;
    @ApiModelProperty(value = "用户ID" , required = true)
    @NotNull(message = "用户ID不允许为空")
    private Long userId;

}