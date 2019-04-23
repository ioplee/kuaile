package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:26
* @description: [ADD DTO Bean]会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -&
**/

@Data
public class ModifyMemberBankcardInfoDTO extends ADDMemberBankcardInfoDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long infoId;

}