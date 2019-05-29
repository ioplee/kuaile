package com.hw.bean.DTO;/**
 * Created by robin on 2019/5/28.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-28 16:10
 * @description: 平台用户登录DTO
 **/

@Data
public class PlamLoginDTO implements Serializable{
    private static final long serialVersionUID = 8049122405022490522L;

    @ApiModelProperty(value = "用户名" , required = true)
    @NotNull(message = "用户名不允许为空")
    private String userAccount;

    @ApiModelProperty(value = "登录密码" , required = true)
    @NotNull(message = "登录密码不允许为空")
    private String userPassword;
}
