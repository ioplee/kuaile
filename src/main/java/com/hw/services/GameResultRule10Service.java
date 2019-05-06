package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameResultRule10PO;
import com.hw.bean.VO.GameResultRule10VO;
import com.hw.bean.BO.QueryGameResultRule10Page;
import com.hw.bean.BO.QueryGameResultRule10ByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 游戏开奖结果-群数第一位 10 Service 接口
**/

public interface GameResultRule10Service {

    /**
    * Add 游戏开奖结果-群数第一位 10 dto.
    *
    * @param gameResultRule10PO  游戏开奖结果-群数第一位 10 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameResultRule10(GameResultRule10PO gameResultRule10PO);

    /**
    * Modify 游戏开奖结果-群数第一位 10 dto.
    *
    * @param gameResultRule10PO  游戏开奖结果-群数第一位 10 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameResultRule10(GameResultRule10PO gameResultRule10PO);

    /**
    * Gets GameResultRule10 info.
    *
    * @param queryGameResultRule10ByPrimaryKey the query GameResultRule10 bean by primary key
    * @return the info
    */
    public ResultDTO<GameResultRule10VO> getgameResultRule10(QueryGameResultRule10ByPrimaryKey queryGameResultRule10ByPrimaryKey);

    /**
    * Gets GameResultRule10 list.
    *
    * @param queryGameResultRule10Page the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameResultRule10VO> getGameResultRule10List(QueryGameResultRule10Page queryGameResultRule10Page);
}
