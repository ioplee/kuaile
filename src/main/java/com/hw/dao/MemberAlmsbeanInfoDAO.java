package com.hw.dao;

import com.hw.bean.BO.QueryMemberAlmsbeanInfoPage;
import com.hw.bean.PO.MemberAlmsbeanInfoPO;
import com.hw.bean.VO.MemberAlmsbeanInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP DAO 数据库操作对象 Mybatis接口
**/

public interface MemberAlmsbeanInfoDAO{

    /**
    * Insert integer.  添加 会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP 记录
    *
    * @param memberAlmsbeanInfoPO  会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO);

    /**
    * Update integer.  修改会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP 记录
    *
    * @param memberAlmsbeanInfoPO  会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryMemberAlmsbeanInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP列表记录BO
    * @return the list  返回会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP记录集合
    */
    public List<MemberAlmsbeanInfoVO> getPageList(QueryMemberAlmsbeanInfoPage query);

    /**
    * Select by primary key 会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP vo.
    *
    * @param PRI 记录ID
    * @return the MemberAlmsbeanInfoVO  指定 会员每日领取救济金豆记录表（领取救济金豆需要少于会员等级配置的金豆数才可以领取相对应的金豆数），
例如VIP 信息VO
    */
    public MemberAlmsbeanInfoVO getMemberAlmsbeanInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}