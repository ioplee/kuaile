package com.hw.dao;

import com.hw.bean.BO.QueryBaseNewsPage;
import com.hw.bean.PO.BaseNewsPO;
import com.hw.bean.VO.BaseNewsVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 平台新闻 DAO 数据库操作对象 Mybatis接口
**/

public interface BaseNewsDAO{

    /**
    * Insert integer.  添加 平台新闻 记录
    *
    * @param baseNewsPO  平台新闻 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertBaseNews(BaseNewsPO baseNewsPO);

    /**
    * Update integer.  修改平台新闻 记录
    *
    * @param baseNewsPO  平台新闻 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateBaseNews(BaseNewsPO baseNewsPO);

    /**
    * Select list count integer.
    *
    * @param query 获取平台新闻列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryBaseNewsPage query);

    /**
    * Select list list.
    *
    * @param query 获取平台新闻列表记录BO
    * @return the list  返回平台新闻记录集合
    */
    public List<BaseNewsVO> getPageList(QueryBaseNewsPage query);

    /**
    * Select by primary key 平台新闻 vo.
    *
    * @param PRI 记录ID
    * @return the BaseNewsVO  指定 平台新闻 信息VO
    */
    public BaseNewsVO getBaseNewsByPrimaryKey(@Param(value = "PRI") Long PRI);

}