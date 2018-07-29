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
     * 投注人数
     */
    private Integer totalBetting;

    /**
     * 中奖人数
     */
    private Integer totalWinner;

    private Integer status;

    private Date gmtModify;

    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLotteryTypeId() {
        return lotteryTypeId;
    }

    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    public LotteryTypeDO getLotteryTypeDO() {
        return lotteryTypeDO;
    }

    public void setLotteryTypeDO(LotteryTypeDO lotteryTypeDO) {
        this.lotteryTypeDO = lotteryTypeDO;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Long getResultTargetId() {
        return resultTargetId;
    }

    public void setResultTargetId(Long resultTargetId) {
        this.resultTargetId = resultTargetId;
    }

    public Long getTotalJindou() {
        return totalJindou;
    }

    public void setTotalJindou(Long totalJindou) {
        this.totalJindou = totalJindou;
    }

    public Integer getTotalBetting() {
        return totalBetting;
    }

    public void setTotalBetting(Integer totalBetting) {
        this.totalBetting = totalBetting;
    }

    public Integer getTotalWinner() {
        return totalWinner;
    }

    public void setTotalWinner(Integer totalWinner) {
        this.totalWinner = totalWinner;
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
