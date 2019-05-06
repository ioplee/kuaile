package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.ActivityLotteryInfoPO;
import com.hw.bean.VO.ActivityLotteryInfoVO;
import com.hw.bean.BO.QueryActivityLotteryInfoPage;
import com.hw.bean.BO.QueryActivityLotteryInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:29
* @description: 大转盘获奖记录表 Service 接口
**/

public interface ActivityLotteryInfoService {

    /**
    * Add 大转盘获奖记录表 dto.
    *
    * @param activityLotteryInfoPO  大转盘获奖记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addActivityLotteryInfo(ActivityLotteryInfoPO activityLotteryInfoPO);

    /**
    * Modify 大转盘获奖记录表 dto.
    *
    * @param activityLotteryInfoPO  大转盘获奖记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyActivityLotteryInfo(ActivityLotteryInfoPO activityLotteryInfoPO);

    /**
    * Gets ActivityLotteryInfo info.
    *
    * @param queryActivityLotteryInfoByPrimaryKey the query ActivityLotteryInfo bean by primary key
    * @return the info
    */
    public ResultDTO<ActivityLotteryInfoVO> getactivityLotteryInfo(QueryActivityLotteryInfoByPrimaryKey queryActivityLotteryInfoByPrimaryKey);

    /**
    * Gets ActivityLotteryInfo list.
    *
    * @param queryActivityLotteryInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<ActivityLotteryInfoVO> getActivityLotteryInfoList(QueryActivityLotteryInfoPage queryActivityLotteryInfoPage);
}
