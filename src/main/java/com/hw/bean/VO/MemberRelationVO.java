package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]玩家关系族谱表
**/

@Data
public class MemberRelationVO implements Serializable {

    /**
    *   关系记录ID
    */
    private Long realtionId;
    /**
    *   玩家ID
    */
    private Long playerId;
    /**
    *   上级ID
    */
    private Long parentId;
    /**
    *   当前玩家级别深度
    */
    private Integer relationLevel;
    /**
    *   当前玩家抽成比例
    */
    private Integer currentCut;
    /**
    *   上家抽成比例
    */
    private Integer parentCut;
    /**
    *   记录状态
    */
    private Integer relationStatus;
    /**
    *   最后修改时间
    */
    private String gmtModify;
}
