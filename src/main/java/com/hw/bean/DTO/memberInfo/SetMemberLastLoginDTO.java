package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/16.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-16 09:28
 * @description: 设置玩家最后一次登录信息DTO
 **/

@Data
public class SetMemberLastLoginDTO implements Serializable{
    private static final long serialVersionUID = -3486330124380617422L;


    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    @ApiModelProperty(value = "上次登录IP" , required = true)
    @NotNull(message = "上次登录IP不允许为空")
    private String lastIp;

    /**
     * 上一次登录系统时间
     */
    @ApiModelProperty(value = "上次登录时间" , required = true)
    @NotNull(message = "上次登录时间不允许为空")
    private String lastLogintime;


}
