package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameResultRule11PO;
import com.hw.bean.VO.GameResultRule11VO;
import com.hw.bean.BO.QueryGameResultRule11Page;
import com.hw.bean.BO.QueryGameResultRule11ByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 游戏开奖结果-二数求和 11 Service 接口
**/

public interface GameResultRule11Service {

    /**
    * Add 游戏开奖结果-二数求和 11 dto.
    *
    * @param gameResultRule11PO  游戏开奖结果-二数求和 11 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameResultRule11(GameResultRule11PO gameResultRule11PO);

    /**
    * Modify 游戏开奖结果-二数求和 11 dto.
    *
    * @param gameResultRule11PO  游戏开奖结果-二数求和 11 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameResultRule11(GameResultRule11PO gameResultRule11PO);

    /**
    * Gets GameResultRule11 info.
    *
    * @param queryGameResultRule11ByPrimaryKey the query GameResultRule11 bean by primary key
    * @return the info
    */
    public ResultDTO<GameResultRule11VO> getgameResultRule11(QueryGameResultRule11ByPrimaryKey queryGameResultRule11ByPrimaryKey);

    /**
    * Gets GameResultRule11 list.
    *
    * @param queryGameResultRule11Page the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameResultRule11VO> getGameResultRule11List(QueryGameResultRule11Page queryGameResultRule11Page);
}
