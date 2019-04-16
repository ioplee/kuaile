package com.hw.bean.BO.memberInfo;/**
 * Created by robin on 2019/4/16.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-16 09:37
 * @description: 查询指定玩家信息BO
 **/

@Data
public class QueryMemberInfoByKeyBO implements Serializable{
    private static final long serialVersionUID = 184473437816636102L;

    @ApiModelProperty(value = "玩家ID" , required = true)
    @NotNull(message = "玩家ID不允许为空")
    private Long memberId;
}
