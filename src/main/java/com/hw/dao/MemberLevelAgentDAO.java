package com.hw.dao;

import com.hw.bean.BO.QueryMemberLevelAgentPage;
import com.hw.bean.PO.MemberLevelAgentPO;
import com.hw.bean.VO.MemberLevelAgentVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 代理会员等级（直充模式下代理玩家各个等级的配置信息） DAO 数据库操作对象 Mybatis接口
**/

public interface MemberLevelAgentDAO{

    /**
    * Insert integer.  添加 代理会员等级（直充模式下代理玩家各个等级的配置信息） 记录
    *
    * @param memberLevelAgentPO  代理会员等级（直充模式下代理玩家各个等级的配置信息） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberLevelAgent(MemberLevelAgentPO memberLevelAgentPO);

    /**
    * Update integer.  修改代理会员等级（直充模式下代理玩家各个等级的配置信息） 记录
    *
    * @param memberLevelAgentPO  代理会员等级（直充模式下代理玩家各个等级的配置信息） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberLevelAgent(MemberLevelAgentPO memberLevelAgentPO);

    /**
    * Select list count integer.
    *
    * @param query 获取代理会员等级（直充模式下代理玩家各个等级的配置信息）列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberLevelAgentPage query);

    /**
    * Select list list.
    *
    * @param query 获取代理会员等级（直充模式下代理玩家各个等级的配置信息）列表记录BO
    * @return the list  返回代理会员等级（直充模式下代理玩家各个等级的配置信息）记录集合
    */
    public List<MemberLevelAgentVO> getPageList(QueryMemberLevelAgentPage query);

    /**
    * Select by primary key 代理会员等级（直充模式下代理玩家各个等级的配置信息） vo.
    *
    * @param PRI 记录ID
    * @return the MemberLevelAgentVO  指定 代理会员等级（直充模式下代理玩家各个等级的配置信息） 信息VO
    */
    public MemberLevelAgentVO getMemberLevelAgentByPrimaryKey(@Param(value="PRI")Long PRI);

}