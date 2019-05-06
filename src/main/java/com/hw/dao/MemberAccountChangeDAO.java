package com.hw.dao;

import com.hw.bean.BO.QueryMemberAccountChangePage;
import com.hw.bean.VO.MemberAccountChangeVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 会员 金豆账户和虚拟银行账户之间转换记录 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberAccountChangeDAO{

    /**
    * Insert integer.  添加 会员 金豆账户和虚拟银行账户之间转换记录 记录
    *
    * @param memberAccountChangePO  会员 金豆账户和虚拟银行账户之间转换记录 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberAccountChange(MemberAccountChangePO memberAccountChangePO);

    /**
    * Update integer.  修改会员 金豆账户和虚拟银行账户之间转换记录 记录
    *
    * @param memberAccountChangePO  会员 金豆账户和虚拟银行账户之间转换记录 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberAccountChange(MemberAccountChangePO memberAccountChangePO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员 金豆账户和虚拟银行账户之间转换记录列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberAccountChangePage query);

    /**
    * Select list list.
    *
    * @param query 获取会员 金豆账户和虚拟银行账户之间转换记录列表记录BO
    * @return the list  返回会员 金豆账户和虚拟银行账户之间转换记录记录集合
    */
    public List<MemberAccountChangeVO> getPageList(QueryMemberAccountChangePage query);

    /**
    * Select by primary key 会员 金豆账户和虚拟银行账户之间转换记录 vo.
    *
    * @param PRI 记录ID
    * @return the MemberAccountChangeVO  指定 会员 金豆账户和虚拟银行账户之间转换记录 信息VO
    */
    public MemberAccountChangeVO getMemberAccountChangeByPrimaryKey(@Param(value = "PRI") Long PRI);

}