package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 每期彩票
 */
public class LotteryDO implements Serializable {

    private static final long serialVersionUID = -1839249654409237121L;

    private Long id;

    private Long lotteryTypeId;

    private LotteryTypeDO lotteryTypeDO;

    private List<TargetDO> targetList;

    /**
     * 期号
     */
    private String number;

    /**
     * 开奖描述
     */
    private String describe;

    /**
     * 开奖结果ID
     */
    private Long resultTargetId;

    private Long totalJindou;

    /**
     * 投注人
     */
    private Integer totalBetting;

    /**
     * 中奖人
     */
    private Integer totalWinner;

    private Integer status;

    private Date gmtModify;

    private Date gmtCreate;

}
