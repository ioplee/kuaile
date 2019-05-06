package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]会员等级表
**/

@Data
public class QueryMemberLevelByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 1095095291335501235L;
    @ApiModelProperty(value = "等级ID" , required = true)
    @NotNull(message = "等级ID不允许为空")
    private Long levelId;
}