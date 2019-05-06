package com.hw.dao;

import com.hw.bean.BO.QueryMemberXpInfoPage;
import com.hw.bean.VO.MemberXpInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:44
* @description: 会员获取经验值明细表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberXpInfoDAO{

    /**
    * Insert integer.  添加 会员获取经验值明细表 记录
    *
    * @param memberXpInfoPO  会员获取经验值明细表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberXpInfo(MemberXpInfoPO memberXpInfoPO);

    /**
    * Update integer.  修改会员获取经验值明细表 记录
    *
    * @param memberXpInfoPO  会员获取经验值明细表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberXpInfo(MemberXpInfoPO memberXpInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员获取经验值明细表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberXpInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员获取经验值明细表列表记录BO
    * @return the list  返回会员获取经验值明细表记录集合
    */
    public List<MemberXpInfoVO> getPageList(QueryMemberXpInfoPage query);

    /**
    * Select by primary key 会员获取经验值明细表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberXpInfoVO  指定 会员获取经验值明细表 信息VO
    */
    public MemberXpInfoVO getMemberXpInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}