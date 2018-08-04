package com.hw.services;

import com.hw.biz.model.LotteryTypeDO;

import java.util.List;
import java.util.Map;

/**
 * 彩票类型相关接口
 */
public interface LotteryTypeServices {

    public List<LotteryTypeDO> findAllLotteryType();

    /**
     * 根据彩票类型ID查询彩票类型详情
     * @param id 彩票类型ID
     * @return LotteryTypeDO 彩票类型详情
     */
    public LotteryTypeDO findLotteryTypeById(Long id);

    /**
     * 根据彩票类型的类型查询彩票类型列表
     * @param type 彩票类型的类型
     * @return List<LotteryTypeDO> 彩票类型列表
     */
    public List<LotteryTypeDO> findLotteryTypeByType(Integer type);

    /**
     * 查询彩票类型的类型列表
     * @return List<LotteryTypeDO> 彩票类型的类型列表
     */
    public List<LotteryTypeDO> findTypeNameByLotteryType();

}
