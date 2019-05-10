package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]用户授信记录表
**/

@Data
public class ModifySecurityTokenDTO extends ADDSecurityTokenDTO {

    private static final long serialVersionUID = 1111776549154096089L;
    @ApiModelProperty(value = "授信记录ID" , required = true)
    @NotNull(message = "授信记录ID不允许为空")
    private Long tokenId;

}