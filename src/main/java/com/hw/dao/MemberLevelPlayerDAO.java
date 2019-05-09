package com.hw.dao;

import com.hw.bean.BO.QueryMemberLevelPlayerPage;
import com.hw.bean.PO.MemberLevelPlayerPO;
import com.hw.bean.VO.MemberLevelPlayerVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 玩家会员等级表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberLevelPlayerDAO{

    /**
    * Insert integer.  添加 玩家会员等级表 记录
    *
    * @param memberLevelPlayerPO  玩家会员等级表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberLevelPlayer(MemberLevelPlayerPO memberLevelPlayerPO);

    /**
    * Update integer.  修改玩家会员等级表 记录
    *
    * @param memberLevelPlayerPO  玩家会员等级表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberLevelPlayer(MemberLevelPlayerPO memberLevelPlayerPO);

    /**
    * Select list count integer.
    *
    * @param query 获取玩家会员等级表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberLevelPlayerPage query);

    /**
    * Select list list.
    *
    * @param query 获取玩家会员等级表列表记录BO
    * @return the list  返回玩家会员等级表记录集合
    */
    public List<MemberLevelPlayerVO> getPageList(QueryMemberLevelPlayerPage query);

    /**
    * Select by primary key 玩家会员等级表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberLevelPlayerVO  指定 玩家会员等级表 信息VO
    */
    public MemberLevelPlayerVO getMemberLevelPlayerByPrimaryKey(@Param(value="PRI")Long PRI);

}