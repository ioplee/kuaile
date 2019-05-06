package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.SecurityTokenPO;
import com.hw.bean.VO.SecurityTokenVO;
import com.hw.bean.BO.QuerySecurityTokenPage;
import com.hw.bean.BO.QuerySecurityTokenByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:31
* @description: 用户授信记录表 Service 接口
**/

public interface SecurityTokenService {

    /**
    * Add 用户授信记录表 dto.
    *
    * @param securityTokenPO  用户授信记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addSecurityToken(SecurityTokenPO securityTokenPO);

    /**
    * Modify 用户授信记录表 dto.
    *
    * @param securityTokenPO  用户授信记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifySecurityToken(SecurityTokenPO securityTokenPO);

    /**
    * Gets SecurityToken info.
    *
    * @param querySecurityTokenByPrimaryKey the query SecurityToken bean by primary key
    * @return the info
    */
    public ResultDTO<SecurityTokenVO> getsecurityToken(QuerySecurityTokenByPrimaryKey querySecurityTokenByPrimaryKey);

    /**
    * Gets SecurityToken list.
    *
    * @param querySecurityTokenPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<SecurityTokenVO> getSecurityTokenList(QuerySecurityTokenPage querySecurityTokenPage);
}
