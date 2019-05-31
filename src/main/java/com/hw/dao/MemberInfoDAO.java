package com.hw.dao;

import com.hw.bean.BO.QueryMemberInfoPage;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.bean.VO.MemberInfoVO;

import com.hw.bean.VO.PlayerGoldenBeanShowVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Member info dao.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:11:42
 * @description: 会员表 DAO 数据库操作对象 Mybatis接口
 */
public interface MemberInfoDAO{

    /**
     * Insert integer.  添加 会员表 记录
     *
     * @param memberInfoPO 会员表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer insertMemberInfo(MemberInfoPO memberInfoPO);

    /**
     * Update integer.  修改会员表 记录
     *
     * @param memberInfoPO 会员表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer updateMemberInfo(MemberInfoPO memberInfoPO);

    /**
     * Select list count integer.
     *
     * @param query 获取会员表列表总记录数BO
     * @return the integer  返回记录数
     */
    public Integer getPageCount(QueryMemberInfoPage query);

    /**
     * Select list list.
     *
     * @param query 获取会员表列表记录BO
     * @return the list  返回会员表记录集合
     */
    public List<MemberInfoVO> getPageList(QueryMemberInfoPage query);

    /**
     * Select by primary key 会员表 vo.
     *
     * @param PRI 记录ID
     * @return the MemberInfoVO  指定 会员表 信息VO
     */
    public MemberInfoVO getMemberInfoByPrimaryKey(@Param(value="PRI")Long PRI);

    /**
     * Exist integer.   判断当前用户账户(用户手机号码)是否已经存在
     *
     * @param account the account
     * @return the integer
     */
    public Integer exist(@Param("account")String account);

    /**
     * Exist integer. 判断修改用户账户(手机号码)是否是其他注册玩家
     *
     * @param account the account
     * @param userID  the user id
     * @return the integer
     */
    public Integer existByUser(@Param("account")String account,@Param("userID")Long userID);

    /**
     * Gets page list by agent.
     *
     * @param query the query
     * @return the page list by agent
     */
    public List<MemberInfoVO> getPageListByAgent(QueryMemberInfoPage query);

    /**
     * Gets page list count by agent.
     *
     * @param query the query
     * @return the page list count by agent
     */
    public Integer getPageListCountByAgent(QueryMemberInfoPage query);

    /**
     * 玩家段方法
     */

    /**
     * 玩家修改个人信息
     *
     * @param memberInfoPO the member info po
     * @return integer integer
     */
    public Integer resetMemberInfo(MemberInfoPO memberInfoPO);

    /**
     * Reset password integer.  玩家修改个人密码
     *
     * @param memberInfoPO the member info po
     * @return the integer
     */
    public Integer resetPassword(MemberInfoPO memberInfoPO);

    /**
     * Reset bank password integer. 玩家修改个人银行密码
     *
     * @param memberInfoPO the member info po
     * @return the integer
     */
    public Integer resetBankPassword(MemberInfoPO memberInfoPO);

    /**
     * Reset status integer.    设置玩家状态
     *
     * @param memberInfoPO the member info po
     * @return the integer
     */
    public Integer resetStatus(MemberInfoPO memberInfoPO);

    /**
     * Gets player count.       按条件查询玩家金豆明细 玩家总数
     *
     * @param queryMemberInfoPage the query member info page
     * @return the player count
     */
    public Integer getPlayerCount(QueryMemberInfoPage queryMemberInfoPage);

    /**
     * Gets player list.        按条件查询玩家金豆明细 玩家列表
     *
     * @param queryMemberInfoPage the query member info page
     * @return the player list
     */
    public List<PlayerGoldenBeanShowVO> getPlayerList(QueryMemberInfoPage queryMemberInfoPage);

}