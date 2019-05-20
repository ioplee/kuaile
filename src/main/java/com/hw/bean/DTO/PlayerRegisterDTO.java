package com.hw.bean.DTO;/**
 * Created by robin on 2019/5/15.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-15 18:26
 * @description: 玩家注册 DTO
 **/

@Data
public class PlayerRegisterDTO implements Serializable{
    private static final long serialVersionUID = 1266794645185662291L;

    /**
     *   手机号码
     */
    @ApiModelProperty(value = "注册手机号码" , required = true)
    @NotNull(message = "注册手机号码 不允许为空")
    private String memberMobile;

    /**
     *   注册日期
     */
    @ApiModelProperty(value = "注册日期" , required = true)
    @NotNull(message = "注册日期 不允许为空")
    private String registerDate;

    /**
     * 登录密码
     */
    @ApiModelProperty(value = "登录密码,在注册类型为1注册时此属性必须有值")
    private String loginPass;

    /**
     * 注册类型(1注册 2快速注册)
     */
    @ApiModelProperty(value = "注册类型(1注册 2快速注册)" , required = true)
    @NotNull(message = "注册类型 不允许为空")
    private Integer regType;

}
