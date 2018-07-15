package com.hw.services;

import com.github.pagehelper.Page;
import com.hw.biz.model.UserDomain;

/**
 * 用户服务
 */
public interface UserServices {
    public Page<UserDomain> findUserByPage(int pageNo, int pageSize) ;
}
