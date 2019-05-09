package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameResultRule29PO;
import com.hw.bean.VO.GameResultRule29VO;
import com.hw.bean.BO.QueryGameResultRule29Page;
import com.hw.bean.BO.QueryGameResultRule29ByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 游戏开奖结果-三数求和-16 Service 接口
**/

public interface GameResultRule29Service {

    /**
    * Add 游戏开奖结果-三数求和-16 dto.
    *
    * @param gameResultRule29PO  游戏开奖结果-三数求和-16 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameResultRule29(GameResultRule29PO gameResultRule29PO);

    /**
    * Modify 游戏开奖结果-三数求和-16 dto.
    *
    * @param gameResultRule29PO  游戏开奖结果-三数求和-16 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameResultRule29(GameResultRule29PO gameResultRule29PO);

    /**
    * Gets GameResultRule29 info.
    *
    * @param queryGameResultRule29ByPrimaryKey the query GameResultRule29 bean by primary key
    * @return the info
    */
    public ResultDTO<GameResultRule29VO> getgameResultRule29(QueryGameResultRule29ByPrimaryKey queryGameResultRule29ByPrimaryKey);

    /**
    * Gets GameResultRule29 list.
    *
    * @param queryGameResultRule29Page the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameResultRule29VO> getGameResultRule29List(QueryGameResultRule29Page queryGameResultRule29Page);
}
