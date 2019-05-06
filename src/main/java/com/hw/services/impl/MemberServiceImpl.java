package com.hw.services.impl;/**
 * Created by robin on 2019/4/16.
 */

import com.hw.bean.BO.memberInfo.QueryMemberInfoByKeyBO;
import com.hw.bean.BO.memberInfo.QueryMemberInfoListBO;
import com.hw.bean.VO.MemberInfoVO;
import com.hw.dao.MemberInfoDAO;
import com.hw.services.MemberInfoService;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Robin
 * @create: 2019-04-16 10:44
 * @description: 玩家service实现类
 **/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberServiceImpl implements MemberInfoService{

    @Autowired
    private MemberInfoDAO memberInfoDAO;

    @Override
    public BaseResultDTO addMember(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer exisit = memberInfoDAO.exisit(memberInfoPO.getMemberMobile());
            if (exisit == 0){
                Integer number = memberInfoDAO.insert(memberInfoPO);
                if (number == 1){
                    resultDTO.setSuccess(true);
                }else {
                    resultDTO.setSuccess(false);
                    resultDTO.setErrorDetail("添加玩家信息(注册)失败");
                }
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("此号码已注册,请使用新的手机号码注册");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called addMember error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("添加玩家信息(注册)异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO modifyMember(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.updateByPrimaryKey(memberInfoPO);
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家信息失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called modifyMember error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家信息异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setMemberStatus(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.setMemberInfoStatus(memberInfoPO.getMemberId(),memberInfoPO.getMemberStatus());
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家状态失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called setMemberStatus error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家状态信息异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setMemberLevel(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.setLevel(memberInfoPO.getMemberId(),memberInfoPO.getMemberLevel());
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家等级失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called setMemberLevel error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家等级信息异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setMemberXP(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.setXP(memberInfoPO.getMemberId(),memberInfoPO.getMemberXp());
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家经验值失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called setMemberXP error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家经验值信息异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setMemberQQ(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.setQQ(memberInfoPO.getMemberId(),memberInfoPO.getMemberQq());
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家QQ失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called setMemberQQ error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家QQ信息异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setMemberWX(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.setWX(memberInfoPO.getMemberId(),memberInfoPO.getMemberWx());
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家微信失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called setMemberWX error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家微信信息异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO addSinginCount(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.setSingin(memberInfoPO.getMemberId(),memberInfoPO.getSinginCounts());
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家连续签到次数失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called addSinginCount error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家连续签到次数信息异常");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setLoginRecord(MemberInfoPO memberInfoPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = memberInfoDAO.setLastLogin(memberInfoPO.getMemberId(),memberInfoPO.getLastIp(),memberInfoPO.getLastLogintime());
            if (number == 1){
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改玩家登录信息失败");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called addSinginCount error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("修改玩家登录信息异常");
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberInfoVO> getMemberInfo(QueryMemberInfoByKeyBO queryMemberInfoByKeyBO) {
        ResultDTO<MemberInfoVO> resultDTO = new ResultDTO<MemberInfoVO>();
        try {
            MemberInfoVO memberInfoVO = memberInfoDAO.selectByPrimaryKey(queryMemberInfoByKeyBO.getMemberId());
            if (null != memberInfoVO){
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberInfoVO);
            }else {
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("未查询到指定玩家信息");
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called getMemberInfo error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("查询指定玩家登录信息异常");
        }
        return resultDTO;
    }

    @Override
    public BatchResultDTO<MemberInfoVO> getMemberList(QueryMemberInfoListBO queryMemberInfoListBO) {
        BatchResultDTO<MemberInfoVO> resultDTO = new BatchResultDTO<MemberInfoVO>();
        try {
            Integer record = memberInfoDAO.selectListCount(queryMemberInfoListBO);
            queryMemberInfoListBO.setRecord(record);
            resultDTO.setRecord(record);
            resultDTO.setSuccess(true);
            List<MemberInfoVO> module = memberInfoDAO.selectList(queryMemberInfoListBO);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch (Exception e){
            log.error("#MemberServiceImpl called getMemberInfo error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("查询指定玩家登录信息异常");
            resultDTO.setModule(new ArrayList<>());
        }
        return resultDTO;
    }
}
