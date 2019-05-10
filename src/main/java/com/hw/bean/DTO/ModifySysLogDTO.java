package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 11:11:08
* @description: [ADD DTO Bean]系统日志
**/

@Data
public class ModifySysLogDTO extends ADDSysLogDTO {

    private static final long serialVersionUID = 3773795844705673412L;
    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long logId;

}