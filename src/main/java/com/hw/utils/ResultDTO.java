package com.hw.utils;/**
 * Created by robin on 2019/3/5.
 */

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Robin
 * @create: 2019-03-05 15:35
 * @description: 返回对象
 **/

@Data
public class ResultDTO<T> extends BaseResultDTO {

    private static final long serialVersionUID = -8770209277994037079L;

    protected T module;

    // 保存详细的校验错误信息
    protected Map<String, String> checkErrorInfo = new HashMap<String, String>();
}
