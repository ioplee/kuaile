package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]平台新闻
**/

@Data
public class BaseNewsVO implements Serializable {

    /**
    *   
    */
    private Long newsId;
    /**
    *   
    */
    private String newsTitle;
    /**
    *   
    */
    private String newsDate;
    /**
    *   
    */
    private String newsContent;
    /**
    *   -1删除 0撤回 1有效
    */
    private Integer newsStatus;
}
