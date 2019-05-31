package com.hw.services;

import com.hw.bean.BO.QueryMemberInfoByAgent;
import com.hw.bean.BO.QueryMemberInfoByPrimaryKey;
import com.hw.bean.BO.QueryMemberInfoPage;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.bean.VO.MemberInfoVO;
import com.hw.bean.VO.PlayerGoldenBeanShowVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

/**
 * The interface Member info service.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:12:40
 * @description: 会员表 Service 接口
 */
public interface MemberInfoService {

    /**
     * Add 会员表 dto.
     *
     * @param memberInfoPO 会员表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO addMemberInfo(MemberInfoPO memberInfoPO);

    /**
     * Modify 会员表 dto.
     *
     * @param memberInfoPO 会员表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO modifyMemberInfo(MemberInfoPO memberInfoPO);

    /**
     * Gets MemberInfo info.
     *
     * @param queryMemberInfoByPrimaryKey the query MemberInfo bean by primary key
     * @return the info
     */
    public ResultDTO<MemberInfoVO> getmemberInfo(QueryMemberInfoByPrimaryKey queryMemberInfoByPrimaryKey);

    /**
     * Gets MemberInfo list.
     *
     * @param queryMemberInfoPage the query bean for page
     * @return the agent info list
     */
    public BatchResultDTO<MemberInfoVO> getMemberInfoList(QueryMemberInfoPage queryMemberInfoPage);

    /**
     * Gets member info list by agent.
     *
     * @param queryMemberInfoByAgent the query member info by agent
     * @return the member info list by agent
     */
    public BatchResultDTO<MemberInfoVO> getMemberInfoListByAgent(QueryMemberInfoByAgent queryMemberInfoByAgent);

    /**
     * Reset member status base result dto.     设置玩家状态
     *
     * @param memberInfoPO the member info po
     * @return the base result dto
     */
    public BaseResultDTO resetMemberStatus(MemberInfoPO memberInfoPO);

    /**
     * Gets player page.        按条件查询玩家金豆明细 玩家列表
     *
     * @param queryMemberInfoPage the query member info page
     * @return the player page
     */
    public BatchResultDTO<PlayerGoldenBeanShowVO> getPlayerPage(QueryMemberInfoPage queryMemberInfoPage);
}
