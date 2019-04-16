package com.hw.utils;/**
 * Created by robin on 2019/3/5.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-03-05 15:31
 * @description: 基础返回类
 **/

@Data
public class BaseResultDTO implements Serializable {

    private static final long serialVersionUID = 7927707196856808811L;

    /** The success. 操作结果*/
    protected boolean success = true;

    /** The result code. 业务编码*/
    protected String resultCode;

    /** The error detail. 错误描述*/
    protected String errorDetail;

//    /**
//     * 校验错误
//     */
//    protected List<FieldError> errors;
}
