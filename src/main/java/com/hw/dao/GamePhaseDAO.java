package com.hw.dao;

import com.hw.bean.BO.QueryGamePhasePage;
import com.hw.bean.PO.GamePhasePO;
import com.hw.bean.VO.GamePhaseVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 游戏期数信息 DAO 数据库操作对象 Mybatis接口
**/

public interface GamePhaseDAO{

    /**
    * Insert integer.  添加 游戏期数信息 记录
    *
    * @param gamePhasePO  游戏期数信息 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGamePhase(GamePhasePO gamePhasePO);

    /**
    * Update integer.  修改游戏期数信息 记录
    *
    * @param gamePhasePO  游戏期数信息 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGamePhase(GamePhasePO gamePhasePO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏期数信息列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGamePhasePage query);

    /**
    * Select list list.
    *
    * @param query 获取游戏期数信息列表记录BO
    * @return the list  返回游戏期数信息记录集合
    */
    public List<GamePhaseVO> getPageList(QueryGamePhasePage query);

    /**
    * Select by primary key 游戏期数信息 vo.
    *
    * @param PRI 记录ID
    * @return the GamePhaseVO  指定 游戏期数信息 信息VO
    */
    public GamePhaseVO getGamePhaseByPrimaryKey(@Param(value="PRI")Long PRI);

}