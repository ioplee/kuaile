package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import com.hw.utils.BaseQuery;

import javax.validation.constraints.NotNull;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]代理商金豆明细表
**/

@Data
public class QueryAgentGoldenbeanInfoPage extends BaseQuery {

    private static final long serialVersionUID = 6894604451242214662L;

    @ApiModelProperty(value = "代理商ID" , required = true)
    @NotNull(message = "代理商ID不允许为空")
    private Long agentID;
}
