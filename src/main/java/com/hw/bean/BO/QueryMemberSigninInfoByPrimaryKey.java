package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]会员签到记录表
**/

@Data
public class QueryMemberSigninInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -9146927599423639609L;
    @ApiModelProperty(value = "签到记录ID" , required = true)
    @NotNull(message = "签到记录ID不允许为空")
    private Long infoId;
}