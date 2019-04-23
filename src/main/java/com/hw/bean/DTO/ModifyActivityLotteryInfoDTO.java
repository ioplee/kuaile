package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:25
* @description: [ADD DTO Bean]活动-大转盘抽奖记录表
**/

@Data
public class ModifyActivityLotteryInfoDTO extends ADDActivityLotteryInfoDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long infoId;

}