package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import com.hw.utils.BaseQuery;

import javax.validation.constraints.NotNull;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]代理商金豆表
**/

@Data
public class QueryAgentGoldenbeanPage extends BaseQuery {

    private static final long serialVersionUID = -6663533532643927906L;

    @ApiModelProperty(value = "代理商编码(必须输入完全,上下分使用时不允许模糊查询)" , required = true)
    @NotNull(message = "代理商编码不允许为空")
    private Integer agentCode;
}
