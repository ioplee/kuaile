package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.SecurityTokenDAO;
import com.hw.bean.PO.SecurityTokenPO;
import com.hw.bean.VO.SecurityTokenVO;
import com.hw.bean.BO.QuerySecurityTokenPage;
import com.hw.bean.BO.QuerySecurityTokenByPrimaryKey;
import com.hw.services.SecurityTokenService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:51
* @description: 用户授信记录表 Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class SecurityTokenServiceImpl implements SecurityTokenService{

    @Autowired
    private SecurityTokenDAO securityTokenDAO;

    @Override
    public BaseResultDTO addSecurityToken(SecurityTokenPO securityTokenPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = securityTokenDAO.insertSecurityToken(securityTokenPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加用户授信记录表信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SecurityTokenServiceImpl called addSecurityToken error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加用户授信记录表出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifySecurityToken(SecurityTokenPO securityTokenPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = securityTokenDAO.updateSecurityToken(securityTokenPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改用户授信记录表信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SecurityTokenServiceImpl called modifySecurityToken error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改用户授信记录表出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<SecurityTokenVO> getSecurityTokenList(QuerySecurityTokenPage querySecurityTokenPage){
        BatchResultDTO<SecurityTokenVO> resultDTO = new BatchResultDTO<SecurityTokenVO>();
        try{
            Integer record = securityTokenDAO.getPageCount(querySecurityTokenPage);
            querySecurityTokenPage.setRecord(record);
            resultDTO.setRecord(record);
            if (querySecurityTokenPage.getPageNo() > querySecurityTokenPage.getTotalPages()){
                resultDTO.setErrorDetail("获取用户授信记录表列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<SecurityTokenVO> module = securityTokenDAO.getPageList(querySecurityTokenPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#SecurityTokenServiceImpl called getSecurityTokenList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取用户授信记录表列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<SecurityTokenVO> getsecurityToken(QuerySecurityTokenByPrimaryKey querySecurityTokenByPrimaryKey){
        ResultDTO<SecurityTokenVO> resultDTO = new ResultDTO<SecurityTokenVO>();
        try{
            SecurityTokenVO securityTokenVO = securityTokenDAO.getSecurityTokenByPrimaryKey(querySecurityTokenByPrimaryKey.getTokenId());
            if(null != securityTokenVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(securityTokenVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取用户授信记录表对象失败");
            }
        }catch (Exception e){
            log.error("#SecurityTokenServiceImpl called getSecurityToken error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取用户授信记录表对象失败");
        }
        return resultDTO;
    }

}
