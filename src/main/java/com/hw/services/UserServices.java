package com.hw.services;

import com.github.pagehelper.Page;
import com.hw.biz.model.UserDomain;

import java.util.Map;

/**
 * 用户服务
 */
public interface UserServices {
    public Page<UserDomain> findUserByPage(int pageNo, int pageSize) ;

    public Page<UserDomain> findUserByPage(Map<String,String> params, int pageNo, int pageSize) ;

    public Page<UserDomain> findUserByPage(UserDomain user, int pageNo, int pageSize) ;
}
