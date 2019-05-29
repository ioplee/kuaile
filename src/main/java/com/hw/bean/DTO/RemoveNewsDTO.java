package com.hw.bean.DTO;/**
 * Created by robin on 2019/5/29.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-29 17:02
 * @description: 管理端 删除公告DTO
 **/

@Data
public class RemoveNewsDTO implements Serializable{
    private static final long serialVersionUID = -5135994975930299899L;

    @ApiModelProperty(value = "公告ID" , required = true)
    @NotNull(message = "公告ID不允许为空")
    private Long newsId;

    /**
     *   新闻状态
     */
    @ApiModelProperty(value = "公告状态(-1删除 0停用 1发布)" , required = true)
    @NotNull(message = "公告状态不允许为空")
    private Integer newsStatus;
}
