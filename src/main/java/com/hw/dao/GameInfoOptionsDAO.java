package com.hw.dao;

import com.hw.bean.BO.QueryGameInfoOptionsPage;
import com.hw.bean.PO.GameInfoOptionsPO;
import com.hw.bean.VO.GameInfoOptionsVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:16
* @description: 游戏投注项 DAO 数据库操作对象 Mybatis接口
**/

public interface GameInfoOptionsDAO{

    /**
    * Insert integer.  添加 游戏投注项 记录
    *
    * @param gameInfoOptionsPO  游戏投注项 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertGameInfoOptions(GameInfoOptionsPO gameInfoOptionsPO);

    /**
    * Update integer.  修改游戏投注项 记录
    *
    * @param gameInfoOptionsPO  游戏投注项 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateGameInfoOptions(GameInfoOptionsPO gameInfoOptionsPO);

    /**
    * Select list count integer.
    *
    * @param query 获取游戏投注项列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryGameInfoOptionsPage query);

    /**
    * Select list list.
    *
    * @param query 获取游戏投注项列表记录BO
    * @return the list  返回游戏投注项记录集合
    */
    public List<GameInfoOptionsVO> getPageList(QueryGameInfoOptionsPage query);

    /**
    * Select by primary key 游戏投注项 vo.
    *
    * @param PRI 记录ID
    * @return the GameInfoOptionsVO  指定 游戏投注项 信息VO
    */
    public GameInfoOptionsVO getGameInfoOptionsByPrimaryKey(@Param(value="PRI")Long PRI);

}