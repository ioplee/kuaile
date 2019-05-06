package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.GameOrgSourcePO;
import com.hw.bean.VO.GameOrgSourceVO;
import com.hw.bean.BO.QueryGameOrgSourcePage;
import com.hw.bean.BO.QueryGameOrgSourceByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 开奖数据源记录表 Service 接口
**/

public interface GameOrgSourceService {

    /**
    * Add 开奖数据源记录表 dto.
    *
    * @param gameOrgSourcePO  开奖数据源记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addGameOrgSource(GameOrgSourcePO gameOrgSourcePO);

    /**
    * Modify 开奖数据源记录表 dto.
    *
    * @param gameOrgSourcePO  开奖数据源记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyGameOrgSource(GameOrgSourcePO gameOrgSourcePO);

    /**
    * Gets GameOrgSource info.
    *
    * @param queryGameOrgSourceByPrimaryKey the query GameOrgSource bean by primary key
    * @return the info
    */
    public ResultDTO<GameOrgSourceVO> getgameOrgSource(QueryGameOrgSourceByPrimaryKey queryGameOrgSourceByPrimaryKey);

    /**
    * Gets GameOrgSource list.
    *
    * @param queryGameOrgSourcePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<GameOrgSourceVO> getGameOrgSourceList(QueryGameOrgSourcePage queryGameOrgSourcePage);
}
