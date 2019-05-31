package com.hw.dao;

import com.hw.bean.BO.QueryMemberGoldenbeanInfoPage;
import com.hw.bean.BO.QueryPlayerGBCondition;
import com.hw.bean.PO.MemberGoldenbeanInfoPO;
import com.hw.bean.VO.MemberGoldenbeanInfoVO;

import com.hw.bean.VO.PlayerGoldenBeanInfoShowVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Member goldenbean info dao.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:11:42
 * @description: 会员金豆账户明细表 DAO 数据库操作对象 Mybatis接口
 */
public interface MemberGoldenbeanInfoDAO{

    /**
     * Insert integer.  添加 会员金豆账户明细表 记录
     *
     * @param memberGoldenbeanInfoPO 会员金豆账户明细表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer insertMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO);

    /**
     * Update integer.  修改会员金豆账户明细表 记录
     *
     * @param memberGoldenbeanInfoPO 会员金豆账户明细表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer updateMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO);

    /**
     * Select list count integer.
     *
     * @param query 获取会员金豆账户明细表列表总记录数BO
     * @return the integer  返回记录数
     */
    public Integer getPageCount(QueryMemberGoldenbeanInfoPage query);

    /**
     * Select list list.
     *
     * @param query 获取会员金豆账户明细表列表记录BO
     * @return the list  返回会员金豆账户明细表记录集合
     */
    public List<MemberGoldenbeanInfoVO> getPageList(QueryMemberGoldenbeanInfoPage query);

    /**
     * Select by primary key 会员金豆账户明细表 vo.
     *
     * @param PRI 记录ID
     * @return the MemberGoldenbeanInfoVO  指定 会员金豆账户明细表 信息VO
     */
    public MemberGoldenbeanInfoVO getMemberGoldenbeanInfoByPrimaryKey(@Param(value="PRI")Long PRI);

    /**
     * Gets player gb count.    按条件查询玩家金豆明细记录 总记录数
     *
     * @param queryPlayerGBCondition the query player gb condition
     * @return the player gb count
     */
    public Integer getPlayerGBCount(QueryPlayerGBCondition queryPlayerGBCondition);

    /**
     * Gets player gb list.     按条件查询玩家金豆明细记录 列表
     *
     * @param queryPlayerGBCondition the query player gb condition
     * @return the player gb list
     */
    public List<PlayerGoldenBeanInfoShowVO> getPlayerGBList(QueryPlayerGBCondition queryPlayerGBCondition);

}