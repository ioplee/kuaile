package com.hw.bean.VO;/**
 * Created by robin on 2019/5/31.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-31 13:45
 * @description: 玩家金豆金豆明细查询展示VO
 **/

@Data
public class PlayerGoldenBeanInfoShowVO implements Serializable {
    private static final long serialVersionUID = 2089324490455737012L;

    /**
     *   明细记录ID
     */
    private Long infoId;
    /**
     *   代理商iD
     */
    private Long playerId;
    /**
     *   记录类型(1代理商上分增加记录 2代理商下分扣减记录 3代理商给玩家上分扣减)
     */
    private Integer infoType;
    /**
     *   金豆数值
     */
    private Long beanCounts;

    /**
     * 代理商名称
     */
    private String playerName;

    /**
     * 代理商编码
     */
    private String playerCode;

    /**
     * 记录发生日期
     */
    private String recordDate;
}
