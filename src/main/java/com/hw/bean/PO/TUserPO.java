package com.hw.bean.PO;/**
 * Created by robin on 2019/4/11.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-11 11:47
 * @description: 测试用户表实体bean
 **/

@Data
public class TUserPO implements Serializable{
    private static final long serialVersionUID = -6774028363451348181L;

    private Integer id;
    private String name;
    private String password;
    private String phone;
    private Integer userStatus;
}
