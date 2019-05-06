package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]会员表
**/

@Data
public class ADDMemberInfoDTO implements Serializable {

    private static final long serialVersionUID = -99559232602831796L;
    /**
    *   会员编码
    */
    @ApiModelProperty(value = "memberName" , required = true)
    @NotNull(message = "memberName不允许为空")
    private String memberName;
    /**
    *   会员昵称
    */
    @ApiModelProperty(value = "memberNickname" , required = true)
    @NotNull(message = "memberNickname不允许为空")
    private String memberNickname;
    /**
    *   真实姓名
    */
    @ApiModelProperty(value = "userName")
    private String userName;
    /**
    *   头像
    */
    @ApiModelProperty(value = "memberIconUrl" , required = true)
    @NotNull(message = "memberIconUrl不允许为空")
    private String memberIconUrl;
    /**
    *   手机号码
    */
    @ApiModelProperty(value = "memberMobile" , required = true)
    @NotNull(message = "memberMobile不允许为空")
    private String memberMobile;
    /**
    *   QQ
    */
    @ApiModelProperty(value = "memberQq")
    private String memberQq;
    /**
    *   常用邮箱
    */
    @ApiModelProperty(value = "memberEmail")
    private String memberEmail;
    /**
    *   微信
    */
    @ApiModelProperty(value = "memberWx")
    private String memberWx;
    /**
    *   登录是否微信验证
    */
    @ApiModelProperty(value = "isWxcheck" , required = true)
    @NotNull(message = "isWxcheck不允许为空")
    private Integer isWxcheck;
    /**
    *   会员等级
    */
    @ApiModelProperty(value = "memberLevel" , required = true)
    @NotNull(message = "memberLevel不允许为空")
    private Integer memberLevel;
    /**
    *   会员经验值
    */
    @ApiModelProperty(value = "memberXp" , required = true)
    @NotNull(message = "memberXp不允许为空")
    private Long memberXp;
    /**
    *   注册日期
    */
    @ApiModelProperty(value = "registerDate" , required = true)
    @NotNull(message = "registerDate不允许为空")
    private String registerDate;
    /**
    *   会员状态
    */
    @ApiModelProperty(value = "memberStatus" , required = true)
    @NotNull(message = "memberStatus不允许为空")
    private Integer memberStatus;
    /**
    *   推广链接地址
    */
    @ApiModelProperty(value = "extendLinks" , required = true)
    @NotNull(message = "extendLinks不允许为空")
    private String extendLinks;
    /**
    *   上级会员ID
    */
    @ApiModelProperty(value = "parentId")
    private Long parentId;
    /**
    *   上次登录ip地址
    */
    @ApiModelProperty(value = "lastIp" , required = true)
    @NotNull(message = "lastIp不允许为空")
    private String lastIp;
    /**
    *   上次登录时间
    */
    @ApiModelProperty(value = "lastLogintime" , required = true)
    @NotNull(message = "lastLogintime不允许为空")
    private String lastLogintime;
    /**
    *   连续签到数
    */
    @ApiModelProperty(value = "singinCounts" , required = true)
    @NotNull(message = "singinCounts不允许为空")
    private Integer singinCounts;
    /**
    *   登录密码
    */
    @ApiModelProperty(value = "loginPass" , required = true)
    @NotNull(message = "loginPass不允许为空")
    private String loginPass;
    /**
    *   银行密码
    */
    @ApiModelProperty(value = "bankPass" , required = true)
    @NotNull(message = "bankPass不允许为空")
    private String bankPass;
    /**
    *   玩家类型
    */
    @ApiModelProperty(value = "memberType" , required = true)
    @NotNull(message = "memberType不允许为空")
    private Integer memberType;
    /**
    *   抽成比例
    */
    @ApiModelProperty(value = "gameRate")
    private String gameRate;
}