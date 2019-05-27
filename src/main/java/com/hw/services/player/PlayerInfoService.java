package com.hw.services.player;

import com.hw.bean.PO.MemberInfoPO;
import com.hw.utils.BaseResultDTO;

/**
 * Created by robin on 2019/5/27.
 */
public interface PlayerInfoService {

    /**
     * Reset player info base result dto.   玩家修改个人信息(非关键核心信息)
     *
     * @param memberInfoPO the member info po
     * @return the base result dto
     */
    public BaseResultDTO resetPlayerInfo(MemberInfoPO memberInfoPO);

    /**
     * Reset login password base result dto.    玩家修改个人登录密码
     *
     * @param memberInfoPO the member info po
     * @return the base result dto
     */
    public BaseResultDTO resetLoginPassword(MemberInfoPO memberInfoPO);

    /**
     * Reset bank password base result dto.     玩家修改银行密码
     *
     * @param memberInfoPO the member info po
     * @return the base result dto
     */
    public BaseResultDTO resetBankPassword(MemberInfoPO memberInfoPO);
}
