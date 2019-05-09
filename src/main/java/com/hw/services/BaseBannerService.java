package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.BaseBannerPO;
import com.hw.bean.VO.BaseBannerVO;
import com.hw.bean.BO.QueryBaseBannerPage;
import com.hw.bean.BO.QueryBaseBannerByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:39
* @description: banner广告图 Service 接口
**/

public interface BaseBannerService {

    /**
    * Add banner广告图 dto.
    *
    * @param baseBannerPO  banner广告图 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addBaseBanner(BaseBannerPO baseBannerPO);

    /**
    * Modify banner广告图 dto.
    *
    * @param baseBannerPO  banner广告图 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyBaseBanner(BaseBannerPO baseBannerPO);

    /**
    * Gets BaseBanner info.
    *
    * @param queryBaseBannerByPrimaryKey the query BaseBanner bean by primary key
    * @return the info
    */
    public ResultDTO<BaseBannerVO> getbaseBanner(QueryBaseBannerByPrimaryKey queryBaseBannerByPrimaryKey);

    /**
    * Gets BaseBanner list.
    *
    * @param queryBaseBannerPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<BaseBannerVO> getBaseBannerList(QueryBaseBannerPage queryBaseBannerPage);
}
