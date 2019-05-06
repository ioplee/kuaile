package com.hw.dao;

import com.hw.bean.BO.QueryGameResultRule10Page;
import com.hw.bean.PO.GameResultRule10PO;
import com.hw.bean.VO.GameResultRule10VO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:16
* @description: 游戏开奖结果-群数第一位 10 DAO 数据库操作对象 Mybatis接口
**/

public interface GameResultRule10DAO{

    /**
    * Insert integer.  添加 游戏开奖结果-群数第一位 10 记录
    *
    * @param gameResultRule10PO  游戏开奖结果-群数第一位 10 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameResultRule10(GameResultRule10PO gameResultRule10PO);

    /**
    * Update integer.  修改游戏开奖结果-群数第一位 10 记录
    *
    * @param gameResultRule10PO  游戏开奖结果-群数第一位 10 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameResultRule10(GameResultRule10PO gameResultRule10PO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏开奖结果-群数第一位 10列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameResultRule10Page query);

    /**
    * Select list list.
    *
    * @param query 获取游戏开奖结果-群数第一位 10列表记录BO
    * @return the list  返回游戏开奖结果-群数第一位 10记录集合
    */
    public List<GameResultRule10VO> getPageList(QueryGameResultRule10Page query);

    /**
    * Select by primary key 游戏开奖结果-群数第一位 10 vo.
    *
    * @param PRI 记录ID
    * @return the GameResultRule10VO  指定 游戏开奖结果-群数第一位 10 信息VO
    */
    public GameResultRule10VO getGameResultRule10ByPrimaryKey(@Param(value="PRI")Long PRI);

}