package com.hw.dao;

import com.hw.bean.BO.QueryGameResultRule36Page;
import com.hw.bean.PO.GameResultRule36PO;
import com.hw.bean.VO.GameResultRule36VO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 游戏开奖结果-三数组合类分类 36 DAO 数据库操作对象 Mybatis接口
**/

public interface GameResultRule36DAO{

    /**
    * Insert integer.  添加 游戏开奖结果-三数组合类分类 36 记录
    *
    * @param gameResultRule36PO  游戏开奖结果-三数组合类分类 36 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameResultRule36(GameResultRule36PO gameResultRule36PO);

    /**
    * Update integer.  修改游戏开奖结果-三数组合类分类 36 记录
    *
    * @param gameResultRule36PO  游戏开奖结果-三数组合类分类 36 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameResultRule36(GameResultRule36PO gameResultRule36PO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏开奖结果-三数组合类分类 36列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameResultRule36Page query);

    /**
    * Select list list.
    *
    * @param query 获取游戏开奖结果-三数组合类分类 36列表记录BO
    * @return the list  返回游戏开奖结果-三数组合类分类 36记录集合
    */
    public List<GameResultRule36VO> getPageList(QueryGameResultRule36Page query);

    /**
    * Select by primary key 游戏开奖结果-三数组合类分类 36 vo.
    *
    * @param PRI 记录ID
    * @return the GameResultRule36VO  指定 游戏开奖结果-三数组合类分类 36 信息VO
    */
    public GameResultRule36VO getGameResultRule36ByPrimaryKey(@Param(value="PRI")Long PRI);

}