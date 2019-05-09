package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:03
* @description: [ADD DTO Bean]大转盘配置表
**/

@Data
public class ModifyActivityLotteryDTO extends ADDActivityLotteryDTO {

    @ApiModelProperty(value = "奖项ID" , required = true)
    @NotNull(message = "奖项ID不允许为空")
    private Long itemId;

}