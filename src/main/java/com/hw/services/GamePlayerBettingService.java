package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GamePlayerBettingPO;
import com.hw.bean.VO.GamePlayerBettingVO;
import com.hw.bean.BO.QueryGamePlayerBettingPage;
import com.hw.bean.BO.QueryGamePlayerBettingByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:39
* @description: 玩家投注表 Service 接口
**/

public interface GamePlayerBettingService {

    /**
    * Add 玩家投注表 dto.
    *
    * @param gamePlayerBettingPO  玩家投注表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGamePlayerBetting(GamePlayerBettingPO gamePlayerBettingPO);

    /**
    * Modify 玩家投注表 dto.
    *
    * @param gamePlayerBettingPO  玩家投注表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGamePlayerBetting(GamePlayerBettingPO gamePlayerBettingPO);

    /**
    * Gets GamePlayerBetting info.
    *
    * @param queryGamePlayerBettingByPrimaryKey the query GamePlayerBetting bean by primary key
    * @return the info
    */
    public ResultDTO<GamePlayerBettingVO> getgamePlayerBetting(QueryGamePlayerBettingByPrimaryKey queryGamePlayerBettingByPrimaryKey);

    /**
    * Gets GamePlayerBetting list.
    *
    * @param queryGamePlayerBettingPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GamePlayerBettingVO> getGamePlayerBettingList(QueryGamePlayerBettingPage queryGamePlayerBettingPage);
}
