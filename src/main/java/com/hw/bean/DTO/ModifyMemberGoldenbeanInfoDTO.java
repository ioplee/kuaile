package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:26
* @description: [ADD DTO Bean]会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投
**/

@Data
public class ModifyMemberGoldenbeanInfoDTO extends ADDMemberGoldenbeanInfoDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long infoId;

}