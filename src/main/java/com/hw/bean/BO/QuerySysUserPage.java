package com.hw.bean.BO;

import com.hw.utils.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @author: Robin
* @create: 2019-05-10 11:08:58
* @description: [BO query bean]系统用户表
**/

@Data
public class QuerySysUserPage extends BaseQuery {

    private static final long serialVersionUID = -7429540744369617389L;

    /**
     *   用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String userName;
    /*
    *   登录账户
    */
    @ApiModelProperty(value = "登录名")
    private String userAccount;
}
