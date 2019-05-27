package com.hw.services.player.impl;/**
 * Created by robin on 2019/5/27.
 */

import com.hw.bean.BO.QueryBaseBannerPage;
import com.hw.bean.VO.BaseBannerVO;
import com.hw.dao.BaseBannerDAO;
import com.hw.services.player.PlayerBannerService;
import com.hw.utils.BatchResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Robin
 * @create: 2019-05-27 12:39
 * @description: 玩家端 banner service 实现类
 **/

@Service
@Slf4j
@Transactional
public class PlayerBannerServiceImpl implements PlayerBannerService {

    @Autowired
    private BaseBannerDAO baseBannerDAO;

    @Override
    public BatchResultDTO<BaseBannerVO> getBannerList(QueryBaseBannerPage queryBaseBannerPage) {
        BatchResultDTO<BaseBannerVO> resultDTO = new BatchResultDTO<BaseBannerVO>();
        try {
            Integer record = baseBannerDAO.getPageCount(queryBaseBannerPage);
            queryBaseBannerPage.setRecord(record);
            resultDTO.setRecord(record);
            List<BaseBannerVO> module = baseBannerDAO.getPageList(queryBaseBannerPage);
            resultDTO.setResultCode("1");
            resultDTO.setSuccess(true);
            if (null != module && !module.isEmpty()){
                resultDTO.setModule(module);
            }else {
                resultDTO.setModule(new ArrayList<>());
            }
        }catch (Exception e){
            log.error("#PlayerBannerServiceImpl called getBannerList error#",e);
            resultDTO.setErrorDetail("获取banner列表出错");
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setRecord(0);
        }
        return resultDTO;
    }
}
