package com.hw.bean.DTO.player;/**
 * Created by robin on 2019/5/27.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 15:08
 * @description: 发送短信验证码
 **/

@Data
public class SendVeryCodeDTO implements Serializable {
    private static final long serialVersionUID = 9089220554715621702L;

    private String mobile;
    private Integer codeType;
    private Long userID;
    private String sendTime;
}
