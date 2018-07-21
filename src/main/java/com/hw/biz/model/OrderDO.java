package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 投注订单
 */
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1832613005651162178L;

    private Long id;

    private Long targetId;

    /**
     * 下注额
     */
    private Long amountBet;

    /**
     * 中奖状态
     */
    private Integer winningStatus;

    /**
     * 赢的的金豆数
     */
    private Long winningJindou;

    private Integer status;

    private Date gmtModify;

    private Date gmtCreate;

}
