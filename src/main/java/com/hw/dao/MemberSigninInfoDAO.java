package com.hw.dao;

import com.hw.bean.BO.QueryMemberSigninInfoPage;
import com.hw.bean.PO.MemberSigninInfoPO;
import com.hw.bean.VO.MemberSigninInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:44
* @description: 会员签到记录明细表（签到获取金豆明细表） DAO 数据库操作对象 Mybatis接口
**/

public interface MemberSigninInfoDAO{

    /**
    * Insert integer.  添加 会员签到记录明细表（签到获取金豆明细表） 记录
    *
    * @param memberSigninInfoPO  会员签到记录明细表（签到获取金豆明细表） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberSigninInfo(MemberSigninInfoPO memberSigninInfoPO);

    /**
    * Update integer.  修改会员签到记录明细表（签到获取金豆明细表） 记录
    *
    * @param memberSigninInfoPO  会员签到记录明细表（签到获取金豆明细表） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberSigninInfo(MemberSigninInfoPO memberSigninInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员签到记录明细表（签到获取金豆明细表）列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberSigninInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员签到记录明细表（签到获取金豆明细表）列表记录BO
    * @return the list  返回会员签到记录明细表（签到获取金豆明细表）记录集合
    */
    public List<MemberSigninInfoVO> getPageList(QueryMemberSigninInfoPage query);

    /**
    * Select by primary key 会员签到记录明细表（签到获取金豆明细表） vo.
    *
    * @param PRI 记录ID
    * @return the MemberSigninInfoVO  指定 会员签到记录明细表（签到获取金豆明细表） 信息VO
    */
    public MemberSigninInfoVO getMemberSigninInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}