package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]会员每日救济金豆领取记录表
**/

@Data
public class ModifyMemberAlmsbeanInfoDTO extends ADDMemberAlmsbeanInfoDTO {

    @ApiModelProperty(value = "领取记录ID" , required = true)
    @NotNull(message = "领取记录ID不允许为空")
    private Long infoId;

}