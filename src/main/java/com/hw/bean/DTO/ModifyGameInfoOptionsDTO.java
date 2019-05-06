package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]游戏投注项
**/

@Data
public class ModifyGameInfoOptionsDTO extends ADDGameInfoOptionsDTO {

    private static final long serialVersionUID = 1894399318129339677L;
    @ApiModelProperty(value = "选项ID" , required = true)
    @NotNull(message = "选项ID不允许为空")
    private Long optionId;

}