package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]会员金豆明细流水
（会员金豆明细分为几类记录：
1、 投注消耗金豆 减金豆
2、 投
**/

@Data
public class ADDMemberGoldenbeanInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   1、 投注消耗金豆 减金豆
            2、 投注中奖 加金豆
            3、 银行账户转入金豆 加金豆
            4、 金豆转入银行账户 减金豆
            5、 购买金豆（购买代理商金豆后，代理商添加金豆） 加金豆
            6、 经验值兑换金豆 加金豆
            7、 签到送金豆 加金豆
            8、 每日救济送金豆 加金豆
            9、 大转盘中奖 加金豆
            
    */
    @ApiModelProperty(value = "infoType" , required = true)
    @NotNull(message = "infoType不允许为空")
    private Integer infoType;
    /**
    *   
    */
    @ApiModelProperty(value = "benaCounts" , required = true)
    @NotNull(message = "benaCounts不允许为空")
    private Long benaCounts;
    /**
    *   金豆明细对应的业务操作记录ID（业务溯源使用）
    */
    @ApiModelProperty(value = "bizId" , required = true)
    @NotNull(message = "bizId不允许为空")
    private Long bizId;
    /**
    *   -1删除 0无效 1有效
    */
    @ApiModelProperty(value = "infpStatus" , required = true)
    @NotNull(message = "infpStatus不允许为空")
    private Integer infpStatus;
}