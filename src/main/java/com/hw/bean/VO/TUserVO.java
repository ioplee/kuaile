package com.hw.bean.VO;/**
 * Created by robin on 2019/4/11.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-11 12:05
 * @description: 用户信息VO
 **/

@Data
public class TUserVO implements Serializable{
    private static final long serialVersionUID = -4233331788738904878L;

    private Integer id;
    private String name;
    private String password;
    private String phone;
    private Integer userStatus;
}
