package com.hw.dao;

import com.hw.bean.BO.QueryMemberBankcardInfoPage;
import com.hw.bean.VO.MemberBankcardInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -& DAO 数据库操作对象 Mybatis接口
**/

public interface MemberBankcardInfoDAO{

    /**
    * Insert integer.  添加 会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -& 记录
    *
    * @param memberBankcardInfoPO  会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -& 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO);

    /**
    * Update integer.  修改会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -& 记录
    *
    * @param memberBankcardInfoPO  会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -& 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -&列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberBankcardInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -&列表记录BO
    * @return the list  返回会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -&记录集合
    */
    public List<MemberBankcardInfoVO> getPageList(QueryMemberBankcardInfoPage query);

    /**
    * Select by primary key 会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -& vo.
    *
    * @param PRI 记录ID
    * @return the MemberBankcardInfoVO  指定 会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -& 信息VO
    */
    public MemberBankcardInfoVO getMemberBankcardInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}