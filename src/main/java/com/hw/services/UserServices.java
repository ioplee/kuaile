package com.hw.services;

import com.github.pagehelper.Page;
import com.hw.biz.dao.UserDAO;
import com.hw.biz.model.UserDO;
import com.hw.biz.model.UserDomain;

import java.util.List;
import java.util.Map;

/**
 * 用户服务
 */
public interface UserServices {
    public Page<UserDomain> findUserByPage(int pageNo, int pageSize) ;

    public Page<UserDomain> findUserByPage(Map<String,String> params, int pageNo, int pageSize) ;

    public Page<UserDomain> findUserByPage(UserDomain user, int pageNo, int pageSize) ;


    /**
     * 根据用户ID查询下级用户列表
     * @param userId
     * @return
     */
    public List<UserDO> findChildrenByUserId(Long userId);

    /**
     * 根据用户ID查询所有发展体系的用户列表
     * @param userId
     * @return
     */
    public List<UserDO> findAllChildrenByUserId(Long userId);

    public UserDO findUserById(Long id);

    public void createUser(UserDO userDO);

    public void modifyUser(UserDO userDO);

    public void removeUser(Long id);

}
