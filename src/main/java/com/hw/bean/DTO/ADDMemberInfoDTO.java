package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]会员表
**/

@Data
public class ADDMemberInfoDTO implements Serializable {

    private static final long serialVersionUID = -99559232602831796L;
    /**
    *   会员编码
    */
    @ApiModelProperty(value = "memberName 玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private String memberName;
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
    *   登录是否微信验证
    */
    @ApiModelProperty(value = "isWxcheck 是否微信验证(0不是 1是)" , required = true)
    @NotNull(message = "isWxcheck不允许为空")
    private Integer isWxcheck;
    /**
    *   会员等级
    */
    @ApiModelProperty(value = "memberLevel 会员等级" , required = true)
    @NotNull(message = "会员等级不允许为空")
    private Integer memberLevel;
    /**
    *   会员经验值
    */
    @ApiModelProperty(value = "memberXp 会员经验值,创建时为0" , required = true)
    @NotNull(message = "memberXp 会员经验值不允许为空")
    private Long memberXp;
    /**
    *   注册日期
    */
    @ApiModelProperty(value = "registerDate 注册日期" , required = true)
    @NotNull(message = "registerDate 注册日期不允许为空")
    private String registerDate;
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
    /**
    *   上级会员ID
    */
    @ApiModelProperty(value = "parentId 上级会员ID(普通模式和直充模式均使用此字段),没有则填写-1")
    private Long parentId;

    /**
    *   登录密码
    */
    @ApiModelProperty(value = "loginPass 登录密码" , required = true)
    @NotNull(message = "loginPass 登录密码不允许为空")
    private String loginPass;
    /**
    *   银行密码
    */
    @ApiModelProperty(value = "bankPass 银行账户密码" , required = true)
    @NotNull(message = "bankPass 银行账户密码不允许为空")
    private String bankPass;
    /**
    *   玩家类型 
            1 玩家 2代理玩家
    */
    @ApiModelProperty(value = "memberType 玩家类型(1玩家-自行注册 2代理玩家-代理商创建)" , required = true)
    @NotNull(message = "memberType 玩家类型不允许为空")
    private Integer memberType;
    /**
    *   抽成比例
    */
    @ApiModelProperty(value = "gameRate 游戏中奖抽成比例(0-999)")
    private Integer gameRate;

    /**
     * 代理商ID
     */
    @ApiModelProperty(value = "代理商ID" , required = true)
    @NotNull(message = "代理商ID 不允许为空")
    private Long agentID;
}