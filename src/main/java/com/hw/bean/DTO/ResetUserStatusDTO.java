package com.hw.bean.DTO;/**
 * Created by robin on 2019/5/29.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-29 12:21
 * @description: 修改平台用户状态DTO
 **/

@Data
public class ResetUserStatusDTO implements Serializable{
    private static final long serialVersionUID = 8860715503732853179L;

    @ApiModelProperty(value = "用户ID" , required = true)
    @NotNull(message = "用户ID不允许为空")
    private Long userId;

    /**
     *   用户状态-1删除 0停用 1有效
     */
    @ApiModelProperty(value = "userStatus" , required = true)
    @NotNull(message = "userStatus不允许为空")
    private Integer userStatus;
}
