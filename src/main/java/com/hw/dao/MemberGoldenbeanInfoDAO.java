package com.hw.dao;

import com.hw.bean.BO.QueryMemberGoldenbeanInfoPage;
import com.hw.bean.VO.MemberGoldenbeanInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberGoldenbeanInfoDAO{

    /**
    * Insert integer.  添加 会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投 记录
    *
    * @param memberGoldenbeanInfoPO  会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO);

    /**
    * Update integer.  修改会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投 记录
    *
    * @param memberGoldenbeanInfoPO  会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberGoldenbeanInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投列表记录BO
    * @return the list  返回会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投记录集合
    */
    public List<MemberGoldenbeanInfoVO> getPageList(QueryMemberGoldenbeanInfoPage query);

    /**
    * Select by primary key 会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投 vo.
    *
    * @param PRI 记录ID
    * @return the MemberGoldenbeanInfoVO  指定 会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投 信息VO
    */
    public MemberGoldenbeanInfoVO getMemberGoldenbeanInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}