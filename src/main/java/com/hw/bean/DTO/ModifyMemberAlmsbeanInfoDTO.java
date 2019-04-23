package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:26
* @description: [ADD DTO Bean]会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP
**/

@Data
public class ModifyMemberAlmsbeanInfoDTO extends ADDMemberAlmsbeanInfoDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long infoId;

}