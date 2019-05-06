package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:29
* @description: [ADD DTO Bean]大转盘获奖记录表
**/

@Data
public class ModifyActivityLotteryInfoDTO extends ADDActivityLotteryInfoDTO {

    @ApiModelProperty(value = "中奖记录ID" , required = true)
    @NotNull(message = "中奖记录ID不允许为空")
    private Long infoId;

}