package com.hw.utils.biz;

/**
 * Created by robin on 2019/5/20.
 */
public enum AgentGoldenBeanType {

    UPGoldenBeanPlam(1,"平台上分"),
    UPGoldenBeanUser(2,"卡密上分"),
    DownGoldenBeanToSellUser(3,"减金豆给用户");

    private Integer value;
    private String desc;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private AgentGoldenBeanType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}
