package com.hw.dao;

import com.hw.bean.BO.QueryGamePlayerBettingPage;
import com.hw.bean.PO.GamePlayerBettingPO;
import com.hw.bean.VO.GamePlayerBettingVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:16
* @description: 玩家投注表 DAO 数据库操作对象 Mybatis接口
**/

public interface GamePlayerBettingDAO{

    /**
    * Insert integer.  添加 玩家投注表 记录
    *
    * @param gamePlayerBettingPO  玩家投注表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGamePlayerBetting(GamePlayerBettingPO gamePlayerBettingPO);

    /**
    * Update integer.  修改玩家投注表 记录
    *
    * @param gamePlayerBettingPO  玩家投注表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGamePlayerBetting(GamePlayerBettingPO gamePlayerBettingPO);

    /**
    * Select list count integer.
    *
    * @param query 获取玩家投注表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGamePlayerBettingPage query);

    /**
    * Select list list.
    *
    * @param query 获取玩家投注表列表记录BO
    * @return the list  返回玩家投注表记录集合
    */
    public List<GamePlayerBettingVO> getPageList(QueryGamePlayerBettingPage query);

    /**
    * Select by primary key 玩家投注表 vo.
    *
    * @param PRI 记录ID
    * @return the GamePlayerBettingVO  指定 玩家投注表 信息VO
    */
    public GamePlayerBettingVO getGamePlayerBettingByPrimaryKey(@Param(value="PRI")Long PRI);

}