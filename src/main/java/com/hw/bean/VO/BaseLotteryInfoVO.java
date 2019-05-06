package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:06
* @description: [数据库View BEAN]玩家福利列表
**/

@Data
public class BaseLotteryInfoVO implements Serializable {

    private static final long serialVersionUID = 5585043711670178262L;
    /**
    *   福利ID
    */
    private Long lotteryId;
    /**
    *   福利标题
    */
    private String lotteryTitle;
    /**
    *   福利内容
    */
    private String lotteryContent;
    /**
    *   活动开始日期
    */
    private String beginDate;
    /**
    *   活动结束日期
    */
    private String endDate;
    /**
    *   活动宣传图片地址
    */
    private String imgUrl;
    /**
    *   活动参与对象
    */
    private Integer targetMember;
    /**
    *   活动状态
    */
    private Integer lotteryStatus;
}
