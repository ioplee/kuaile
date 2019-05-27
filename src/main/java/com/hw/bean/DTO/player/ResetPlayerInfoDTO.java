package com.hw.bean.DTO.player;/**
 * Created by robin on 2019/5/27.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 14:03
 * @description: 用户修改个人信息DTO
 **/

@Data
public class ResetPlayerInfoDTO implements Serializable {
    private static final long serialVersionUID = 770069407596851187L;

    @ApiModelProperty(value = "会员ID" , required = true)
    @NotNull(message = "会员ID不允许为空")
    private Long memberId;

    /**
     *   会员昵称
     */
    @ApiModelProperty(value = "memberNickname 玩家昵称" , required = true)
    @NotNull(message = "玩家昵称不允许为空")
    private String memberNickname;

    /**
     *   真实姓名
     */
    @ApiModelProperty(value = "userName 真实姓名")
    private String userName;

    /**
     *   头像
     */
    @ApiModelProperty(value = "memberIconUrl 头像连接地址" , required = true)
    @NotNull(message = "memberIconUrl 头像连接地址不允许为空")
    private String memberIconUrl;

    /**
     *   QQ
     */
    @ApiModelProperty(value = "memberQq qq号码")
    private String memberQq;
    /**
     *   常用邮箱
     */
    @ApiModelProperty(value = "memberEmail 电子邮箱")
    private String memberEmail;


}
