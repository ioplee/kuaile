package com.hw.bean.DTO;/**
 * Created by robin on 2019/5/29.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-29 13:14
 * @description: 管理端修改代理商状态DTO
 **/

@Data
public class ResetAgentStatusDTO implements Serializable{
    private static final long serialVersionUID = 5585773596985675020L;

    @ApiModelProperty(value = "代理商ID" , required = true)
    @NotNull(message = "代理商ID不允许为空")
    private Long agentId;

    /**
     *   商家状态
     */
    @ApiModelProperty(value = "agentStatus 代理商状态(-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "agentStatus不允许为空")
    private Integer agentStatus;
}
