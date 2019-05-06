package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.BaseNewsPO;
import com.hw.bean.VO.BaseNewsVO;
import com.hw.bean.BO.QueryBaseNewsPage;
import com.hw.bean.BO.QueryBaseNewsByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 新闻公告表 Service 接口
**/

public interface BaseNewsService {

    /**
    * Add 新闻公告表 dto.
    *
    * @param baseNewsPO  新闻公告表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addBaseNews(BaseNewsPO baseNewsPO);

    /**
    * Modify 新闻公告表 dto.
    *
    * @param baseNewsPO  新闻公告表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyBaseNews(BaseNewsPO baseNewsPO);

    /**
    * Gets BaseNews info.
    *
    * @param queryBaseNewsByPrimaryKey the query BaseNews bean by primary key
    * @return the info
    */
    public ResultDTO<BaseNewsVO> getbaseNews(QueryBaseNewsByPrimaryKey queryBaseNewsByPrimaryKey);

    /**
    * Gets BaseNews list.
    *
    * @param queryBaseNewsPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<BaseNewsVO> getBaseNewsList(QueryBaseNewsPage queryBaseNewsPage);
}
