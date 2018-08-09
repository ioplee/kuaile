package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 玩法属性
 */
public class AttributeDO implements Serializable {

    private static final long serialVersionUID = 4397710156428788442L;

    private Long id;

    private List<TargetDO> targetDOList;

    private String attributeName;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TargetDO> getTargetDOList() {
        return targetDOList;
    }

    public void setTargetDOList(List<TargetDO> targetDOList) {
        this.targetDOList = targetDOList;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
