package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 投注订单
 */
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1832613005651162178L;

    private Long id;

    private Long userId;

    private Long lotteryId;

    private LotteryDO lotteryDO;

    private List<AttributeDO> attributeDOList;

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

    /**
     * 下注倍率
     */
    private Integer beiLv;

    /**
     * 下注赔率
     */
    private Integer betPeiLv;

    /**
     * 订单状态：新建、支付中、已付款、已删除
     */
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

    public List<AttributeDO> getAttributeDOList() {
        return attributeDOList;
    }

    public void setAttributeDOList(List<AttributeDO> attributeDOList) {
        this.attributeDOList = attributeDOList;
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

    public Integer getBeiLv() {
        return beiLv;
    }

    public void setBeiLv(Integer beiLv) {
        this.beiLv = beiLv;
    }

    public Integer getBetPeiLv() {
        return betPeiLv;
    }

    public void setBetPeiLv(Integer betPeiLv) {
        this.betPeiLv = betPeiLv;
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
