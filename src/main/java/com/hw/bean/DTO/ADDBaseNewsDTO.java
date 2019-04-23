package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]平台新闻
**/

@Data
public class ADDBaseNewsDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "newsTitle" , required = true)
    @NotNull(message = "newsTitle不允许为空")
    private String newsTitle;
    /**
    *   
    */
    @ApiModelProperty(value = "newsDate" , required = true)
    @NotNull(message = "newsDate不允许为空")
    private String newsDate;
    /**
    *   
    */
    @ApiModelProperty(value = "newsContent" , required = true)
    @NotNull(message = "newsContent不允许为空")
    private String newsContent;
    /**
    *   -1删除 0撤回 1有效
    */
    @ApiModelProperty(value = "newsStatus" , required = true)
    @NotNull(message = "newsStatus不允许为空")
    private Integer newsStatus;
}