package com.hw.bean.DTO.player;/**
 * Created by robin on 2019/5/27.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 15:08
 * @description: 发送短信验证码
 **/

@Data
public class SendVeryCodeDTO implements Serializable {
    private static final long serialVersionUID = 9089220554715621702L;

    @ApiModelProperty(value = "手机号码" , required = true)
    @NotNull(message = "手机号码不允许为空")
    private String mobile;
    @ApiModelProperty(value = "短信类型" , required = true)
    @NotNull(message = "短信类型不允许为空")
    private Integer codeType;
    @ApiModelProperty(value = "用户ID")
    private Long userID;
    @ApiModelProperty(value = "发送事件" , required = true)
    @NotNull(message = "发送事件不允许为空")
    private String sendTime;
}
