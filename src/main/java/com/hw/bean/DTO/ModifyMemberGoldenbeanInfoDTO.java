package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]会员金豆账户明细表
**/

@Data
public class ModifyMemberGoldenbeanInfoDTO extends ADDMemberGoldenbeanInfoDTO {

    @ApiModelProperty(value = "明细记录ID" , required = true)
    @NotNull(message = "明细记录ID不允许为空")
    private Long infoId;

}