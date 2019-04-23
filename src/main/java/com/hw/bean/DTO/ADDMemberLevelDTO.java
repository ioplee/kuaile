package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]会员等级定义表
**/

@Data
public class ADDMemberLevelDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "levelTitle" , required = true)
    @NotNull(message = "levelTitle不允许为空")
    private String levelTitle;
    /**
    *   
    */
    @ApiModelProperty(value = "levelXp" , required = true)
    @NotNull(message = "levelXp不允许为空")
    private Integer levelXp;
    /**
    *   好友升级奖励金豆数，默认0，整数
    */
    @ApiModelProperty(value = "levelUpReward" , required = true)
    @NotNull(message = "levelUpReward不允许为空")
    private Integer levelUpReward;
    /**
    *   好友充值奖励（抽佣比例）0-100的整数
    */
    @ApiModelProperty(value = "levelCreditCommision" , required = true)
    @NotNull(message = "levelCreditCommision不允许为空")
    private Integer levelCreditCommision;
    /**
    *   
    */
    @ApiModelProperty(value = "levelSigninMultiples" , required = true)
    @NotNull(message = "levelSigninMultiples不允许为空")
    private Integer levelSigninMultiples;
    /**
    *   等级每日救济金豆数
    */
    @ApiModelProperty(value = "levelAlmsBean" , required = true)
    @NotNull(message = "levelAlmsBean不允许为空")
    private Integer levelAlmsBean;
    /**
    *   -1 删除 0停用 1有效
    */
    @ApiModelProperty(value = "levelStatus" , required = true)
    @NotNull(message = "levelStatus不允许为空")
    private Integer levelStatus;
    /**
    *   为保证排版美观，加排序位。
    */
    @ApiModelProperty(value = "levelIndex" , required = true)
    @NotNull(message = "levelIndex不允许为空")
    private Integer levelIndex;
}