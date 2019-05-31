package com.hw.bean.VO;/**
 * Created by robin on 2019/5/31.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-31 10:07
 * @description: 代理商金豆数展示bean
 **/

@Data
public class AgentGoldenBeanShowVO implements Serializable {
    private static final long serialVersionUID = -1436682884826621636L;

    /**
     *   代理商ID
     */
    private Long agentId;
    /**
     *   金豆数
     */
    private Long beanCounts;
//    /**
//     *   账户状态
//     */
//    private Integer agentStatus;

    /**
     * 代理商名称
     */
    private String agentName;

    /**
     * 代理商手机号码
     */
    private String mobile;

    /**
     *   代理商编码
     */
    private Integer agentCode;
}
