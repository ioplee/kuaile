package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameResultRule36PO;
import com.hw.bean.VO.GameResultRule36VO;
import com.hw.bean.BO.QueryGameResultRule36Page;
import com.hw.bean.BO.QueryGameResultRule36ByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 游戏开奖结果-三数组合类分类 36 Service 接口
**/

public interface GameResultRule36Service {

    /**
    * Add 游戏开奖结果-三数组合类分类 36 dto.
    *
    * @param gameResultRule36PO  游戏开奖结果-三数组合类分类 36 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameResultRule36(GameResultRule36PO gameResultRule36PO);

    /**
    * Modify 游戏开奖结果-三数组合类分类 36 dto.
    *
    * @param gameResultRule36PO  游戏开奖结果-三数组合类分类 36 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameResultRule36(GameResultRule36PO gameResultRule36PO);

    /**
    * Gets GameResultRule36 info.
    *
    * @param queryGameResultRule36ByPrimaryKey the query GameResultRule36 bean by primary key
    * @return the info
    */
    public ResultDTO<GameResultRule36VO> getgameResultRule36(QueryGameResultRule36ByPrimaryKey queryGameResultRule36ByPrimaryKey);

    /**
    * Gets GameResultRule36 list.
    *
    * @param queryGameResultRule36Page the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameResultRule36VO> getGameResultRule36List(QueryGameResultRule36Page queryGameResultRule36Page);
}
