package com.hw.services.impl;

import com.hw.bean.BO.QueryPlayerGBCondition;
import com.hw.bean.VO.PlayerGoldenBeanInfoShowVO;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberGoldenbeanInfoDAO;
import com.hw.bean.PO.MemberGoldenbeanInfoPO;
import com.hw.bean.VO.MemberGoldenbeanInfoVO;
import com.hw.bean.BO.QueryMemberGoldenbeanInfoPage;
import com.hw.bean.BO.QueryMemberGoldenbeanInfoByPrimaryKey;
import com.hw.services.MemberGoldenbeanInfoService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:50
* @description: 会员金豆账户明细表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberGoldenbeanInfoServiceImpl implements MemberGoldenbeanInfoService{

    @Autowired
    private MemberGoldenbeanInfoDAO memberGoldenbeanInfoDAO;

    @Override
    public BaseResultDTO addMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberGoldenbeanInfoDAO.insertMemberGoldenbeanInfo(memberGoldenbeanInfoPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员金豆账户明细表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberGoldenbeanInfoServiceImpl called addMemberGoldenbeanInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员金豆账户明细表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberGoldenbeanInfoDAO.updateMemberGoldenbeanInfo(memberGoldenbeanInfoPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员金豆账户明细表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberGoldenbeanInfoServiceImpl called modifyMemberGoldenbeanInfo error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员金豆账户明细表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberGoldenbeanInfoVO> getMemberGoldenbeanInfoList(QueryMemberGoldenbeanInfoPage queryMemberGoldenbeanInfoPage){
        BatchResultDTO<MemberGoldenbeanInfoVO> resultDTO = new BatchResultDTO<MemberGoldenbeanInfoVO>();
        try{
            Integer record = memberGoldenbeanInfoDAO.getPageCount(queryMemberGoldenbeanInfoPage);
            queryMemberGoldenbeanInfoPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberGoldenbeanInfoPage.getPageNo() > queryMemberGoldenbeanInfoPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员金豆账户明细表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberGoldenbeanInfoVO> module = memberGoldenbeanInfoDAO.getPageList(queryMemberGoldenbeanInfoPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberGoldenbeanInfoServiceImpl called getMemberGoldenbeanInfoList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员金豆账户明细表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public BatchResultDTO<PlayerGoldenBeanInfoShowVO> getPlayerGBByCondition(QueryPlayerGBCondition queryPlayerGBCondition) {
        BatchResultDTO<PlayerGoldenBeanInfoShowVO> resultDTO =  new BatchResultDTO<PlayerGoldenBeanInfoShowVO>();
        try {
            Integer record = memberGoldenbeanInfoDAO.getPlayerGBCount(queryPlayerGBCondition);
            resultDTO.setRecord(record);
            queryPlayerGBCondition.setRecord(record);
            List<PlayerGoldenBeanInfoShowVO> module = memberGoldenbeanInfoDAO.getPlayerGBList(queryPlayerGBCondition);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch (Exception e){
            log.error("#MemberGoldenbeanInfoServiceImpl called getPlayerGBByCondition error#",e);
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("按条件查询玩家金豆明细出错");
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberGoldenbeanInfoVO> getmemberGoldenbeanInfo(QueryMemberGoldenbeanInfoByPrimaryKey queryMemberGoldenbeanInfoByPrimaryKey){
        ResultDTO<MemberGoldenbeanInfoVO> resultDTO = new ResultDTO<MemberGoldenbeanInfoVO>();
        try{
            MemberGoldenbeanInfoVO memberGoldenbeanInfoVO = memberGoldenbeanInfoDAO.getMemberGoldenbeanInfoByPrimaryKey(queryMemberGoldenbeanInfoByPrimaryKey.getInfoId());
            if(null != memberGoldenbeanInfoVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberGoldenbeanInfoVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员金豆账户明细表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberGoldenbeanInfoServiceImpl called getMemberGoldenbeanInfo error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员金豆账户明细表对象失败");
        }
        return resultDTO;
    }

}
