package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 投注订单
 */
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1832613005651162178L;

    private Long id;

    private Long userId;

    private Long lotteryId;

    private LotteryDO lotteryDO;

    private Long targetId;

    private TargetDO targetDO;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Long lotteryId) {
        this.lotteryId = lotteryId;
    }

    public LotteryDO getLotteryDO() {
        return lotteryDO;
    }

    public void setLotteryDO(LotteryDO lotteryDO) {
        this.lotteryDO = lotteryDO;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public TargetDO getTargetDO() {
        return targetDO;
    }

    public void setTargetDO(TargetDO targetDO) {
        this.targetDO = targetDO;
    }

    public Long getAmountBet() {
        return amountBet;
    }

    public void setAmountBet(Long amountBet) {
        this.amountBet = amountBet;
    }

    public Integer getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Integer winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Long getWinningJindou() {
        return winningJindou;
    }

    public void setWinningJindou(Long winningJindou) {
        this.winningJindou = winningJindou;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
