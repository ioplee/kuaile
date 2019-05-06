package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.BaseLotteryInfoPO;
import com.hw.bean.VO.BaseLotteryInfoVO;
import com.hw.bean.BO.QueryBaseLotteryInfoPage;
import com.hw.bean.BO.QueryBaseLotteryInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 玩家福利列表 Service 接口
**/

public interface BaseLotteryInfoService {

    /**
    * Add 玩家福利列表 dto.
    *
    * @param baseLotteryInfoPO  玩家福利列表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addBaseLotteryInfo(BaseLotteryInfoPO baseLotteryInfoPO);

    /**
    * Modify 玩家福利列表 dto.
    *
    * @param baseLotteryInfoPO  玩家福利列表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyBaseLotteryInfo(BaseLotteryInfoPO baseLotteryInfoPO);

    /**
    * Gets BaseLotteryInfo info.
    *
    * @param queryBaseLotteryInfoByPrimaryKey the query BaseLotteryInfo bean by primary key
    * @return the info
    */
    public ResultDTO<BaseLotteryInfoVO> getbaseLotteryInfo(QueryBaseLotteryInfoByPrimaryKey queryBaseLotteryInfoByPrimaryKey);

    /**
    * Gets BaseLotteryInfo list.
    *
    * @param queryBaseLotteryInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<BaseLotteryInfoVO> getBaseLotteryInfoList(QueryBaseLotteryInfoPage queryBaseLotteryInfoPage);
}
