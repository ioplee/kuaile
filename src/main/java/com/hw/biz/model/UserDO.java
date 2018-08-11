package com.hw.biz.model;

import java.util.Date;

/**
 * 用户
 */
public class UserDO implements java.io.Serializable {

    private static final long serialVersionUID = 5652539315025674810L;

    private Long id;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 密码
     */
    private String password;

    private String phone;

    private String email;

    private String qq;

    /**
     * 安全密码
     */
    private String secretPassword;

    private String name;

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
    private String headImage;

    /**
     * 玩家类型：玩家、代理
     */
    private Integer type;

    /**
     * 账号返点
     */
    private Float fanDian;

    /**
     * 账号赔率
     */
    private Float peiLv;

    /**
     * 用户状态
     */
    private Integer status;

    private Date gmtCreate;

    private Date gmtModify;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getFanDian() {
        return fanDian;
    }

    public void setFanDian(Float fanDian) {
        this.fanDian = fanDian;
    }

    public Float getPeiLv() {
        return peiLv;
    }

    public void setPeiLv(Float peiLv) {
        this.peiLv = peiLv;
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
