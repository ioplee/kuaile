package com.hw.dao;

import com.hw.bean.BO.QueryActivityLotteryInfoPage;
import com.hw.bean.PO.ActivityLotteryInfoPO;
import com.hw.bean.VO.ActivityLotteryInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 活动-大转盘抽奖记录表 DAO 数据库操作对象 Mybatis接口
**/

public interface ActivityLotteryInfoDAO{

    /**
    * Insert integer.  添加 活动-大转盘抽奖记录表 记录
    *
    * @param activityLotteryInfoPO  活动-大转盘抽奖记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertActivityLotteryInfo(ActivityLotteryInfoPO activityLotteryInfoPO);

    /**
    * Update integer.  修改活动-大转盘抽奖记录表 记录
    *
    * @param activityLotteryInfoPO  活动-大转盘抽奖记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateActivityLotteryInfo(ActivityLotteryInfoPO activityLotteryInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取活动-大转盘抽奖记录表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryActivityLotteryInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取活动-大转盘抽奖记录表列表记录BO
    * @return the list  返回活动-大转盘抽奖记录表记录集合
    */
    public List<ActivityLotteryInfoVO> getPageList(QueryActivityLotteryInfoPage query);

    /**
    * Select by primary key 活动-大转盘抽奖记录表 vo.
    *
    * @param PRI 记录ID
    * @return the ActivityLotteryInfoVO  指定 活动-大转盘抽奖记录表 信息VO
    */
    public ActivityLotteryInfoVO getActivityLotteryInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}