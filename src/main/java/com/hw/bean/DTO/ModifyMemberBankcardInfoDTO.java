package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]会员银行账户明细表
**/

@Data
public class ModifyMemberBankcardInfoDTO extends ADDMemberBankcardInfoDTO {

    @ApiModelProperty(value = "明细ID" , required = true)
    @NotNull(message = "明细ID不允许为空")
    private Long infoId;

}