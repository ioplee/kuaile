package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameInfoOptionsPO;
import com.hw.bean.VO.GameInfoOptionsVO;
import com.hw.bean.BO.QueryGameInfoOptionsPage;
import com.hw.bean.BO.QueryGameInfoOptionsByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:39
* @description: 游戏投注项 Service 接口
**/

public interface GameInfoOptionsService {

    /**
    * Add 游戏投注项 dto.
    *
    * @param gameInfoOptionsPO  游戏投注项 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameInfoOptions(GameInfoOptionsPO gameInfoOptionsPO);

    /**
    * Modify 游戏投注项 dto.
    *
    * @param gameInfoOptionsPO  游戏投注项 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameInfoOptions(GameInfoOptionsPO gameInfoOptionsPO);

    /**
    * Gets GameInfoOptions info.
    *
    * @param queryGameInfoOptionsByPrimaryKey the query GameInfoOptions bean by primary key
    * @return the info
    */
    public ResultDTO<GameInfoOptionsVO> getgameInfoOptions(QueryGameInfoOptionsByPrimaryKey queryGameInfoOptionsByPrimaryKey);

    /**
    * Gets GameInfoOptions list.
    *
    * @param queryGameInfoOptionsPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameInfoOptionsVO> getGameInfoOptionsList(QueryGameInfoOptionsPage queryGameInfoOptionsPage);
}
