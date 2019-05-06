package com.hw.dao;

import com.hw.bean.BO.QueryGameTypePage;
import com.hw.bean.PO.GameTypePO;
import com.hw.bean.VO.GameTypeVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:16
* @description: 游戏类型表 DAO 数据库操作对象 Mybatis接口
**/

public interface GameTypeDAO{

    /**
    * Insert integer.  添加 游戏类型表 记录
    *
    * @param gameTypePO  游戏类型表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameType(GameTypePO gameTypePO);

    /**
    * Update integer.  修改游戏类型表 记录
    *
    * @param gameTypePO  游戏类型表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameType(GameTypePO gameTypePO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏类型表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameTypePage query);

    /**
    * Select list list.
    *
    * @param query 获取游戏类型表列表记录BO
    * @return the list  返回游戏类型表记录集合
    */
    public List<GameTypeVO> getPageList(QueryGameTypePage query);

    /**
    * Select by primary key 游戏类型表 vo.
    *
    * @param PRI 记录ID
    * @return the GameTypeVO  指定 游戏类型表 信息VO
    */
    public GameTypeVO getGameTypeByPrimaryKey(@Param(value="PRI")Long PRI);

}