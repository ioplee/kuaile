package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 玩家账户
 */
public class AccountDO implements Serializable {

    private static final long serialVersionUID = 7587791155263429491L;

    private Long id;

    private Long userId;

    /**
     * 流水金豆
     */
    private Long flowJindou;

    /**
     * 银行金豆
     */
    private Long bankJindou;

    private Integer status;

    private Date gmtModifiy;

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

    public Long getFlowJindou() {
        return flowJindou;
    }

    public void setFlowJindou(Long flowJindou) {
        this.flowJindou = flowJindou;
    }

    public Long getBankJindou() {
        return bankJindou;
    }

    public void setBankJindou(Long bankJindou) {
        this.bankJindou = bankJindou;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtModifiy() {
        return gmtModifiy;
    }

    public void setGmtModifiy(Date gmtModifiy) {
        this.gmtModifiy = gmtModifiy;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
