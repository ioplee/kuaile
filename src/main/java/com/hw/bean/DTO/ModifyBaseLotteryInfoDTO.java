package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]玩家福利列表
**/

@Data
public class ModifyBaseLotteryInfoDTO extends ADDBaseLotteryInfoDTO {

    private static final long serialVersionUID = -3508605182590366674L;
    @ApiModelProperty(value = "福利ID" , required = true)
    @NotNull(message = "福利ID不允许为空")
    private Long lotteryId;

}