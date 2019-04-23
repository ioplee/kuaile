package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:16:14
* @description: [数据库实体BEAN]平台新闻
**/

@Data
public class BaseNewsPO implements Serializable {

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
