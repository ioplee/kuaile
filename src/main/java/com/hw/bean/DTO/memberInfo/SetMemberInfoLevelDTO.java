package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/16.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-16 09:23
 * @description: 设置玩家等级DTO
 **/

@Data
public class SetMemberInfoLevelDTO implements Serializable{
    private static final long serialVersionUID = 3095998040937036173L;

    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    /**
     * 会员等级 从0-7 八个等级(等级不允许修改,随会员经验值增加而自动调整会员等级)

     */
    @ApiModelProperty(value = "玩家等级(0-7)" , required = true)
    @NotNull(message = "玩家等级不允许为空")
    private Integer memberLevel;
}
