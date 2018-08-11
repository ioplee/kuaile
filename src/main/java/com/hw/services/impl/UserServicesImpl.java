package com.hw.services.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hw.biz.dao.UserMapper;
import com.hw.biz.model.UserDomain;
import com.hw.services.UserServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserServicesImpl implements UserServices {

    @Resource
    private UserMapper userMapper ;

    @Override
    public Page<UserDomain> findUserByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return userMapper.findAllByPage() ;
    }

    @Override
    public Page<UserDomain> findUserByPage(Map<String, String> params, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return userMapper.findSameByPage(params);
    }

    @Override
    public Page<UserDomain> findUserByPage(UserDomain user, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return userMapper.findUserByPage(user);
    }
}
