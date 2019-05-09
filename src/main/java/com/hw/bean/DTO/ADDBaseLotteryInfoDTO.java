package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]玩家福利列表
**/

@Data
public class ADDBaseLotteryInfoDTO implements Serializable {

    /**
    *   福利标题
    */
    @ApiModelProperty(value = "lotteryTitle" , required = true)
    @NotNull(message = "lotteryTitle不允许为空")
    private String lotteryTitle;
    /**
    *   福利内容
    */
    @ApiModelProperty(value = "lotteryContent" , required = true)
    @NotNull(message = "lotteryContent不允许为空")
    private String lotteryContent;
    /**
    *   活动开始日期
    */
    @ApiModelProperty(value = "beginDate" , required = true)
    @NotNull(message = "beginDate不允许为空")
    private String beginDate;
    /**
    *   活动结束日期
    */
    @ApiModelProperty(value = "endDate" , required = true)
    @NotNull(message = "endDate不允许为空")
    private String endDate;
    /**
    *   活动宣传图片地址
    */
    @ApiModelProperty(value = "imgUrl" , required = true)
    @NotNull(message = "imgUrl不允许为空")
    private String imgUrl;
    /**
    *   活动参与对象
    */
    @ApiModelProperty(value = "targetMember" , required = true)
    @NotNull(message = "targetMember不允许为空")
    private Integer targetMember;
    /**
    *   活动状态
    */
    @ApiModelProperty(value = "lotteryStatus" , required = true)
    @NotNull(message = "lotteryStatus不允许为空")
    private Integer lotteryStatus;
}