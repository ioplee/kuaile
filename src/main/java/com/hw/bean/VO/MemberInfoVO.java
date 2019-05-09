package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]会员表
**/

@Data
public class MemberInfoVO implements Serializable {

    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   会员编码
    */
    private String memberName;
    /**
    *   会员昵称
    */
    private String memberNickname;
    /**
    *   真实姓名
    */
    private String userName;
    /**
    *   头像
    */
    private String memberIconUrl;
    /**
    *   手机号码
    */
    private String memberMobile;
    /**
    *   QQ
    */
    private String memberQq;
    /**
    *   常用邮箱
    */
    private String memberEmail;
    /**
    *   微信
    */
    private String memberWx;
    /**
    *   登录是否微信验证
    */
    private Integer isWxcheck;
    /**
    *   会员等级
    */
    private Integer memberLevel;
    /**
    *   会员经验值
    */
    private Long memberXp;
    /**
    *   注册日期
    */
    private String registerDate;
    /**
    *   会员状态
    */
    private Integer memberStatus;
    /**
    *   推广链接地址
    */
    private String extendLinks;
    /**
    *   上级会员ID
    */
    private Long parentId;
    /**
    *   上次登录ip地址
    */
    private String lastIp;
    /**
    *   上次登录时间
    */
    private String lastLogintime;
    /**
    *   连续签到数
    */
    private Integer singinCounts;
    /**
    *   登录密码
    */
    private String loginPass;
    /**
    *   银行密码
    */
    private String bankPass;
    /**
    *   玩家类型 
            1 玩家 2代理玩家
    */
    private Integer memberType;
    /**
    *   抽成比例
    */
    private String gameRate;
}
