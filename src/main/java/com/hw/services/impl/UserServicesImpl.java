package com.hw.services.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hw.biz.dao.UserDAO;
import com.hw.biz.dao.UserMapper;
import com.hw.biz.model.UserDO;
import com.hw.biz.model.UserDomain;
import com.hw.services.UserServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserServicesImpl implements UserServices {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserMapper userMapper ;

    @Resource
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
        try {
            return userDAO.findChildrenByUserId(userId);
        } catch (Exception e) {
            log.error("根据用户ID查询下级用户列表（一级）", e);
            return null;
        }
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
        UserDO userDO = null;
        try {
            userDO = userDAO.findUserById(id);
        } catch (Exception e) {
            log.error("根据ID查询用户信息", e);
        }
        return userDO;
    }

    @Override
    public void createUser(UserDO userDO) {
        try {
            userDAO.insert(userDO);
        } catch(Exception e) {
            log.error("新增用户", e);
        }
    }

    @Override
    public void modifyUser(UserDO userDO) {
        try {
            userDAO.update(userDO);
        } catch(Exception e) {
            log.error("修改用户", e);
        }
    }

    @Override
    public void removeUser(Long id) {
        try {
            userDAO.delete(id);
        } catch(Exception e) {
            log.error("移除用户", e);
        }
    }

}
