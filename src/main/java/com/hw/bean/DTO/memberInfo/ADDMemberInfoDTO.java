package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/15.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-15 22:39
 * @description: 添加玩家信息DTO
 **/

@Data
public class AddMemberInfoDTO implements Serializable {
    private static final long serialVersionUID = 7244731274982421845L;

    /**
     * 平台唯一有序会员编码,业务交易及核心业务主要验证身份依据.
     */
    @ApiModelProperty(value = "玩家名称" , required = true)
    @NotNull(message = "玩家名称不允许为空")
    private String memberName;

    @ApiModelProperty(value = "昵称" , required = true)
    @NotNull(message = "昵称不允许为空")
    private String memberNickname;

    /**
     * 手机号码,需前段对手机号码合法性进行校验
     */
    @ApiModelProperty(value = "注册手机" , required = true)
    @NotNull(message = "注册手机不允许为空")
    private String memberMobile;

    @ApiModelProperty(value = "注册日期" , required = true)
    @NotNull(message = "注册日期不允许为空")
    private String registerDate;

    /**
     * 注册时，注册地址带的会员编码所对应的会员ID
     */
    @ApiModelProperty(value = "上级会员ID" )
    private Long parentId;

}
