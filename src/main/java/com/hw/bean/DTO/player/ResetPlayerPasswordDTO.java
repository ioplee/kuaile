package com.hw.bean.DTO.player;/**
 * Created by robin on 2019/5/27.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 14:18
 * @description: 修改玩家密码DTO
 **/

@Data
public class ResetPlayerPasswordDTO implements Serializable{
    private static final long serialVersionUID = 9001867707045453995L;

    @ApiModelProperty(value = "会员ID" , required = true)
    @NotNull(message = "会员ID不允许为空")
    private Long memberId;

    @ApiModelProperty(value = "登录密码" , required = true)
    @NotNull(message = "登录密码 不允许为空")
    private String newPassword;

}
