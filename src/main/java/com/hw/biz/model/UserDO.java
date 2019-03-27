package com.hw.biz.model;

import java.util.Date;

/**
 * 用户
 */
public class UserDO implements java.io.Serializable {

    private static final long serialVersionUID = 5652539315025674810L;

    private Long id;

    /**
     * 登录的会话id
     */
    private String uuid;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 电邮
     */
    private String email;

    /**
     * qq
     */
    private String qq;

    /**
     * 安全密码
     */
    private String secretPassword;

    /**
     * 支付宝账号
     */
    private String alipayId;

    /**
     * 微信open_id
     */
    private String weixinOpenId;

    /**
     * 微信昵称
     */
    private String weixinNick;

    /**
     * 头像
     */
    private String headImageUrl;

    /**
     * 玩家类型：玩家-0、代理-1
     */
    private Integer type;

    /**
     * 账号彩票返点：8%存储为8
     */
    private Integer caiPiaoFanDian;

    /**
     * 玩家赔率：1980
     */
    private Integer peiLv;

    /**
     * 上级账号ID
     */
    private Long fatherId;

    /**
     * 用户状态：1为正常，-1为删除
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModify;

    /**
     * 备注字段
     */
    private String back;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSecretPassword() {
        return secretPassword;
    }

    public void setSecretPassword(String secretPassword) {
        this.secretPassword = secretPassword;
    }

    public String getAlipayId() {
        return alipayId;
    }

    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId;
    }

    public String getWeixinOpenId() {
        return weixinOpenId;
    }

    public void setWeixinOpenId(String weixinOpenId) {
        this.weixinOpenId = weixinOpenId;
    }

    public String getWeixinNick() {
        return weixinNick;
    }

    public void setWeixinNick(String weixinNick) {
        this.weixinNick = weixinNick;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCaiPiaoFanDian() {
        return caiPiaoFanDian;
    }

    public void setCaiPiaoFanDian(Integer caiPiaoFanDian) {
        this.caiPiaoFanDian = caiPiaoFanDian;
    }

    public Integer getPeiLv() {
        return peiLv;
    }

    public void setPeiLv(Integer peiLv) {
        this.peiLv = peiLv;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
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

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

}
