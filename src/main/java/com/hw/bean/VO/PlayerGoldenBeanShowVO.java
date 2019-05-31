package com.hw.bean.VO;/**
 * Created by robin on 2019/5/31.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-31 11:10
 * @description: 玩家金豆数展示bean
 **/

@Data
public class PlayerGoldenBeanShowVO implements Serializable {
    private static final long serialVersionUID = 2812052306905883780L;

    /**
     *   会员ID
     */
    private Long memberId;

    /**
     *   会员编码
     */
    private String memberCode;
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
     *   金豆数
     */
    private Long beanCounts;
}
