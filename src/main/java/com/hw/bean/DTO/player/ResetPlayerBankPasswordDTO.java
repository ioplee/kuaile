package com.hw.bean.DTO.player;/**
 * Created by robin on 2019/5/27.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 14:29
 * @description: 玩家 修改银行密码DTO
 **/

@Data
public class ResetPlayerBankPasswordDTO implements Serializable {
    private static final long serialVersionUID = -5907232606346548695L;

    @ApiModelProperty(value = "会员ID" , required = true)
    @NotNull(message = "会员ID不允许为空")
    private Long memberId;

    @ApiModelProperty(value = "银行密码" , required = true)
    @NotNull(message = "银行密码 不允许为空")
    private String bankPass;

}
