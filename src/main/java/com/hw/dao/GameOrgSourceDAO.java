package com.hw.dao;

import com.hw.bean.BO.QueryGameOrgSourcePage;
import com.hw.bean.PO.GameOrgSourcePO;
import com.hw.bean.VO.GameOrgSourceVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:16
* @description: 开奖数据源记录表 DAO 数据库操作对象 Mybatis接口
**/

public interface GameOrgSourceDAO{

    /**
    * Insert integer.  添加 开奖数据源记录表 记录
    *
    * @param gameOrgSourcePO  开奖数据源记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameOrgSource(GameOrgSourcePO gameOrgSourcePO);

    /**
    * Update integer.  修改开奖数据源记录表 记录
    *
    * @param gameOrgSourcePO  开奖数据源记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameOrgSource(GameOrgSourcePO gameOrgSourcePO);

    /**
    * Select list count integer.
    *
    * @param query 获取开奖数据源记录表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameOrgSourcePage query);

    /**
    * Select list list.
    *
    * @param query 获取开奖数据源记录表列表记录BO
    * @return the list  返回开奖数据源记录表记录集合
    */
    public List<GameOrgSourceVO> getPageList(QueryGameOrgSourcePage query);

    /**
    * Select by primary key 开奖数据源记录表 vo.
    *
    * @param PRI 记录ID
    * @return the GameOrgSourceVO  指定 开奖数据源记录表 信息VO
    */
    public GameOrgSourceVO getGameOrgSourceByPrimaryKey(@Param(value="PRI")Long PRI);

}