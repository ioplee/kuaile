package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 分红明细
 */
public class DetailedDividendDO implements Serializable {

    private static final long serialVersionUID = -9045137250356122300L;

    private Long id;

    /**
     * 代理ID
     */
    private Long userId;

    /**
     * 分红数额
     */
    private Long dividendNum;

    /**
     * 账期
     */
    private String period;

    private Date gmtCreate;

    private Date gmtModify;

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

    public Long getDividendNum() {
        return dividendNum;
    }

    public void setDividendNum(Long dividendNum) {
        this.dividendNum = dividendNum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}
