package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP
**/

@Data
public class ADDMemberAlmsbeanInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   
    */
    @ApiModelProperty(value = "getDate" , required = true)
    @NotNull(message = "getDate不允许为空")
    private String getDate;
    /**
    *   
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}