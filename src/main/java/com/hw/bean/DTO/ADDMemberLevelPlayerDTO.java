package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]玩家会员等级表
**/

@Data
public class ADDMemberLevelPlayerDTO implements Serializable {

    private static final long serialVersionUID = -4835488924530817743L;
    /**
    *   等级标题
    */
    @ApiModelProperty(value = "levelTitle 级别等级" , required = true)
    @NotNull(message = "levelTitle不允许为空")
    private String levelTitle;
    /**
    *   所需经验数
    */
    @ApiModelProperty(value = "levelXp 等级所需经验值" , required = true)
    @NotNull(message = "levelXp不允许为空")
    private Integer levelXp;
    /**
    *   升级奖励金豆数
    */
    @ApiModelProperty(value = "levelUpReward 升级奖励金豆数" , required = true)
    @NotNull(message = "levelUpReward不允许为空")
    private Integer levelUpReward;
    /**
    *   充值奖励比例
    */
    @ApiModelProperty(value = "levelCreditCommision 充值奖励比例(0-100)" , required = true)
    @NotNull(message = "levelCreditCommision不允许为空")
    private Integer levelCreditCommision;
    /**
    *   签到奖励金豆基数
    */
    @ApiModelProperty(value = "levelSigninMultiples 签到奖励金豆基数" , required = true)
    @NotNull(message = "levelSigninMultiples不允许为空")
    private Integer levelSigninMultiples;
    /**
    *   每日救济金豆数
    */
    @ApiModelProperty(value = "levelAlmsBean 每日救济金豆数" , required = true)
    @NotNull(message = "levelAlmsBean不允许为空")
    private Integer levelAlmsBean;
    /**
    *   等级状态
    */
    @ApiModelProperty(value = "levelStatus 等级状态(-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "levelStatus不允许为空")
    private Integer levelStatus;
    /**
    *   排序位
    */
    @ApiModelProperty(value = "levelIndex 排序位" , required = true)
    @NotNull(message = "levelIndex不允许为空")
    private Integer levelIndex;
}