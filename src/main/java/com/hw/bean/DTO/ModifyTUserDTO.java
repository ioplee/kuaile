package com.hw.bean.DTO;/**
 * Created by robin on 2019/4/11.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: Robin
 * @create: 2019-04-11 12:13
 * @description: 测试用户表 修改用户信息
 **/

@Data
public class ModifyTUserDTO extends AddTuserDTO{
    private static final long serialVersionUID = 5103378374647569192L;

    @ApiModelProperty(value = "用户ID" , required = true)
    @NotNull(message = "用户ID不允许为空")
    private Integer id;
    @ApiModelProperty(value = "用户状态(-1删除0停用1有效)" , required = true)
    @NotNull(message = "用户状态不允许为空")
    private Integer userStatus;
}
