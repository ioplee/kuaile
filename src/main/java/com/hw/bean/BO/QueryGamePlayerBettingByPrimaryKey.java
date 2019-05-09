package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]玩家投注表
**/

@Data
public class QueryGamePlayerBettingByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -3180432860804743687L;
    @ApiModelProperty(value = "投注记录ID" , required = true)
    @NotNull(message = "投注记录ID不允许为空")
    private Long bettingId;
}