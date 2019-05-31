package com.hw.bean.VO;/**
 * Created by robin on 2019/5/31.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-31 12:59
 * @description: 代理商金豆明细展示BEAN
 **/

@Data
public class AgentGoldenbeanInfoShowVO implements Serializable {
    private static final long serialVersionUID = 7585935285793056215L;

    /**
     *   明细记录ID
     */
    private Long infoId;
    /**
     *   代理商iD
     */
    private Long agentId;
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
    private String agentName;

    /**
     * 代理商编码
     */
    private String agentCode;

    /**
     * 记录发生日期
     */
    private String recordDate;
}
