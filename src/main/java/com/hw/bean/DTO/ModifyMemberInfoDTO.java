package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]会员表
**/

@Data
public class ModifyMemberInfoDTO implements Serializable {

    private static final long serialVersionUID = 367467397682417196L;
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
     *   手机号码
     */
    @ApiModelProperty(value = "memberMobile 手机号码" , required = true)
    @NotNull(message = "memberMobile 手机号码不允许为空")
    private String memberMobile;
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
    /**
     *   微信
     */
    @ApiModelProperty(value = "memberWx 微信号")
    private String memberWx;

    /**
     *   会员等级
     */
    @ApiModelProperty(value = "memberLevel 会员等级" , required = true)
    @NotNull(message = "会员等级不允许为空")
    private Integer memberLevel;

    /**
     *   会员状态
     */
    @ApiModelProperty(value = "memberStatus 会员状态(-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "memberStatus 会员状态不允许为空")
    private Integer memberStatus;

    /**
     *   推广链接地址
     */
    @ApiModelProperty(value = "extendLinks 推广链接")
    private String extendLinks;

}