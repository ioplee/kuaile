package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]会员 金豆账户和虚拟银行账户之间转换记录
**/

@Data
public class ADDMemberAccountChangeDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   1 金豆存入银行账户
            2 从银行账户取金豆
    */
    @ApiModelProperty(value = "infoType" , required = true)
    @NotNull(message = "infoType不允许为空")
    private Integer infoType;
    /**
    *   
    */
    @ApiModelProperty(value = "changeCounts" , required = true)
    @NotNull(message = "changeCounts不允许为空")
    private Long changeCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
    /**
    *   
    */
    @ApiModelProperty(value = "infoTime" , required = true)
    @NotNull(message = "infoTime不允许为空")
    private String infoTime;
    /**
    *   
    */
    @ApiModelProperty(value = "infoDesc")
    private String infoDesc;
}