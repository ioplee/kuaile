package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameInfoPO;
import com.hw.bean.VO.GameInfoVO;
import com.hw.bean.BO.QueryGameInfoPage;
import com.hw.bean.BO.QueryGameInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:39
* @description: 游戏信息表 Service 接口
**/

public interface GameInfoService {

    /**
    * Add 游戏信息表 dto.
    *
    * @param gameInfoPO  游戏信息表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameInfo(GameInfoPO gameInfoPO);

    /**
    * Modify 游戏信息表 dto.
    *
    * @param gameInfoPO  游戏信息表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameInfo(GameInfoPO gameInfoPO);

    /**
    * Gets GameInfo info.
    *
    * @param queryGameInfoByPrimaryKey the query GameInfo bean by primary key
    * @return the info
    */
    public ResultDTO<GameInfoVO> getgameInfo(QueryGameInfoByPrimaryKey queryGameInfoByPrimaryKey);

    /**
    * Gets GameInfo list.
    *
    * @param queryGameInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameInfoVO> getGameInfoList(QueryGameInfoPage queryGameInfoPage);
}
