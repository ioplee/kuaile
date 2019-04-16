package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/16.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-16 09:20
 * @description: 玩家绑定微信DTO
 **/

@Data
public class BindingMemberInfoWXDTO implements Serializable{
    private static final long serialVersionUID = -5750600870921278429L;

    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    @ApiModelProperty(value = "玩家微信" , required = true)
    @NotNull(message = "玩家微信不允许为空")
    private String memberWx;
}
