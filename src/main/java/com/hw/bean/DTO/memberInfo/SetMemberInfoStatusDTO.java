package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/15.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-15 23:22
 * @description: 设置用户状态(-1删除账户 0冻结账户 1恢复账户)
 **/

@Data
public class SetMemberInfoStatusDTO implements Serializable{
    private static final long serialVersionUID = 5267982522992903795L;

    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    /**
     * -1删除0停用或冻结1有效
     */
    @ApiModelProperty(value = "会员状态" , required = true)
    @NotNull(message = "会员状态不允许为空")
    private Integer memberStatus;
}
