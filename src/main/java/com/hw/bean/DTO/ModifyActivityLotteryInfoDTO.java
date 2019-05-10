package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:03
* @description: [ADD DTO Bean]大转盘获奖记录表
**/

@Data
public class ModifyActivityLotteryInfoDTO extends ADDActivityLotteryInfoDTO {

    private static final long serialVersionUID = 8139932965628596302L;
    @ApiModelProperty(value = "中奖记录ID" , required = true)
    @NotNull(message = "中奖记录ID不允许为空")
    private Long infoId;

}