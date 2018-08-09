package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 彩票玩法
 */
public class WayOfPlayingDO implements Serializable {

    private static final long serialVersionUID = 386371954909401291L;

    private Long id;

    private String name;

    private String describe;

    private List<AttributeDO> attributeDOList;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public List<AttributeDO> getAttributeDOList() {
        return attributeDOList;
    }

    public void setAttributeDOList(List<AttributeDO> attributeDOList) {
        this.attributeDOList = attributeDOList;
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
