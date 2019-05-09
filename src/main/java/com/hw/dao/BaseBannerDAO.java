package com.hw.dao;

import com.hw.bean.BO.QueryBaseBannerPage;
import com.hw.bean.PO.BaseBannerPO;
import com.hw.bean.VO.BaseBannerVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:41
* @description: banner广告图 DAO 数据库操作对象 Mybatis接口
**/

public interface BaseBannerDAO{

    /**
    * Insert integer.  添加 banner广告图 记录
    *
    * @param baseBannerPO  banner广告图 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertBaseBanner(BaseBannerPO baseBannerPO);

    /**
    * Update integer.  修改banner广告图 记录
    *
    * @param baseBannerPO  banner广告图 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateBaseBanner(BaseBannerPO baseBannerPO);

    /**
    * Select list count integer.
    *
    * @param query 获取banner广告图列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryBaseBannerPage query);

    /**
    * Select list list.
    *
    * @param query 获取banner广告图列表记录BO
    * @return the list  返回banner广告图记录集合
    */
    public List<BaseBannerVO> getPageList(QueryBaseBannerPage query);

    /**
    * Select by primary key banner广告图 vo.
    *
    * @param PRI 记录ID
    * @return the BaseBannerVO  指定 banner广告图 信息VO
    */
    public BaseBannerVO getBaseBannerByPrimaryKey(@Param(value="PRI")Long PRI);

}