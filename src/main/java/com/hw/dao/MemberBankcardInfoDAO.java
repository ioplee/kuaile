package com.hw.dao;

import com.hw.bean.BO.QueryMemberBankcardInfoPage;
import com.hw.bean.PO.MemberBankcardInfoPO;
import com.hw.bean.VO.MemberBankcardInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:17
* @description: 会员银行账户明细表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberBankcardInfoDAO{

    /**
    * Insert integer.  添加 会员银行账户明细表 记录
    *
    * @param memberBankcardInfoPO  会员银行账户明细表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO);

    /**
    * Update integer.  修改会员银行账户明细表 记录
    *
    * @param memberBankcardInfoPO  会员银行账户明细表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员银行账户明细表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberBankcardInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员银行账户明细表列表记录BO
    * @return the list  返回会员银行账户明细表记录集合
    */
    public List<MemberBankcardInfoVO> getPageList(QueryMemberBankcardInfoPage query);

    /**
    * Select by primary key 会员银行账户明细表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberBankcardInfoVO  指定 会员银行账户明细表 信息VO
    */
    public MemberBankcardInfoVO getMemberBankcardInfoByPrimaryKey(@Param(value="PRI")Long PRI);

}