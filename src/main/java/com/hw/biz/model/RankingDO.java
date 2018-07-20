package com.hw.biz.model;

import java.util.Date;

/**
 * 排行榜
 */
public class RankingDO implements java.io.Serializable {

    private static final long serialVersionUID = -7485706879967980274L;

    private Long id;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 金豆
     */
    private Long jindou;

    /**
     * 奖励
     */
    private Long reward;

    /**
     * 排序
     */
    private Integer rank;

    /**
     * 排行榜类型
     */
    private Integer type;

    private Integer status;

    private Date gmtModify;

    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getJindou() {
        return jindou;
    }

    public void setJindou(Long jindou) {
        this.jindou = jindou;
    }

    public Long getReward() {
        return reward;
    }

    public void setReward(Long reward) {
        this.reward = reward;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
