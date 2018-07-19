package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

public class TargetDO implements Serializable {

    private static final long serialVersionUID = -5759573841030727491L;

    private Long id;

    private String targetName;

    private Float theoreticalOdds;

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
