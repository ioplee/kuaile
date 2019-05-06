package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]会员签到记录表
**/

@Data
public class ADDMemberSigninInfoDTO implements Serializable {

    private static final long serialVersionUID = -6179998756759764877L;
    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   签到日期
    */
    @ApiModelProperty(value = "signinDate" , required = true)
    @NotNull(message = "signinDate不允许为空")
    private String signinDate;
    /**
    *   签到获得金豆数
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Integer beanCounts;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}