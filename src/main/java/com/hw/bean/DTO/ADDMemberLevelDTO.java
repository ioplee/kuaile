package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]会员等级表
**/

@Data
public class ADDMemberLevelDTO implements Serializable {

    /**
    *   等级标题
    */
    @ApiModelProperty(value = "levelTitle" , required = true)
    @NotNull(message = "levelTitle不允许为空")
    private String levelTitle;
    /**
    *   所需经验数
    */
    @ApiModelProperty(value = "levelXp" , required = true)
    @NotNull(message = "levelXp不允许为空")
    private Integer levelXp;
    /**
    *   升级奖励金豆数
    */
    @ApiModelProperty(value = "levelUpReward" , required = true)
    @NotNull(message = "levelUpReward不允许为空")
    private Integer levelUpReward;
    /**
    *   充值奖励比例
    */
    @ApiModelProperty(value = "levelCreditCommision" , required = true)
    @NotNull(message = "levelCreditCommision不允许为空")
    private Integer levelCreditCommision;
    /**
    *   签到奖励金豆基数
    */
    @ApiModelProperty(value = "levelSigninMultiples" , required = true)
    @NotNull(message = "levelSigninMultiples不允许为空")
    private Integer levelSigninMultiples;
    /**
    *   每日救济金豆数
    */
    @ApiModelProperty(value = "levelAlmsBean" , required = true)
    @NotNull(message = "levelAlmsBean不允许为空")
    private Integer levelAlmsBean;
    /**
    *   等级状态
    */
    @ApiModelProperty(value = "levelStatus" , required = true)
    @NotNull(message = "levelStatus不允许为空")
    private Integer levelStatus;
    /**
    *   排序位
    */
    @ApiModelProperty(value = "levelIndex" , required = true)
    @NotNull(message = "levelIndex不允许为空")
    private Integer levelIndex;
}