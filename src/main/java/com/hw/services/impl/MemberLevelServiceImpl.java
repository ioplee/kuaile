package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.MemberLevelDAO;
import com.hw.bean.PO.MemberLevelPO;
import com.hw.bean.VO.MemberLevelVO;
import com.hw.bean.BO.QueryMemberLevelPage;
import com.hw.bean.BO.QueryMemberLevelByPrimaryKey;
import com.hw.services.MemberLevelService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 11:43:45
* @description: 会员等级表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class MemberLevelServiceImpl implements MemberLevelService{

    @Autowired
    private MemberLevelDAO memberLevelDAO;

    @Override
    public BaseResultDTO addMemberLevel(MemberLevelPO memberLevelPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = memberLevelDAO.insertMemberLevel(memberLevelPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加会员等级表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberLevelServiceImpl called addMemberLevel error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加会员等级表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifyMemberLevel(MemberLevelPO memberLevelPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = memberLevelDAO.updateMemberLevel(memberLevelPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改会员等级表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#MemberLevelServiceImpl called modifyMemberLevel error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改会员等级表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<MemberLevelVO> getMemberLevelList(QueryMemberLevelPage queryMemberLevelPage){
        BatchResultDTO<MemberLevelVO> resultDTO = new BatchResultDTO<MemberLevelVO>();
        try{
            Integer record = memberLevelDAO.getPageCount(queryMemberLevelPage);
            queryMemberLevelPage.setRecord(record);
            resultDTO.setRecord(record);
            if (queryMemberLevelPage.getPageNo() > queryMemberLevelPage.getTotalPages()){
                resultDTO.setErrorDetail("获取会员等级表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<MemberLevelVO> module = memberLevelDAO.getPageList(queryMemberLevelPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#MemberLevelServiceImpl called getMemberLevelList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员等级表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<MemberLevelVO> getmemberLevel(QueryMemberLevelByPrimaryKey queryMemberLevelByPrimaryKey){
        ResultDTO<MemberLevelVO> resultDTO = new ResultDTO<MemberLevelVO>();
        try{
            MemberLevelVO memberLevelVO = memberLevelDAO.getMemberLevelByPrimaryKey(queryMemberLevelByPrimaryKey.getLevelId());
            if(null != memberLevelVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(memberLevelVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取会员等级表对象失败");
            }
        }catch (Exception e){
            log.error("#MemberLevelServiceImpl called getMemberLevel error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取会员等级表对象失败");
        }
        return resultDTO;
    }

}
