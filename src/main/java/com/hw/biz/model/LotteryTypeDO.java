package com.hw.biz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 彩票类型
 */
public class LotteryTypeDO implements Serializable {

    private static final long serialVersionUID = 6440462467117340503L;

    private Long id;

    private String lotteryTypeName;

    /**
     * 外部彩票id
     */
    private Long externalId;

    /**
     * 外部彩票
     */
    private ExternalLotteryDO externalLottery;

    /**
     * 玩法列表
     */
    private List<WayOfPlayingDO> wayOfPlayingList;

    /**
     * 分类：时时彩、全天彩、11选5、快3、快乐8、其他
     */
    private Integer type;

    private String typeName;

    private Integer status;

    private Date gmtModify;

    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLotteryTypeName() {
        return lotteryTypeName;
    }

    public void setLotteryTypeName(String lotteryTypeName) {
        this.lotteryTypeName = lotteryTypeName;
    }

    public Long getExternalId() {
        return externalId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }

    public ExternalLotteryDO getExternalLottery() {
        return externalLottery;
    }

    public void setExternalLottery(ExternalLotteryDO externalLottery) {
        this.externalLottery = externalLottery;
    }

    public List<WayOfPlayingDO> getWayOfPlayingList() {
        return wayOfPlayingList;
    }

    public void setWayOfPlayingList(List<WayOfPlayingDO> wayOfPlayingList) {
        this.wayOfPlayingList = wayOfPlayingList;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
