package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 外部彩票
 */
public class ExternalLotteryDO implements Serializable {

    private static final long serialVersionUID = -8848627660892707381L;

    private Long id;

    /**
     * 外部彩票名称
     */
    private String name;

    /**
     * 外部彩票网站URL
     */
    private String url;

    private Integer status;

    /**
     * 玩法描述
     */
    private String remark;

    private Date gmtModify;

    private Date gmtCreate;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
