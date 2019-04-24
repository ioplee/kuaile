package com.hw.dao;

import com.hw.bean.BO.QueryMemberXpToBeanPage;
import com.hw.bean.PO.MemberXpToBeanPO;
import com.hw.bean.VO.MemberXpToBeanVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:44
* @description: 会员经验值兑换金豆记录明细表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberXpToBeanDAO{

    /**
    * Insert integer.  添加 会员经验值兑换金豆记录明细表 记录
    *
    * @param memberXpToBeanPO  会员经验值兑换金豆记录明细表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberXpToBean(MemberXpToBeanPO memberXpToBeanPO);

    /**
    * Update integer.  修改会员经验值兑换金豆记录明细表 记录
    *
    * @param memberXpToBeanPO  会员经验值兑换金豆记录明细表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberXpToBean(MemberXpToBeanPO memberXpToBeanPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员经验值兑换金豆记录明细表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberXpToBeanPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员经验值兑换金豆记录明细表列表记录BO
    * @return the list  返回会员经验值兑换金豆记录明细表记录集合
    */
    public List<MemberXpToBeanVO> getPageList(QueryMemberXpToBeanPage query);

    /**
    * Select by primary key 会员经验值兑换金豆记录明细表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberXpToBeanVO  指定 会员经验值兑换金豆记录明细表 信息VO
    */
    public MemberXpToBeanVO getMemberXpToBeanByPrimaryKey(@Param(value = "PRI") Long PRI);

}