package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:31
* @description: [ADD DTO Bean]会员表
**/

@Data
public class ModifyMemberInfoDTO extends ADDMemberInfoDTO {

    private static final long serialVersionUID = 367467397682417196L;
    @ApiModelProperty(value = "会员ID" , required = true)
    @NotNull(message = "会员ID不允许为空")
    private Long memberId;

}