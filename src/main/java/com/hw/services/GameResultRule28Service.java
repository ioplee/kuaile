package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameResultRule28PO;
import com.hw.bean.VO.GameResultRule28VO;
import com.hw.bean.BO.QueryGameResultRule28Page;
import com.hw.bean.BO.QueryGameResultRule28ByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 游戏开奖结果-三数求和-28 Service 接口
**/

public interface GameResultRule28Service {

    /**
    * Add 游戏开奖结果-三数求和-28 dto.
    *
    * @param gameResultRule28PO  游戏开奖结果-三数求和-28 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameResultRule28(GameResultRule28PO gameResultRule28PO);

    /**
    * Modify 游戏开奖结果-三数求和-28 dto.
    *
    * @param gameResultRule28PO  游戏开奖结果-三数求和-28 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameResultRule28(GameResultRule28PO gameResultRule28PO);

    /**
    * Gets GameResultRule28 info.
    *
    * @param queryGameResultRule28ByPrimaryKey the query GameResultRule28 bean by primary key
    * @return the info
    */
    public ResultDTO<GameResultRule28VO> getgameResultRule28(QueryGameResultRule28ByPrimaryKey queryGameResultRule28ByPrimaryKey);

    /**
    * Gets GameResultRule28 list.
    *
    * @param queryGameResultRule28Page the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameResultRule28VO> getGameResultRule28List(QueryGameResultRule28Page queryGameResultRule28Page);
}
