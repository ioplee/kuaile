package com.hw.services;

import com.hw.bean.BO.QueryBaseNewsByPrimaryKey;
import com.hw.bean.BO.QueryBaseNewsPage;
import com.hw.bean.PO.BaseNewsPO;
import com.hw.bean.VO.BaseNewsVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

/**
 * The interface Base news service.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:12:39
 * @description: 新闻公告表 Service 接口
 */
public interface BaseNewsService {

    /**
     * Add 新闻公告表 dto.
     *
     * @param baseNewsPO 新闻公告表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO addBaseNews(BaseNewsPO baseNewsPO);

    /**
     * Modify 新闻公告表 dto.
     *
     * @param baseNewsPO 新闻公告表 实体对象
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

    /**
     * Reset news status base result dto.   设置新闻公告状态
     *
     * @param baseNewsPO the base news po
     * @return the base result dto
     */
    public BaseResultDTO resetNewsStatus(BaseNewsPO baseNewsPO);
}
