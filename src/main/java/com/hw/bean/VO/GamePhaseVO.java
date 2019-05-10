package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:05
* @description: [数据库View BEAN]游戏期数信息
**/

@Data
public class GamePhaseVO implements Serializable {

    private static final long serialVersionUID = 7341473421072542608L;
    /**
    *   游戏期数记录ID
    */
    private Long phaseId;
    /**
    *   游戏期数编号
    */
    private String phaseNo;
    /**
    *   游戏ID
    */
    private Long gameId;
    /**
    *   期数日期
    */
    private String phaseDate;
    /**
    *   状态
    */
    private Integer phaseStatus;
    /**
    *   最后修改时间
    */
    private String gmtModify;
}
