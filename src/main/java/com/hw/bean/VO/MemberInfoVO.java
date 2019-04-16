package com.hw.bean.VO;/**
 * Created by robin on 2019/4/15.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-15 22:34
 * @description: 玩家展示BEAN
 **/

@Data
public class MemberInfoVO implements Serializable{
    private static final long serialVersionUID = -2396572224468208692L;

    private Long memberId;

    /**
     * 平台唯一有序会员编码,业务交易及核心业务主要验证身份依据.
     */
    private String memberName;

    private String memberNickname;

    private String userName;

    /**
     * 头像icon链接地址,可以是系统默认的图片路径,也可以配置在词典表或头像维护表中
     */
    private String memberIconUrl;

    /**
     * 手机号码,需前段对手机号码合法性进行校验
     */
    private String memberMobile;

    private String memberQq;

    private String memberEmail;

    private String memberWx;

    /**
     * 0不需要1需要微信验证
     */
    private Integer isWxcheck;

    /**
     * 会员等级 从0-7 八个等级(等级不允许修改,随会员经验值增加而自动调整会员等级)

     */
    private Integer memberLevel;

    /**
     * 会员经验值,根据经验值明细表实时(需要定时校验刷新)
     */
    private Long memberXp;

    private String registerDate;

    /**
     * -1删除0停用或冻结1有效
     */
    private Integer memberStatus;

    private String extendLinks;

    /**
     * 注册时，注册地址带的会员编码所对应的会员ID
     */
    private Long parentId;

    private String lastIp;

    /**
     * 上一次登录系统时间
     */
    private String lastLogintime;

    /**
     * 用于累计用户签到次数，不用复杂运算，使用此字段来进行逻辑判断。
     */
    private Integer singinCounts;

    private String gmtCreate;

    private String gmtModified;
}
