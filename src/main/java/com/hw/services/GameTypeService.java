package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameTypePO;
import com.hw.bean.VO.GameTypeVO;
import com.hw.bean.BO.QueryGameTypePage;
import com.hw.bean.BO.QueryGameTypeByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 游戏类型表 Service 接口
**/

public interface GameTypeService {

    /**
    * Add 游戏类型表 dto.
    *
    * @param gameTypePO  游戏类型表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameType(GameTypePO gameTypePO);

    /**
    * Modify 游戏类型表 dto.
    *
    * @param gameTypePO  游戏类型表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameType(GameTypePO gameTypePO);

    /**
    * Gets GameType info.
    *
    * @param queryGameTypeByPrimaryKey the query GameType bean by primary key
    * @return the info
    */
    public ResultDTO<GameTypeVO> getgameType(QueryGameTypeByPrimaryKey queryGameTypeByPrimaryKey);

    /**
    * Gets GameType list.
    *
    * @param queryGameTypePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameTypeVO> getGameTypeList(QueryGameTypePage queryGameTypePage);
}
