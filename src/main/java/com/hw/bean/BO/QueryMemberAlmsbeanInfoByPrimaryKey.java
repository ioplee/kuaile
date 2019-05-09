package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]会员每日救济金豆领取记录表
**/

@Data
public class QueryMemberAlmsbeanInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -8174541182125581750L;
    @ApiModelProperty(value = "领取记录ID" , required = true)
    @NotNull(message = "领取记录ID不允许为空")
    private Long infoId;
}