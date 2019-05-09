package com.hw.dao;

import com.hw.bean.BO.QueryGameResultRule28Page;
import com.hw.bean.PO.GameResultRule28PO;
import com.hw.bean.VO.GameResultRule28VO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 游戏开奖结果-三数求和-28 DAO 数据库操作对象 Mybatis接口
**/

public interface GameResultRule28DAO{

    /**
    * Insert integer.  添加 游戏开奖结果-三数求和-28 记录
    *
    * @param gameResultRule28PO  游戏开奖结果-三数求和-28 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameResultRule28(GameResultRule28PO gameResultRule28PO);

    /**
    * Update integer.  修改游戏开奖结果-三数求和-28 记录
    *
    * @param gameResultRule28PO  游戏开奖结果-三数求和-28 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameResultRule28(GameResultRule28PO gameResultRule28PO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏开奖结果-三数求和-28列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameResultRule28Page query);

    /**
    * Select list list.
    *
    * @param query 获取游戏开奖结果-三数求和-28列表记录BO
    * @return the list  返回游戏开奖结果-三数求和-28记录集合
    */
    public List<GameResultRule28VO> getPageList(QueryGameResultRule28Page query);

    /**
    * Select by primary key 游戏开奖结果-三数求和-28 vo.
    *
    * @param PRI 记录ID
    * @return the GameResultRule28VO  指定 游戏开奖结果-三数求和-28 信息VO
    */
    public GameResultRule28VO getGameResultRule28ByPrimaryKey(@Param(value="PRI")Long PRI);

}