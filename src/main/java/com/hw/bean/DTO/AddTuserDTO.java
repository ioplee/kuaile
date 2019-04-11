package com.hw.bean.DTO;/**
 * Created by robin on 2019/4/11.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-11 12:10
 * @description: 用户测试表 添加DTO
 **/

@Data
public class AddTuserDTO implements Serializable{
    private static final long serialVersionUID = 3277049979788085276L;

    @ApiModelProperty(value = "用户名" , required = true)
    @NotNull(message = "用户名不允许为空")
    private String name;
    @ApiModelProperty(value = "用户密码" , required = true)
    @NotNull(message = "用户密码不允许为空")
    private String password;
    @ApiModelProperty(value = "用户手机号码" , required = true)
    @NotNull(message = "用户手机号码不允许为空")
    private String phone;
}
