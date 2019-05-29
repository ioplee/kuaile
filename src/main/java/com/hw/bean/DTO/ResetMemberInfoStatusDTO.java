package com.hw.bean.DTO;/**
 * Created by robin on 2019/5/29.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-29 11:32
 * @description: 平台设置玩家状态DTO
 **/

@Data
public class ResetMemberInfoStatusDTO implements Serializable {
    private static final long serialVersionUID = 7570753710835825528L;

    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    @ApiModelProperty(value = "玩家状态" , required = true)
    @NotNull(message = "玩家状态不允许为空")
    private Integer memberStatus;
}
