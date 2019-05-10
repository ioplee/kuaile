package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]会员金豆账户表
**/

@Data
public class ADDMemberGoldenbaenDTO implements Serializable {

    private static final long serialVersionUID = -1964696123024689582L;
    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   金豆总数
    */
    @ApiModelProperty(value = "beanCount" , required = true)
    @NotNull(message = "beanCount不允许为空")
    private Long beanCount;
    /**
    *   账户状态
    */
    @ApiModelProperty(value = "beanStatus" , required = true)
    @NotNull(message = "beanStatus不允许为空")
    private Integer beanStatus;
}