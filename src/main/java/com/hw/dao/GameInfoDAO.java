package com.hw.dao;

import com.hw.bean.BO.QueryGameInfoPage;
import com.hw.bean.PO.GameInfoPO;
import com.hw.bean.VO.GameInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:16
* @description: 游戏信息表 DAO 数据库操作对象 Mybatis接口
**/

public interface GameInfoDAO{

    /**
    * Insert integer.  添加 游戏信息表 记录
    *
    * @param gameInfoPO  游戏信息表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameInfo(GameInfoPO gameInfoPO);

    /**
    * Update integer.  修改游戏信息表 记录
    *
    * @param gameInfoPO  游戏信息表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameInfo(GameInfoPO gameInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏信息表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取游戏信息表列表记录BO
    * @return the list  返回游戏信息表记录集合
    */
    public List<GameInfoVO> getPageList(QueryGameInfoPage query);

    /**
    * Select by primary key 游戏信息表 vo.
    *
    * @param PRI 记录ID
    * @return the GameInfoVO  指定 游戏信息表 信息VO
    */
    public GameInfoVO getGameInfoByPrimaryKey(@Param(value="PRI")Long PRI);

}