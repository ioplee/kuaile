package com.hw.services;

import com.hw.bean.BO.memberInfo.QueryMemberInfoByKeyBO;
import com.hw.bean.BO.memberInfo.QueryMemberInfoListBO;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.bean.VO.MemberInfoVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

/**
 * Created by robin on 2019/4/16.
 */
public interface MemberInfoService {

    /**
     * Add member base result dto.      添加玩家(注册)
     *
     * @param memberInfoPO the member info po
     * @return the base result dto
     */
    public BaseResultDTO addMember(MemberInfoPO memberInfoPO);

    /**
     * Modify member base result dto.   修改玩家信息
     *
     * @param memberInfoPO the member info po
     * @return the base result dto
     */
    public BaseResultDTO modifyMember(MemberInfoPO memberInfoPO);

    /**
     * Sets member status.              调整设置玩家状态
     *
     * @param memberInfoPO the member info po
     * @return the member status
     */
    public BaseResultDTO setMemberStatus(MemberInfoPO memberInfoPO);

    /**
     * Sets member level.               调整玩家等级
     *
     * @param memberInfoPO the member info po
     * @return the member level
     */
    public BaseResultDTO setMemberLevel(MemberInfoPO memberInfoPO);

    /**
     * Sets member xp.                  设置玩家经验值
     *
     * @param memberInfoPO the member info po
     * @return the member xp
     */
    public BaseResultDTO setMemberXP(MemberInfoPO memberInfoPO);

    /**
     * Sets member qq.                  绑定玩家QQ
     *
     * @param memberInfoPO the member info po
     * @return the member qq
     */
    public BaseResultDTO setMemberQQ(MemberInfoPO memberInfoPO);

    /**
     * Sets member wx.                  绑定玩家微信
     *
     * @param memberInfoPO the member info po
     * @return the member wx
     */
    public BaseResultDTO setMemberWX(MemberInfoPO memberInfoPO);

    /**
     * Add singin count base result dto.    设置玩家签到次数(最多次数为7)
     *
     * @param memberInfoPO the member info po
     * @return the base result dto
     */
    public BaseResultDTO addSinginCount(MemberInfoPO memberInfoPO);

    /**
     * Sets login record.                   记录玩家最后登录信息
     *
     * @param memberInfoPO the member info po
     * @return the login record
     */
    public BaseResultDTO setLoginRecord(MemberInfoPO memberInfoPO);

    /**
     * Gets member info.                    查询指定玩家信息
     *
     * @param queryMemberInfoByKeyBO the query member info by key bo
     * @return the member info
     */
    public ResultDTO<MemberInfoVO> getMemberInfo(QueryMemberInfoByKeyBO queryMemberInfoByKeyBO);

    /**
     * Gets member list.                    获取玩家列表(分页)
     *
     * @param queryMemberInfoListBO the query member info list bo
     * @return the member list
     */
    public BatchResultDTO<MemberInfoVO> getMemberList(QueryMemberInfoListBO queryMemberInfoListBO);
}
