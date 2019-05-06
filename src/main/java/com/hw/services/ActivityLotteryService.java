package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.ActivityLotteryPO;
import com.hw.bean.VO.ActivityLotteryVO;
import com.hw.bean.BO.QueryActivityLotteryPage;
import com.hw.bean.BO.QueryActivityLotteryByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:29
* @description: 大转盘配置表 Service 接口
**/

public interface ActivityLotteryService {

    /**
    * Add 大转盘配置表 dto.
    *
    * @param activityLotteryPO  大转盘配置表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addActivityLottery(ActivityLotteryPO activityLotteryPO);

    /**
    * Modify 大转盘配置表 dto.
    *
    * @param activityLotteryPO  大转盘配置表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyActivityLottery(ActivityLotteryPO activityLotteryPO);

    /**
    * Gets ActivityLottery info.
    *
    * @param queryActivityLotteryByPrimaryKey the query ActivityLottery bean by primary key
    * @return the info
    */
    public ResultDTO<ActivityLotteryVO> getactivityLottery(QueryActivityLotteryByPrimaryKey queryActivityLotteryByPrimaryKey);

    /**
    * Gets ActivityLottery list.
    *
    * @param queryActivityLotteryPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<ActivityLotteryVO> getActivityLotteryList(QueryActivityLotteryPage queryActivityLotteryPage);
}
