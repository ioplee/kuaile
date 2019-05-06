package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]会员每日救济金豆领取记录表
**/

@Data
public class ADDMemberAlmsbeanInfoDTO implements Serializable {

    private static final long serialVersionUID = 6366946773806435401L;
    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   领取日期
    */
    @ApiModelProperty(value = "getDate" , required = true)
    @NotNull(message = "getDate不允许为空")
    private String getDate;
    /**
    *   领取救济金豆数
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}