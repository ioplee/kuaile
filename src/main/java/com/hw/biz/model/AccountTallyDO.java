package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户流水
 */
public class AccountTallyDO implements Serializable {

    private static final long serialVersionUID = -4760669461687639845L;

    private Long id;

    /**
     * 收入支出类型
     */
    private Integer inOut;

    /**
     * 流水数额
     */
    private Long flowNum;

    /**
     * 流水类型：充值、提现、抽佣、转账、返点、下注、中奖
     */
    private Integer type;

    private String remarks;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInOut() {
        return inOut;
    }

    public void setInOut(Integer inOut) {
        this.inOut = inOut;
    }

    public Long getFlowNum() {
        return flowNum;
    }

    public void setFlowNum(Long flowNum) {
        this.flowNum = flowNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
