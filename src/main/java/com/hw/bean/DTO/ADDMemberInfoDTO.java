package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]平台会员信息表
**/

@Data
public class ADDMemberInfoDTO implements Serializable {

    /**
    *   平台唯一有序会员编码,业务交易及核心业务主要验证身份依据.
    */
    @ApiModelProperty(value = "memberName" , required = true)
    @NotNull(message = "memberName不允许为空")
    private String memberName;
    /**
    *   
    */
    @ApiModelProperty(value = "memberNickname" , required = true)
    @NotNull(message = "memberNickname不允许为空")
    private String memberNickname;
    /**
    *   
    */
    @ApiModelProperty(value = "userName")
    private String userName;
    /**
    *   头像icon链接地址,可以是系统默认的图片路径,也可以配置在词典表或头像维护表中
    */
    @ApiModelProperty(value = "memberIconUrl" , required = true)
    @NotNull(message = "memberIconUrl不允许为空")
    private String memberIconUrl;
    /**
    *   手机号码,需前段对手机号码合法性进行校验
    */
    @ApiModelProperty(value = "memberMobile" , required = true)
    @NotNull(message = "memberMobile不允许为空")
    private String memberMobile;
    /**
    *   
    */
    @ApiModelProperty(value = "memberQq")
    private String memberQq;
    /**
    *   
    */
    @ApiModelProperty(value = "memberEmail")
    private String memberEmail;
    /**
    *   
    */
    @ApiModelProperty(value = "memberWx")
    private String memberWx;
    /**
    *   0不需要1需要微信验证
    */
    @ApiModelProperty(value = "isWxcheck" , required = true)
    @NotNull(message = "isWxcheck不允许为空")
    private Integer isWxcheck;
    /**
    *   会员等级 从0-7 八个等级(等级不允许修改,随会员经验值增加而自动调整会员等级)
            
    */
    @ApiModelProperty(value = "memberLevel" , required = true)
    @NotNull(message = "memberLevel不允许为空")
    private Integer memberLevel;
    /**
    *   会员经验值,根据经验值明细表实时(需要定时校验刷新)
    */
    @ApiModelProperty(value = "memberXp" , required = true)
    @NotNull(message = "memberXp不允许为空")
    private Long memberXp;
    /**
    *   
    */
    @ApiModelProperty(value = "registerDate" , required = true)
    @NotNull(message = "registerDate不允许为空")
    private String registerDate;
    /**
    *   -1删除0停用或冻结1有效
    */
    @ApiModelProperty(value = "memberStatus" , required = true)
    @NotNull(message = "memberStatus不允许为空")
    private Integer memberStatus;
    /**
    *   
    */
    @ApiModelProperty(value = "extendLinks")
    private String extendLinks;
    /**
    *   注册时，注册地址带的会员编码所对应的会员ID
    */
    @ApiModelProperty(value = "parentId")
    private Long parentId;
    /**
    *   
    */
    @ApiModelProperty(value = "lastIp")
    private String lastIp;
    /**
    *   上一次登录系统时间
    */
    @ApiModelProperty(value = "lastLogintime")
    private String lastLogintime;
    /**
    *   用于累计用户签到次数，不用复杂运算，使用此字段来进行逻辑判断。
    */
    @ApiModelProperty(value = "singinCounts" , required = true)
    @NotNull(message = "singinCounts不允许为空")
    private Integer singinCounts;
}