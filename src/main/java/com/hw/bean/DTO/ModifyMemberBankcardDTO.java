package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]会员银行账户表
**/

@Data
public class ModifyMemberBankcardDTO extends ADDMemberBankcardDTO {

    private static final long serialVersionUID = 4181446786216465787L;
    @ApiModelProperty(value = "卡ID" , required = true)
    @NotNull(message = "卡ID不允许为空")
    private Long cardId;

}