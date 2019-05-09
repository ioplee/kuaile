package com.hw.dao;

import com.hw.bean.BO.QueryGameDataSourcePage;
import com.hw.bean.PO.GameDataSourcePO;
import com.hw.bean.VO.GameDataSourceVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:41
* @description: 游戏数据源表 DAO 数据库操作对象 Mybatis接口
**/

public interface GameDataSourceDAO{

    /**
    * Insert integer.  添加 游戏数据源表 记录
    *
    * @param gameDataSourcePO  游戏数据源表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameDataSource(GameDataSourcePO gameDataSourcePO);

    /**
    * Update integer.  修改游戏数据源表 记录
    *
    * @param gameDataSourcePO  游戏数据源表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameDataSource(GameDataSourcePO gameDataSourcePO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏数据源表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameDataSourcePage query);

    /**
    * Select list list.
    *
    * @param query 获取游戏数据源表列表记录BO
    * @return the list  返回游戏数据源表记录集合
    */
    public List<GameDataSourceVO> getPageList(QueryGameDataSourcePage query);

    /**
    * Select by primary key 游戏数据源表 vo.
    *
    * @param PRI 记录ID
    * @return the GameDataSourceVO  指定 游戏数据源表 信息VO
    */
    public GameDataSourceVO getGameDataSourceByPrimaryKey(@Param(value="PRI")Long PRI);

}