package com.hw.dao;

import com.hw.bean.BO.QueryPlamVerificationCodePage;
import com.hw.bean.PO.PlamVerificationCodePO;
import com.hw.bean.VO.PlamVerificationCodeVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:44
* @description: 平台验证码 DAO 数据库操作对象 Mybatis接口
**/

public interface PlamVerificationCodeDAO{

    /**
    * Insert integer.  添加 平台验证码 记录
    *
    * @param plamVerificationCodePO  平台验证码 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertPlamVerificationCode(PlamVerificationCodePO plamVerificationCodePO);

    /**
    * Update integer.  修改平台验证码 记录
    *
    * @param plamVerificationCodePO  平台验证码 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updatePlamVerificationCode(PlamVerificationCodePO plamVerificationCodePO);

    /**
    * Select list count integer.
    *
    * @param query 获取平台验证码列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryPlamVerificationCodePage query);

    /**
    * Select list list.
    *
    * @param query 获取平台验证码列表记录BO
    * @return the list  返回平台验证码记录集合
    */
    public List<PlamVerificationCodeVO> getPageList(QueryPlamVerificationCodePage query);

    /**
    * Select by primary key 平台验证码 vo.
    *
    * @param PRI 记录ID
    * @return the PlamVerificationCodeVO  指定 平台验证码 信息VO
    */
    public PlamVerificationCodeVO getPlamVerificationCodeByPrimaryKey(@Param(value = "PRI") Long PRI);

}