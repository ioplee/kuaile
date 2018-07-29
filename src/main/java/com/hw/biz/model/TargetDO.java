package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 属性值
 */
public class TargetDO implements Serializable {

    private static final long serialVersionUID = -5759573841030727491L;

    private Long id;

    /**
     * 属性值名称
     */
    private String targetName;

    /**
     * 理论赔率
     */
    private Float theoreticalOdds;

    /**
     * 一局彩票的所有投注
     */
    private Long totalJindou;

    /**
     * 实际赔率
     */
    private Float actualOdds;

    private Integer status;

    private Date gmtModify;

    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public Float getTheoreticalOdds() {
        return theoreticalOdds;
    }

    public void setTheoreticalOdds(Float theoreticalOdds) {
        this.theoreticalOdds = theoreticalOdds;
    }

    public Long getTotalJindou() {
        return totalJindou;
    }

    public void setTotalJindou(Long totalJindou) {
        this.totalJindou = totalJindou;
    }

    public Float getActualOdds() {
        return actualOdds;
    }

    public void setActualOdds(Float actualOdds) {
        this.actualOdds = actualOdds;
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
