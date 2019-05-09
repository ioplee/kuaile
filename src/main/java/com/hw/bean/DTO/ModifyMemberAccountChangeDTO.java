package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]会员金豆和银行账户转账记录
**/

@Data
public class ModifyMemberAccountChangeDTO extends ADDMemberAccountChangeDTO {

    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;

}