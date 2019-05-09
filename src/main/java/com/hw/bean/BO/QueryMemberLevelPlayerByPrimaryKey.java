package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]玩家会员等级表
**/

@Data
public class QueryMemberLevelPlayerByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 7089397016231772663L;
    @ApiModelProperty(value = "等级ID" , required = true)
    @NotNull(message = "等级ID不允许为空")
    private Long levelId;
}