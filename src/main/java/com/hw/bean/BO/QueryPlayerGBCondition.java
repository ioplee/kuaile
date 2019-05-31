package com.hw.bean.BO;/**
 * Created by robin on 2019/5/31.
 */

import com.hw.utils.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: Robin
 * @create: 2019-05-31 13:58
 * @description: 玩家金豆明细查询条件传输BEAN
 **/

@Data
public class QueryPlayerGBCondition extends BaseQuery {
    private static final long serialVersionUID = 9088967451785840292L;

    @ApiModelProperty(value = "玩家编码(精确查询),不传值时默认为-1",required = true)
    @NotNull(message = "玩家编码不允许为空")
    private Integer playerCode;

    @ApiModelProperty(value = "玩家名称(模糊查询)")
    private String playerName;

    @ApiModelProperty(value = "金豆金额(精确查询),不传值时默认为-1",required = true)
    @NotNull(message = "金豆金额不允许为空")
    private Long beanCounts;

    @ApiModelProperty(value = "开始日期")
    private String beginDate;

    @ApiModelProperty(value = "结束日期")
    private String endDate;
}
