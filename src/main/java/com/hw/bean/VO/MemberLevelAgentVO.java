package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]代理会员等级（直充模式下代理玩家各个等级的配置信息）
**/

@Data
public class MemberLevelAgentVO implements Serializable {

    /**
    *   等级ID
    */
    private Long levelId;
    /**
    *   等级名称
    */
    private String levelName;
    /**
    *   等级抽成比例 0-999
    */
    private Integer levelScore;
    /**
    *   等级状态 -1删除 0停用 1有效
    */
    private Integer levelStatus;
}
