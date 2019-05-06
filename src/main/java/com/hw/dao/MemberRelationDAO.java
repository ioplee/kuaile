package com.hw.dao;

import com.hw.bean.BO.QueryMemberRelationPage;
import com.hw.bean.PO.MemberRelationPO;
import com.hw.bean.VO.MemberRelationVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:17
* @description: 玩家关系族谱表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberRelationDAO{

    /**
    * Insert integer.  添加 玩家关系族谱表 记录
    *
    * @param memberRelationPO  玩家关系族谱表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberRelation(MemberRelationPO memberRelationPO);

    /**
    * Update integer.  修改玩家关系族谱表 记录
    *
    * @param memberRelationPO  玩家关系族谱表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberRelation(MemberRelationPO memberRelationPO);

    /**
    * Select list count integer.
    *
    * @param query 获取玩家关系族谱表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberRelationPage query);

    /**
    * Select list list.
    *
    * @param query 获取玩家关系族谱表列表记录BO
    * @return the list  返回玩家关系族谱表记录集合
    */
    public List<MemberRelationVO> getPageList(QueryMemberRelationPage query);

    /**
    * Select by primary key 玩家关系族谱表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberRelationVO  指定 玩家关系族谱表 信息VO
    */
    public MemberRelationVO getMemberRelationByPrimaryKey(@Param(value="PRI")Long PRI);

}