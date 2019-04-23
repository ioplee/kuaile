package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:26
* @description: [ADD DTO Bean]会员金豆表，用于记录会员当前可使用金豆（注意此表不是金豆明细，仅为会员当前可用金豆）
**/

@Data
public class ModifyMemberGoldenbaenDTO extends ADDMemberGoldenbaenDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long beanId;

}