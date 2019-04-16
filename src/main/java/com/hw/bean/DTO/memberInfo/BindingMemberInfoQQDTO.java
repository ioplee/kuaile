package com.hw.bean.DTO.memberInfo;/**
 * Created by robin on 2019/4/15.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-15 23:07
 * @description: 玩家绑定QQ
 **/

@Data
public class BindingMemberInfoQQDTO implements Serializable {
    private static final long serialVersionUID = -6961350398344417470L;

    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;

    @ApiModelProperty(value = "QQ" , required = true)
    @NotNull(message = "QQ不允许为空")
    private String memberQq;
}
