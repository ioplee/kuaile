package com.hw.services.player.impl;/**
 * Created by robin on 2019/5/27.
 */

import com.hw.bean.PO.MemberInfoPO;
import com.hw.dao.MemberInfoDAO;
import com.hw.services.player.PlayerInfoService;
import com.hw.utils.BaseResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Robin
 * @create: 2019-05-27 14:12
 * @description: 玩家个人信息修改Service实现类
 **/

@Service
@Slf4j
@Transactional
public class PlayerInfoServiceImpl implements PlayerInfoService {

    @Autowired
    private MemberInfoDAO memberInfoDAO;

    @Override
    public BaseResultDTO resetPlayerInfo(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.resetMemberInfo(memberInfoPO);
            resultDTO.setSuccess(true);
            if (number == 1){
                resultDTO.setResultCode("1");
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setErrorDetail("修改玩家信息失败");
            }
        }catch (Exception e){
            log.error("#PlayerInfoServiceImpl called resetPlayerInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家信息出错");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO resetLoginPassword(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.resetPassword(memberInfoPO);
            resultDTO.setSuccess(true);
            if (number == 1){
                resultDTO.setResultCode("1");
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setErrorDetail("修改玩家密码失败");
            }
        }catch (Exception e){
            log.error("#PlayerInfoServiceImpl called resetLoginPassword error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家密码出错");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO resetBankPassword(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.resetBankPassword(memberInfoPO);
            resultDTO.setSuccess(true);
            if (number == 1){
                resultDTO.setResultCode("1");
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setErrorDetail("修改玩家银行密码失败");
            }
        }catch (Exception e){
            log.error("#PlayerInfoServiceImpl called resetBankPassword error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家银行密码出错");
        }
        return resultDTO;
    }
}
