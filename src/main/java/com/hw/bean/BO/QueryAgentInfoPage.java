package com.hw.bean.BO;

import com.hw.utils.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]代理商信息表
**/

@Data
public class QueryAgentInfoPage extends BaseQuery {

    private static final long serialVersionUID = 2478919155835792526L;

    /**
     *   代理商名称
     */
    @ApiModelProperty(value = "agentName 代理商名称")
    private String agentName;

    /**
     *   手机号码
     */
    @ApiModelProperty(value = "mobile 代理商联系电话")
    private String mobile;
}
