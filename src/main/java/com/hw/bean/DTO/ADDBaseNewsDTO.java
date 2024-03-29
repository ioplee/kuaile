package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:52
* @description: [ADD DTO Bean]新闻公告表
**/

@Data
public class ADDBaseNewsDTO implements Serializable {

    private static final long serialVersionUID = 5626060519331593201L;
    /**
    *   新闻标题
    */
    @ApiModelProperty(value = "newsTitle" , required = true)
    @NotNull(message = "newsTitle不允许为空")
    private String newsTitle;
    /**
    *   新闻时间
    */
    @ApiModelProperty(value = "newsDate" , required = true)
    @NotNull(message = "newsDate不允许为空")
    private String newsDate;
    /**
    *   新闻内容
    */
    @ApiModelProperty(value = "newsContent" , required = true)
    @NotNull(message = "newsContent不允许为空")
    private String newsContent;
    /**
    *   新闻状态
    */
    @ApiModelProperty(value = "newsStatus" , required = true)
    @NotNull(message = "newsStatus不允许为空")
    private Integer newsStatus;
}