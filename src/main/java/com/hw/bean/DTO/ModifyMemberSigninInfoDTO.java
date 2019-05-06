package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:31
* @description: [ADD DTO Bean]会员签到记录表
**/

@Data
public class ModifyMemberSigninInfoDTO extends ADDMemberSigninInfoDTO {

    private static final long serialVersionUID = 3811575678023095562L;
    @ApiModelProperty(value = "签到记录ID" , required = true)
    @NotNull(message = "签到记录ID不允许为空")
    private Long infoId;

}