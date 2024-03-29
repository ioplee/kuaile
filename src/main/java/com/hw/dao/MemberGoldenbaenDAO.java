package com.hw.dao;

import com.hw.bean.BO.QueryMemberGoldenbaenPage;
import com.hw.bean.PO.MemberGoldenbaenPO;
import com.hw.bean.VO.MemberGoldenbaenVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 会员金豆账户表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberGoldenbaenDAO{

    /**
    * Insert integer.  添加 会员金豆账户表 记录
    *
    * @param memberGoldenbaenPO  会员金豆账户表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberGoldenbaen(MemberGoldenbaenPO memberGoldenbaenPO);

    /**
    * Update integer.  修改会员金豆账户表 记录
    *
    * @param memberGoldenbaenPO  会员金豆账户表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberGoldenbaen(MemberGoldenbaenPO memberGoldenbaenPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员金豆账户表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberGoldenbaenPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员金豆账户表列表记录BO
    * @return the list  返回会员金豆账户表记录集合
    */
    public List<MemberGoldenbaenVO> getPageList(QueryMemberGoldenbaenPage query);

    /**
    * Select by primary key 会员金豆账户表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberGoldenbaenVO  指定 会员金豆账户表 信息VO
    */
    public MemberGoldenbaenVO getMemberGoldenbaenByPrimaryKey(@Param(value="PRI")Long PRI);

}