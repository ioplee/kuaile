package com.hw.services.client.impl;/**
 * Created by robin on 2019/4/11.
 */

import com.hw.bean.BO.QueryTUserPageBO;
import com.hw.bean.PO.TUserPO;
import com.hw.bean.VO.TUserVO;
import com.hw.biz.dao.TUserDAO;
import com.hw.services.client.TUserService;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Robin
 * @create: 2019-04-11 12:45
 * @description: 测试用户表 service实现类
 **/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserDAO tUserDAO;

    @Autowired
    StringEncryptor stringEncryptor;

    @Override
    public BaseResultDTO addTUser(TUserPO tUserPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            tUserPO.setPassword(DigestUtils.md5DigestAsHex(tUserPO.getPassword().getBytes()));
            Integer number = tUserDAO.addUser(tUserPO);
            if (number == 1){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("添加测试用户信息失败");
            }
        }catch (Exception e){
            log.error("#TUserServiceImpl called addTUser error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setResultCode("0");
            resultDTO.setErrorDetail("添加测试用户信息出错");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO modifyTUser(TUserPO tUserPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            tUserPO.setPassword(DigestUtils.md5DigestAsHex(tUserPO.getPassword().getBytes()));
            Integer number = tUserDAO.modifyUser(tUserPO);
            if (number == 1){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改测试用户信息失败");
            }
        }catch (Exception e){
            log.error("#TUserServiceImpl called modifyTUser error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setResultCode("0");
            resultDTO.setErrorDetail("修改测试用户信息出错");
        }
        return resultDTO;
    }

    @Override
    public BaseResultDTO setTUserStatus(TUserPO tUserPO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {
            Integer number = tUserDAO.setUserStatus(tUserPO);
            if (number == 1){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
            }else {
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("修改测试用户信息状态失败");
            }
        }catch (Exception e){
            log.error("#TUserServiceImpl called setTUserStatus error#",e);
            resultDTO.setSuccess(false);
            resultDTO.setResultCode("0");
            resultDTO.setErrorDetail("修改测试用户信息状态出错");
        }
        return resultDTO;
    }

    @Override
    public BatchResultDTO<TUserVO> getTUserPage(QueryTUserPageBO queryTUserPageBO) {
        BatchResultDTO<TUserVO> resultDTO = new BatchResultDTO<TUserVO>();
        try {
            Integer record = tUserDAO.getUserListCount(queryTUserPageBO);
            queryTUserPageBO.setRecord(record);
            resultDTO.setRecord(record);
            if(queryTUserPageBO.getPageNo() > queryTUserPageBO.getTotalPages()){
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setSuccess(true);
                resultDTO.setResultCode("1");
            }
            List<TUserVO> module = tUserDAO.getUserList(queryTUserPageBO);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if(null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch (Exception e){
            log.error("#TUserServiceImpl called getTUserPage error#",e);
            resultDTO.setRecord(0);
            resultDTO.setResultCode("0");
            resultDTO.setErrorDetail("获取测试用户列表信息出错");
            resultDTO.setSuccess(false);
            resultDTO.setModule(new ArrayList<>());
        }
        return resultDTO;
    }
}
