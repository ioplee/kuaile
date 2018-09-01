package com.hw.services.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hw.biz.dao.UserDAO;
import com.hw.biz.dao.UserMapper;
import com.hw.biz.model.UserDO;
import com.hw.biz.model.UserDomain;
import com.hw.services.UserServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserServicesImpl implements UserServices {

    @Resource
    private UserMapper userMapper ;

    private UserDAO userDAO;

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


    /**
     * 根据用户ID查询下级用户列表（一级）
     * @param userId
     * @return
     */
    @Override
    public List<UserDO> findChildrenByUserId(Long userId) {
        return null;
    }

    /**
     * 根据用户ID查询所有下级用户列表（所有）
     * @param userId
     * @return
     */
    @Override
    public List<UserDO> findAllChildrenByUserId(Long userId) {
        List<UserDO> userDOList = new ArrayList<UserDO>();
        return findChildrenByUserId(userDOList, userId);
    }

    /**
     * 迭代查询所有孩子节点信息
     * @param userDOList
     * @param userId
     * @return
     */
    private List<UserDO> findChildrenByUserId(List<UserDO> userDOList, Long userId) {
        if(null == userDOList) {
            userDOList = new ArrayList<UserDO>();
        }
        List<UserDO> childrenList = findChildrenByUserId(userId);
        if(null == childrenList || childrenList.size() == 0) {
            return userDOList;
        }
        userDOList.addAll(childrenList);
        for(UserDO children : childrenList) {
            findChildrenByUserId(userDOList, children.getId());
        }
        return userDOList;
    }

    @Override
    public UserDO findUserById(Long id) {
        return null;
    }

    @Override
    public void insert(UserDO userDO) {

    }

}
