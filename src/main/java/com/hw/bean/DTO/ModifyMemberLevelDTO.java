package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:31
* @description: [ADD DTO Bean]会员等级表
**/

@Data
public class ModifyMemberLevelDTO extends ADDMemberLevelDTO {

    private static final long serialVersionUID = -7356362337693676146L;
    @ApiModelProperty(value = "等级ID" , required = true)
    @NotNull(message = "等级ID不允许为空")
    private Long levelId;

}