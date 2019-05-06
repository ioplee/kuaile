package com.hw.dao;

import com.hw.bean.BO.QueryMemberLevelPage;
import com.hw.bean.VO.MemberLevelVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 会员等级定义表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberLevelDAO{

    /**
    * Insert integer.  添加 会员等级定义表 记录
    *
    * @param memberLevelPO  会员等级定义表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberLevel(MemberLevelPO memberLevelPO);

    /**
    * Update integer.  修改会员等级定义表 记录
    *
    * @param memberLevelPO  会员等级定义表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberLevel(MemberLevelPO memberLevelPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员等级定义表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberLevelPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员等级定义表列表记录BO
    * @return the list  返回会员等级定义表记录集合
    */
    public List<MemberLevelVO> getPageList(QueryMemberLevelPage query);

    /**
    * Select by primary key 会员等级定义表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberLevelVO  指定 会员等级定义表 信息VO
    */
    public MemberLevelVO getMemberLevelByPrimaryKey(@Param(value = "PRI") Long PRI);

}