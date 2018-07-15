package com.hw.services.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hw.biz.dao.UserMapper;
import com.hw.biz.model.UserDomain;
import com.hw.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServicesImpl implements UserServices {

    @Resource
    private UserMapper userMapper ;

    @Override
    public Page<UserDomain> findUserByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        Page<UserDomain> list = userMapper.findAllByPage() ;
        return list;
    }
}
