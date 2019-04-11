package com.hw.bean.DTO;/**
 * Created by robin on 2019/4/11.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-11 12:15
 * @description: 测试用户表 设置用户状态DTO
 **/

@Data
public class SetTUserStatusDTO implements Serializable{
    private static final long serialVersionUID = 4403796922788554099L;

    @ApiModelProperty(value = "用户ID" , required = true)
    @NotNull(message = "用户ID不允许为空")
    private Integer id;
    @ApiModelProperty(value = "用户状态(-1删除0停用1有效)" , required = true)
    @NotNull(message = "用户状态不允许为空")
    private Integer userStatus;
}
