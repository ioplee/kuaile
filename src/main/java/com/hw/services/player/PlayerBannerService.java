package com.hw.services.player;

import com.hw.bean.BO.QueryBaseBannerPage;
import com.hw.bean.VO.BaseBannerVO;
import com.hw.utils.BatchResultDTO;

/**
 * Created by robin on 2019/5/27.
 */
public interface PlayerBannerService {

    /**
     * Gets banner list.    玩家端 获取banner图片列表
     *
     * @return the banner list
     */
    public BatchResultDTO<BaseBannerVO> getBannerList(QueryBaseBannerPage queryBaseBannerPage);
}
