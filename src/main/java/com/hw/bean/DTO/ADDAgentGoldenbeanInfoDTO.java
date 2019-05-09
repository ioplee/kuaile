package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]代理商金豆明细表
**/

@Data
public class ADDAgentGoldenbeanInfoDTO implements Serializable {

    /**
    *   代理商iD
    */
    @ApiModelProperty(value = "agentId" , required = true)
    @NotNull(message = "agentId不允许为空")
    private Long agentId;
    /**
    *   记录类型
    */
    @ApiModelProperty(value = "infoType" , required = true)
    @NotNull(message = "infoType不允许为空")
    private Integer infoType;
    /**
    *   金豆数值
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   业务记录ID
    */
    @ApiModelProperty(value = "bizId" , required = true)
    @NotNull(message = "bizId不允许为空")
    private Long bizId;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
    /**
    *   基础金豆数
    */
    @ApiModelProperty(value = "baseCounts" , required = true)
    @NotNull(message = "baseCounts不允许为空")
    private Long baseCounts;
    /**
    *   返点金豆数
    */
    @ApiModelProperty(value = "rebateCounts" , required = true)
    @NotNull(message = "rebateCounts不允许为空")
    private Long rebateCounts;
}