package com.hw.dao;

import com.hw.bean.BO.memberInfo.QueryMemberInfoListBO;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.bean.VO.MemberInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by robin on 2019/4/16.
 */
public interface MemberInfoDAO{

    /**
     * Insert integer.
     *
     * @param memberInfoPO the member info po
     * @return the integer
     */
    public Integer insert(MemberInfoPO memberInfoPO);

    /**
     * Update by primary key integer.
     *
     * @param memberInfoPO the member info po
     * @return the integer
     */
    public Integer updateByPrimaryKey(MemberInfoPO memberInfoPO);

    /**
     * Select by primary key member info vo.
     *
     * @param memberID the member id
     * @return the member info vo
     */
    public MemberInfoVO selectByPrimaryKey(@Param("memberID")Long memberID);

    /**
     * Select list count integer.
     *
     * @param queryMemberInfoListBO the query member info list bo
     * @return the integer
     */
    public Integer selectListCount(QueryMemberInfoListBO queryMemberInfoListBO);

    /**
     * Select list list.
     *
     * @param queryMemberInfoListBO the query member info list bo
     * @return the list
     */
    public List<MemberInfoVO> selectList(QueryMemberInfoListBO queryMemberInfoListBO);

    /**
     * 以下为玩家业务操作功能
     *
     * @param memberID the member id        玩家ID
     * @param status   the status           玩家状态(-1删除 0冻结 1激活有效)
     * @return the member info status
     */
    public Integer setMemberInfoStatus(@Param("memberID")Long memberID,@Param("status")Integer status);

    /**
     * Sets qq.
     *
     * @param memberID the member id        玩家ID
     * @param qq       the qq               玩家绑定QQ
     * @return the qq
     */
    public Integer setQQ(@Param("memberID")Long memberID,@Param("qq")String qq);


    /**
     * Sets wx.
     *
     * @param memberID the member id    玩家ID
     * @param wx       the wx           玩家微信
     * @return the wx
     */
    public Integer setWX(@Param("memberID")Long memberID,@Param("wx")String wx);

    /**
     * Sets level.
     *
     * @param memberID the member id    玩家ID
     * @param level    the level        玩家等级
     * @return the level
     */
    public Integer setLevel(@Param("memberID")Long memberID,@Param("level")Integer level);

    /**
     * Sets xp.
     *
     * @param memberID the member id    玩家ID
     * @param xp       the xp           玩家经验值
     * @return the xp
     */
    public Integer setXP(@Param("memberID")Long memberID,@Param("xp")Integer xp);

    /**
     * Sets singin.
     *
     * @param memberID     the member id        玩家ID
     * @param singinCounts the singin counts    玩家连续签到次数
     * @return the singin
     */
    public Integer setSingin(@Param("memberID")Long memberID,@Param("singinCount")Integer singinCounts);

    /**
     * Sets last login.
     *
     * @param memberID        the member id             玩家ID
     * @param ip              the ip                    登录IP
     * @param lastLogininTime the last loginin time     登录时间
     * @return the last login
     */
    public Integer setLastLogin(@Param("memberID")Long memberID,@Param("loginIP")String ip,@Param("loginTime")String lastLogininTime);

    /**
     * Exisit integer.      判断当前手机号码是否被注册过(包括冻结和有效两种状态,删除的玩家账户不计算在内)
     *
     * @param mobile the mobile     注册手机号码
     * @return the integer          返回1则代表已有此手机账号存在(有效或冻结的),返回0则代表此号码允许注册.大于1为逻辑型错误,即存在重复手机号码账户存在
     */
    public Integer exisit(@Param("mobile")String mobile);

}
