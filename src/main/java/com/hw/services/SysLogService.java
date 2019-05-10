package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.SysLogPO;
import com.hw.bean.VO.SysLogVO;
import com.hw.bean.BO.QuerySysLogPage;
import com.hw.bean.BO.QuerySysLogByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:36
* @description: 系统日志 Service 接口
**/

public interface SysLogService {

    /**
    * Add 系统日志 dto.
    *
    * @param sysLogPO  系统日志 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addSysLog(SysLogPO sysLogPO);

    /**
    * Modify 系统日志 dto.
    *
    * @param sysLogPO  系统日志 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifySysLog(SysLogPO sysLogPO);

    /**
    * Gets SysLog info.
    *
    * @param querySysLogByPrimaryKey the query SysLog bean by primary key
    * @return the info
    */
    public ResultDTO<SysLogVO> getsysLog(QuerySysLogByPrimaryKey querySysLogByPrimaryKey);

    /**
    * Gets SysLog list.
    *
    * @param querySysLogPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<SysLogVO> getSysLogList(QuerySysLogPage querySysLogPage);
}
