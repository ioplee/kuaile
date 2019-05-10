package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:08:58
* @description: [BO query bean]系统日志
**/

@Data
public class QuerySysLogByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 6757593942078933204L;
    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long logId;
}