package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]游戏投注项
**/

@Data
public class QueryGameInfoOptionsByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -2448495028445249537L;
    @ApiModelProperty(value = "选项ID" , required = true)
    @NotNull(message = "选项ID不允许为空")
    private Long optionId;
}