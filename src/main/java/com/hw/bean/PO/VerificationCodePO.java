package com.hw.bean.PO;/**
 * Created by robin on 2019/5/27.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 17:48
 * @description: 短信验证码实体BEAN
 **/

@Data
public class VerificationCodePO implements Serializable {
    private static final long serialVersionUID = -2096787339817224737L;

    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 业务类型
     */
    private Integer codeType;
    /**
     * 接收用户ID
     */
    private Long userID;
    /**
     * 发送时间
     */
    private String sendTime;
}
