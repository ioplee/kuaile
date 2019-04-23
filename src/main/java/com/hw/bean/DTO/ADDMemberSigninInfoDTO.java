package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:19
* @description: [ADD DTO Bean]会员签到记录明细表（签到获取金豆明细表）
**/

@Data
public class ADDMemberSigninInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   
    */
    @ApiModelProperty(value = "signinDate" , required = true)
    @NotNull(message = "signinDate不允许为空")
    private String signinDate;
    /**
    *   
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Integer beanCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}