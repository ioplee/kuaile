package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.PlamVerificationCodePO;
import com.hw.bean.VO.PlamVerificationCodeVO;
import com.hw.bean.BO.QueryPlamVerificationCodePage;
import com.hw.bean.BO.QueryPlamVerificationCodeByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:31
* @description: 验证码记录表 Service 接口
**/

public interface PlamVerificationCodeService {

    /**
    * Add 验证码记录表 dto.
    *
    * @param plamVerificationCodePO  验证码记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addPlamVerificationCode(PlamVerificationCodePO plamVerificationCodePO);

    /**
    * Modify 验证码记录表 dto.
    *
    * @param plamVerificationCodePO  验证码记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyPlamVerificationCode(PlamVerificationCodePO plamVerificationCodePO);

    /**
    * Gets PlamVerificationCode info.
    *
    * @param queryPlamVerificationCodeByPrimaryKey the query PlamVerificationCode bean by primary key
    * @return the info
    */
    public ResultDTO<PlamVerificationCodeVO> getplamVerificationCode(QueryPlamVerificationCodeByPrimaryKey queryPlamVerificationCodeByPrimaryKey);

    /**
    * Gets PlamVerificationCode list.
    *
    * @param queryPlamVerificationCodePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<PlamVerificationCodeVO> getPlamVerificationCodeList(QueryPlamVerificationCodePage queryPlamVerificationCodePage);
}
