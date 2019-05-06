package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GamePhasePO;
import com.hw.bean.VO.GamePhaseVO;
import com.hw.bean.BO.QueryGamePhasePage;
import com.hw.bean.BO.QueryGamePhaseByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 游戏期数信息 Service 接口
**/

public interface GamePhaseService {

    /**
    * Add 游戏期数信息 dto.
    *
    * @param gamePhasePO  游戏期数信息 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGamePhase(GamePhasePO gamePhasePO);

    /**
    * Modify 游戏期数信息 dto.
    *
    * @param gamePhasePO  游戏期数信息 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGamePhase(GamePhasePO gamePhasePO);

    /**
    * Gets GamePhase info.
    *
    * @param queryGamePhaseByPrimaryKey the query GamePhase bean by primary key
    * @return the info
    */
    public ResultDTO<GamePhaseVO> getgamePhase(QueryGamePhaseByPrimaryKey queryGamePhaseByPrimaryKey);

    /**
    * Gets GamePhase list.
    *
    * @param queryGamePhasePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GamePhaseVO> getGamePhaseList(QueryGamePhasePage queryGamePhasePage);
}
