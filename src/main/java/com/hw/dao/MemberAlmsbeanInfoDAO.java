package com.hw.dao;

import com.hw.bean.BO.QueryMemberAlmsbeanInfoPage;
import com.hw.bean.PO.MemberAlmsbeanInfoPO;
import com.hw.bean.VO.MemberAlmsbeanInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:11:42
* @description: 会员每日救济金豆领取记录表 DAO 数据库操作对象 Mybatis接口
**/

public interface MemberAlmsbeanInfoDAO{

    /**
    * Insert integer.  添加 会员每日救济金豆领取记录表 记录
    *
    * @param memberAlmsbeanInfoPO  会员每日救济金豆领取记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO);

    /**
    * Update integer.  修改会员每日救济金豆领取记录表 记录
    *
    * @param memberAlmsbeanInfoPO  会员每日救济金豆领取记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员每日救济金豆领取记录表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberAlmsbeanInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员每日救济金豆领取记录表列表记录BO
    * @return the list  返回会员每日救济金豆领取记录表记录集合
    */
    public List<MemberAlmsbeanInfoVO> getPageList(QueryMemberAlmsbeanInfoPage query);

    /**
    * Select by primary key 会员每日救济金豆领取记录表 vo.
    *
    * @param PRI 记录ID
    * @return the MemberAlmsbeanInfoVO  指定 会员每日救济金豆领取记录表 信息VO
    */
    public MemberAlmsbeanInfoVO getMemberAlmsbeanInfoByPrimaryKey(@Param(value="PRI")Long PRI);

}