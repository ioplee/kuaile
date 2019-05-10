package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:10:59
* @description: [ADD DTO Bean]系统日志
**/

@Data
public class ADDSysLogDTO implements Serializable {

    private static final long serialVersionUID = 8387784239331993342L;
    /**
    *   1 运营端（oss）
            2 代理端（agent）
            3 客户端（PC）
            4 客户端（App）
    */
    @ApiModelProperty(value = "logSys" , required = true)
    @NotNull(message = "logSys不允许为空")
    private String logSys;
    /**
    *   模块记录对应着相关的模块列表（此列表目前不在库中保存，后续添加进来）
    */
    @ApiModelProperty(value = "logModule" , required = true)
    @NotNull(message = "logModule不允许为空")
    private String logModule;
    /**
    *   功能名称
    */
    @ApiModelProperty(value = "logFunction" , required = true)
    @NotNull(message = "logFunction不允许为空")
    private String logFunction;
    /**
    *   操作人ID
    */
    @ApiModelProperty(value = "logUserId" , required = true)
    @NotNull(message = "logUserId不允许为空")
    private Long logUserId;
    /**
    *   具体业务操作描述
    */
    @ApiModelProperty(value = "logBizMessage" , required = true)
    @NotNull(message = "logBizMessage不允许为空")
    private String logBizMessage;
    /**
    *   操作的具体时间
    */
    @ApiModelProperty(value = "logBizTime" , required = true)
    @NotNull(message = "logBizTime不允许为空")
    private String logBizTime;
}