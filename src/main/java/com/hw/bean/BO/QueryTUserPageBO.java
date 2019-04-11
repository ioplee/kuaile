package com.hw.bean.BO;/**
 * Created by robin on 2019/4/11.
 */

import com.hw.utils.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: Robin
 * @create: 2019-04-11 12:16
 * @description: 测试用户表 获取用户列表BO
 **/

@Data
public class QueryTUserPageBO extends BaseQuery{
    private static final long serialVersionUID = -8429799782461551552L;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "用户手机号码")
    private String phone;
    @ApiModelProperty(value = "用户状态(-1全部0停用1有效),默认-1" , required = true)
    @NotNull(message = "用户状态不允许为空")
    private Integer userStatus;
}
