package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:29
* @description: [ADD DTO Bean]大转盘配置表
**/

@Data
public class ModifyActivityLotteryDTO extends ADDActivityLotteryDTO {

    private static final long serialVersionUID = 8463333830342266110L;
    @ApiModelProperty(value = "奖项ID" , required = true)
    @NotNull(message = "奖项ID不允许为空")
    private Long itemId;

}