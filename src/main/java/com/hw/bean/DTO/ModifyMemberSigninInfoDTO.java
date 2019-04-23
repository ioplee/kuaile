package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:26
* @description: [ADD DTO Bean]会员签到记录明细表（签到获取金豆明细表）
**/

@Data
public class ModifyMemberSigninInfoDTO extends ADDMemberSigninInfoDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long infoId;

}