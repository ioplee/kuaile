package com.hw.services.impl;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;
import com.hw.dao.SysMenuDAO;
import com.hw.bean.PO.SysMenuPO;
import com.hw.bean.VO.SysMenuVO;
import com.hw.bean.BO.QuerySysMenuPage;
import com.hw.bean.BO.QuerySysMenuByPrimaryKey;
import com.hw.services.SysMenuService;

import java.util.ArrayList;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:44
* @description: 系统菜单表（系统权限控制在菜单级） Service 实现类
**/

@Service
@Slf4j
@Transactional(rollbackFor = RuntimeException.class)
public class SysMenuServiceImpl implements SysMenuService{

    @Autowired
    private SysMenuDAO sysMenuDAO;

    @Override
    public BaseResultDTO addSysMenu(SysMenuPO sysMenuPO){
        BaseResultDTO addResultDTO = new BaseResultDTO();
        try{
            Integer number = sysMenuDAO.insertSysMenu(sysMenuPO);
            if(number == 1){
                addResultDTO.setResultCode("1");
                addResultDTO.setSuccess(true);
            }else{
                addResultDTO.setErrorDetail("添加系统菜单表（系统权限控制在菜单级）信息失败");
                addResultDTO.setSuccess(true);
                addResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysMenuServiceImpl called addSysMenu error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            addResultDTO.setResultCode("0");
            addResultDTO.setSuccess(false);
            addResultDTO.setErrorDetail("添加系统菜单表（系统权限控制在菜单级）出错");
        }
        return addResultDTO;
    }

    @Override
    public BaseResultDTO modifySysMenu(SysMenuPO sysMenuPO){
        BaseResultDTO modifyResultDTO = new BaseResultDTO();
        try{
            Integer number = sysMenuDAO.updateSysMenu(sysMenuPO);
            if(number == 1){
                modifyResultDTO.setResultCode("1");
                modifyResultDTO.setSuccess(true);
            }else{
                modifyResultDTO.setErrorDetail("修改系统菜单表（系统权限控制在菜单级）信息失败");
                modifyResultDTO.setSuccess(true);
                modifyResultDTO.setResultCode("0");
            }
        }catch (Exception e){
            log.error("#SysMenuServiceImpl called modifySysMenu error#",e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            modifyResultDTO.setResultCode("0");
            modifyResultDTO.setSuccess(false);
            modifyResultDTO.setErrorDetail("修改系统菜单表（系统权限控制在菜单级）出错");
        }
        return modifyResultDTO;
    }

    @Override
    public BatchResultDTO<SysMenuVO> getSysMenuList(QuerySysMenuPage querySysMenuPage){
        BatchResultDTO<SysMenuVO> resultDTO = new BatchResultDTO<SysMenuVO>();
        try{
            Integer record = sysMenuDAO.getPageCount(querySysMenuPage);
            querySysMenuPage.setRecord(record);
            resultDTO.setRecord(record);
            if (querySysMenuPage.getPageNo() > querySysMenuPage.getTotalPages()){
                resultDTO.setErrorDetail("获取系统菜单表（系统权限控制在菜单级）列表失败,参悟有误.");
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(true);
                resultDTO.setModule(new ArrayList<>());
                resultDTO.setRecord(0);
            }
            List<SysMenuVO> module = sysMenuDAO.getPageList(querySysMenuPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch(Exception e){
            log.error("#SysMenuServiceImpl called getSysMenuList error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统菜单表（系统权限控制在菜单级）列表失败");
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO<SysMenuVO> getsysMenu(QuerySysMenuByPrimaryKey querySysMenuByPrimaryKey){
        ResultDTO<SysMenuVO> resultDTO = new ResultDTO<SysMenuVO>();
        try{
            SysMenuVO sysMenuVO = sysMenuDAO.getSysMenuByPrimaryKey(querySysMenuByPrimaryKey.getMenuId());
            if(null != sysMenuVO){
                resultDTO.setResultCode("1");
                resultDTO.setSuccess(true);
                resultDTO.setModule(sysMenuVO);
            }else{
                resultDTO.setResultCode("0");
                resultDTO.setSuccess(false);
                resultDTO.setErrorDetail("获取系统菜单表（系统权限控制在菜单级）对象失败");
            }
        }catch (Exception e){
            log.error("#SysMenuServiceImpl called getSysMenu error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("获取系统菜单表（系统权限控制在菜单级）对象失败");
        }
        return resultDTO;
    }

}
