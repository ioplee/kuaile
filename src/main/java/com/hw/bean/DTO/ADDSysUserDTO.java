package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:59
* @description: [ADD DTO Bean]系统用户表
**/

@Data
public class ADDSysUserDTO implements Serializable {

    private static final long serialVersionUID = 2958460673814308532L;
    /**
    *   用户姓名
    */
    @ApiModelProperty(value = "userName" , required = true)
    @NotNull(message = "userName不允许为空")
    private String userName;
    /**
    *   联系手机号码
    */
    @ApiModelProperty(value = "userMobile" , required = true)
    @NotNull(message = "userMobile不允许为空")
    private String userMobile;
    /**
    *   电子邮箱
    */
    @ApiModelProperty(value = "userEmail" , required = true)
    @NotNull(message = "userEmail不允许为空")
    private String userEmail;
    /**
    *   登录账户
    */
    @ApiModelProperty(value = "userAccount" , required = true)
    @NotNull(message = "userAccount不允许为空")
    private String userAccount;
    /**
    *   登录密码（64位加密）
    */
    @ApiModelProperty(value = "userPassword" , required = true)
    @NotNull(message = "userPassword不允许为空")
    private String userPassword;
    /**
    *   用户状态-1删除 0停用 1有效
    */
    @ApiModelProperty(value = "userStatus" , required = true)
    @NotNull(message = "userStatus不允许为空")
    private Integer userStatus;

    /**
     * 角色赋予的菜单集合
     */
    @ApiModelProperty(value = "菜单ID集合,例如1,2")
    private List<Long> resourceID;
}