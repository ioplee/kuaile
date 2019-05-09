package com.hw.dao;

import com.hw.bean.BO.QueryGameResultRule29Page;
import com.hw.bean.PO.GameResultRule29PO;
import com.hw.bean.VO.GameResultRule29VO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 游戏开奖结果-三数求和-16 DAO 数据库操作对象 Mybatis接口
**/

public interface GameResultRule29DAO{

    /**
    * Insert integer.  添加 游戏开奖结果-三数求和-16 记录
    *
    * @param gameResultRule29PO  游戏开奖结果-三数求和-16 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameResultRule29(GameResultRule29PO gameResultRule29PO);

    /**
    * Update integer.  修改游戏开奖结果-三数求和-16 记录
    *
    * @param gameResultRule29PO  游戏开奖结果-三数求和-16 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameResultRule29(GameResultRule29PO gameResultRule29PO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏开奖结果-三数求和-16列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameResultRule29Page query);

    /**
    * Select list list.
    *
    * @param query 获取游戏开奖结果-三数求和-16列表记录BO
    * @return the list  返回游戏开奖结果-三数求和-16记录集合
    */
    public List<GameResultRule29VO> getPageList(QueryGameResultRule29Page query);

    /**
    * Select by primary key 游戏开奖结果-三数求和-16 vo.
    *
    * @param PRI 记录ID
    * @return the GameResultRule29VO  指定 游戏开奖结果-三数求和-16 信息VO
    */
    public GameResultRule29VO getGameResultRule29ByPrimaryKey(@Param(value="PRI")Long PRI);

}