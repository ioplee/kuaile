package com.hw.bean.BO;/**
 * Created by robin on 2019/5/15.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: Robin
 * @create: 2019-05-15 16:15
 * @description: 按代理商查询玩家列表BO
 **/

@Data
public class QueryMemberInfoByAgent extends QueryMemberInfoPage {
    private static final long serialVersionUID = -8844404205446964731L;

    /**
     * 代理商ID
     */
    @ApiModelProperty(value = "代理商ID(-1代表查询全部,指定ID查询指定代理商的玩家列表)" , required = true)
    @NotNull(message = "代理商ID不允许为空")
    private Long agentID;
}
