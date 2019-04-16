package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/16.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-16 09:34
 * @description: 设置玩家连续签到次数
 **/

@Data
public class SetMemberInfoSigninNumberDTO implements Serializable{
    private static final long serialVersionUID = -8672934492025590475L;

    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    /**
     * 用于累计用户签到次数，不用复杂运算，使用此字段来进行逻辑判断。
     */
    @ApiModelProperty(value = "玩家连续签到次数" , required = true)
    @NotNull(message = "玩家连续签到次数不允许为空")
    private Integer singinCounts;
}
