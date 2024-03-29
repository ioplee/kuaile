package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:28
* @description: [数据库实体BEAN]系统用户表
**/

@Data
public class SysUserPO implements Serializable {

    private static final long serialVersionUID = 1715005573966670850L;
    /**
    *   用户ID
    */
    private Long userId;
    /**
    *   用户姓名
    */
    private String userName;
    /**
    *   联系手机号码
    */
    private String userMobile;
    /**
    *   电子邮箱
    */
    private String userEmail;
    /**
    *   登录账户
    */
    private String userAccount;
    /**
    *   登录密码（64位加密）
    */
    private String userPassword;
    /**
    *   用户状态-1删除 0停用 1有效
    */
    private Integer userStatus;
    /**
    *   用户最后登录IP地址
    */
    private String lastLoginIp;
    /**
    *   用户最后登录时间
    */
    private String lastLoginTime;

    /**
     * 用户具有角色集合
     */
    private List<SysRelationUserRolePO> userRolePOList;
}
