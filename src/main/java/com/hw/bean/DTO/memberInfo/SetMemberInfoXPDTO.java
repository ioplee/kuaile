package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/16.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-16 09:25
 * @description: 设置玩家经验值DTO
 **/

@Data
public class SetMemberInfoXPDTO implements Serializable{
    private static final long serialVersionUID = -7348233119228193783L;


    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    @ApiModelProperty(value = "玩家经验值" , required = true)
    @NotNull(message = "玩家经验值不允许为空")
    private Long memberXp;
}
