package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 11:11:27
* @description: [数据库实体BEAN]系统日志
**/

@Data
public class SysLogPO implements Serializable {

    private static final long serialVersionUID = -5499666351120988032L;
    /**
    *   
    */
    private Long logId;
    /**
    *   1 运营端（oss）
            2 代理端（agent）
            3 客户端（PC）
            4 客户端（App）
    */
    private String logSys;
    /**
    *   模块记录对应着相关的模块列表（此列表目前不在库中保存，后续添加进来）
    */
    private String logModule;
    /**
    *   功能名称
    */
    private String logFunction;
    /**
    *   操作人ID
    */
    private Long logUserId;
    /**
    *   具体业务操作描述
    */
    private String logBizMessage;
    /**
    *   操作的具体时间
    */
    private String logBizTime;
}
