package com.hw.dao;

import com.hw.bean.BO.QueryGameResultRule11Page;
import com.hw.bean.PO.GameResultRule11PO;
import com.hw.bean.VO.GameResultRule11VO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 游戏开奖结果-二数求和 11 DAO 数据库操作对象 Mybatis接口
**/

public interface GameResultRule11DAO{

    /**
    * Insert integer.  添加 游戏开奖结果-二数求和 11 记录
    *
    * @param gameResultRule11PO  游戏开奖结果-二数求和 11 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameResultRule11(GameResultRule11PO gameResultRule11PO);

    /**
    * Update integer.  修改游戏开奖结果-二数求和 11 记录
    *
    * @param gameResultRule11PO  游戏开奖结果-二数求和 11 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameResultRule11(GameResultRule11PO gameResultRule11PO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏开奖结果-二数求和 11列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameResultRule11Page query);

    /**
    * Select list list.
    *
    * @param query 获取游戏开奖结果-二数求和 11列表记录BO
    * @return the list  返回游戏开奖结果-二数求和 11记录集合
    */
    public List<GameResultRule11VO> getPageList(QueryGameResultRule11Page query);

    /**
    * Select by primary key 游戏开奖结果-二数求和 11 vo.
    *
    * @param PRI 记录ID
    * @return the GameResultRule11VO  指定 游戏开奖结果-二数求和 11 信息VO
    */
    public GameResultRule11VO getGameResultRule11ByPrimaryKey(@Param(value="PRI")Long PRI);

}