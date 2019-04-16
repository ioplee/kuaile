package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/15.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: Robin
 * @create: 2019-04-15 22:42
 * @description: 修改玩家信息DTO
 **/

@Data
public class ModifyMemberInfoDTO extends AddMemberInfoDTO {
    private static final long serialVersionUID = 142996974333499070L;

    /**
     * 会员信息
     */
    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String memberEmail;

    /**
     * 真实姓名
     */
    @ApiModelProperty(value = "真实名称")
    private String userName;

    /**
     * 0不需要1需要微信验证
     */
    @ApiModelProperty(value = "登录微信验证设置(0不需要1需要验证)",required = true)
    @NotNull(message = "登录微信验证设置不允许为空")
    private Integer isWxcheck;

}
