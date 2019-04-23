package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]平台提供的各种福利活动列表
**/

@Data
public class ADDBaseLotteryInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "lotteryTitle" , required = true)
    @NotNull(message = "lotteryTitle不允许为空")
    private String lotteryTitle;
    /**
    *   
    */
    @ApiModelProperty(value = "lotteryContent" , required = true)
    @NotNull(message = "lotteryContent不允许为空")
    private String lotteryContent;
    /**
    *   
    */
    @ApiModelProperty(value = "beginDate" , required = true)
    @NotNull(message = "beginDate不允许为空")
    private String beginDate;
    /**
    *   
    */
    @ApiModelProperty(value = "endDate" , required = true)
    @NotNull(message = "endDate不允许为空")
    private String endDate;
    /**
    *   
    */
    @ApiModelProperty(value = "imgUrl" , required = true)
    @NotNull(message = "imgUrl不允许为空")
    private String imgUrl;
    /**
    *   -1全体会员
            0 p0会员及以上
            1 p1会员及以
            2 p2会员及以
            3 p3会员及以
            4 p4会员及以
            5 p5会员及以
            6 p6会员及以
            7 p7会员及以
    */
    @ApiModelProperty(value = "targetMember" , required = true)
    @NotNull(message = "targetMember不允许为空")
    private Integer targetMember;
    /**
    *   -1删除 0停用 1有效
    */
    @ApiModelProperty(value = "lotteryStatus" , required = true)
    @NotNull(message = "lotteryStatus不允许为空")
    private Integer lotteryStatus;
}