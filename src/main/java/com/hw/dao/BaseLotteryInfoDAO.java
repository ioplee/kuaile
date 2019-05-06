package com.hw.dao;

import com.hw.bean.BO.QueryBaseLotteryInfoPage;
import com.hw.bean.VO.BaseLotteryInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 平台提供的各种福利活动列表 DAO 数据库操作对象 Mybatis接口
**/

public interface BaseLotteryInfoDAO{

    /**
    * Insert integer.  添加 平台提供的各种福利活动列表 记录
    *
    * @param baseLotteryInfoPO  平台提供的各种福利活动列表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertBaseLotteryInfo(BaseLotteryInfoPO baseLotteryInfoPO);

    /**
    * Update integer.  修改平台提供的各种福利活动列表 记录
    *
    * @param baseLotteryInfoPO  平台提供的各种福利活动列表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateBaseLotteryInfo(BaseLotteryInfoPO baseLotteryInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取平台提供的各种福利活动列表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryBaseLotteryInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取平台提供的各种福利活动列表列表记录BO
    * @return the list  返回平台提供的各种福利活动列表记录集合
    */
    public List<BaseLotteryInfoVO> getPageList(QueryBaseLotteryInfoPage query);

    /**
    * Select by primary key 平台提供的各种福利活动列表 vo.
    *
    * @param PRI 记录ID
    * @return the BaseLotteryInfoVO  指定 平台提供的各种福利活动列表 信息VO
    */
    public BaseLotteryInfoVO getBaseLotteryInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}