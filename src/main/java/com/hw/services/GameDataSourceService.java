package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameDataSourcePO;
import com.hw.bean.VO.GameDataSourceVO;
import com.hw.bean.BO.QueryGameDataSourcePage;
import com.hw.bean.BO.QueryGameDataSourceByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:39
* @description: 游戏数据源表 Service 接口
**/

public interface GameDataSourceService {

    /**
    * Add 游戏数据源表 dto.
    *
    * @param gameDataSourcePO  游戏数据源表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameDataSource(GameDataSourcePO gameDataSourcePO);

    /**
    * Modify 游戏数据源表 dto.
    *
    * @param gameDataSourcePO  游戏数据源表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameDataSource(GameDataSourcePO gameDataSourcePO);

    /**
    * Gets GameDataSource info.
    *
    * @param queryGameDataSourceByPrimaryKey the query GameDataSource bean by primary key
    * @return the info
    */
    public ResultDTO<GameDataSourceVO> getgameDataSource(QueryGameDataSourceByPrimaryKey queryGameDataSourceByPrimaryKey);

    /**
    * Gets GameDataSource list.
    *
    * @param queryGameDataSourcePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameDataSourceVO> getGameDataSourceList(QueryGameDataSourcePage queryGameDataSourcePage);
}
