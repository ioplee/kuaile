package com.hw.dao;

import com.hw.bean.BO.QueryActivityLotteryPage;
import com.hw.bean.PO.ActivityLotteryPO;
import com.hw.bean.VO.ActivityLotteryVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:15
* @description: 大转盘配置表 DAO 数据库操作对象 Mybatis接口
**/

public interface ActivityLotteryDAO{

    /**
    * Insert integer.  添加 大转盘配置表 记录
    *
    * @param activityLotteryPO  大转盘配置表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertActivityLottery(ActivityLotteryPO activityLotteryPO);

    /**
    * Update integer.  修改大转盘配置表 记录
    *
    * @param activityLotteryPO  大转盘配置表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateActivityLottery(ActivityLotteryPO activityLotteryPO);

    /**
    * Select list count integer.
    *
    * @param query 获取大转盘配置表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryActivityLotteryPage query);

    /**
    * Select list list.
    *
    * @param query 获取大转盘配置表列表记录BO
    * @return the list  返回大转盘配置表记录集合
    */
    public List<ActivityLotteryVO> getPageList(QueryActivityLotteryPage query);

    /**
    * Select by primary key 大转盘配置表 vo.
    *
    * @param PRI 记录ID
    * @return the ActivityLotteryVO  指定 大转盘配置表 信息VO
    */
    public ActivityLotteryVO getActivityLotteryByPrimaryKey(@Param(value="PRI")Long PRI);

}