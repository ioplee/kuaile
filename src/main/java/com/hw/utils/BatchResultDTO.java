package com.hw.utils;/**
 * Created by robin on 2019/3/5.
 */

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Robin
 * @create: 2019-03-05 15:38
 * @description: 批量结果返回
 **/

@Data
public class BatchResultDTO<T> extends BaseResultDTO {
    private static final long serialVersionUID = 2419951447719994600L;

    private Map<Long, String> faileds = new HashMap<Long, String>();// 失败列表
    private List<T> module;
    private int record;
}
