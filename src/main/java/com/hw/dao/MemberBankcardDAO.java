package com.hw.dao;

import com.hw.bean.BO.QueryMemberBankcardPage;
import com.hw.bean.PO.MemberBankcardPO;
import com.hw.bean.VO.MemberBankcardVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:16
* @description: 会员银行账户表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberBankcardDAO{

    /**
    * Insert integer.  添加 会员银行账户表 记录
    *
    * @param memberBankcardPO  会员银行账户表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberBankcard(MemberBankcardPO memberBankcardPO);

    /**
    * Update integer.  修改会员银行账户表 记录
    *
    * @param memberBankcardPO  会员银行账户表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberBankcard(MemberBankcardPO memberBankcardPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员银行账户表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberBankcardPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员银行账户表列表记录BO
    * @return the list  返回会员银行账户表记录集合
    */
    public List<MemberBankcardVO> getPageList(QueryMemberBankcardPage query);

    /**
    * Select by primary key 会员银行账户表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberBankcardVO  指定 会员银行账户表 信息VO
    */
    public MemberBankcardVO getMemberBankcardByPrimaryKey(@Param(value="PRI")Long PRI);

}