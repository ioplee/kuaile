package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 分红属性
 */
public class DividendConfigDO implements Serializable {

    private static final long serialVersionUID = -1137793554433273984L;

    private Long id;

    /**
     * 代理商ID
     */
    private Long userId;

    /**
     * 流水要求
     */
    private Long tallyNum;

    /**
     * 亏损要求
     */
    private Long lossNum;

    /**
     * 分红比例
     */
    private Float dividendProportion;

    /**
     * 赔率要求
     */
    private Float peiLv;

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

    public Long getTallyNum() {
        return tallyNum;
    }

    public void setTallyNum(Long tallyNum) {
        this.tallyNum = tallyNum;
    }

    public Long getLossNum() {
        return lossNum;
    }

    public void setLossNum(Long lossNum) {
        this.lossNum = lossNum;
    }

    public Float getDividendProportion() {
        return dividendProportion;
    }

    public void setDividendProportion(Float dividendProportion) {
        this.dividendProportion = dividendProportion;
    }

    public Float getPeiLv() {
        return peiLv;
    }

    public void setPeiLv(Float peiLv) {
        this.peiLv = peiLv;
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
