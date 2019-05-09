package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:05
* @description: [数据库View BEAN]新闻公告表
**/

@Data
public class BaseNewsVO implements Serializable {

    /**
    *   新闻ID
    */
    private Long newsId;
    /**
    *   新闻标题
    */
    private String newsTitle;
    /**
    *   新闻时间
    */
    private String newsDate;
    /**
    *   新闻内容
    */
    private String newsContent;
    /**
    *   新闻状态
    */
    private Integer newsStatus;
}
