package com.hw.bean.BO;/**
 * Created by robin on 2019/5/31.
 */

import com.hw.utils.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: Robin
 * @create: 2019-05-31 12:48
 * @description: 代理商金豆明细条件BEAN
 **/

@Data
public class QueryAgentGBCondtion extends BaseQuery {
    private static final long serialVersionUID = 3584890577772592218L;

    @ApiModelProperty(value = "代理商编码(精确查询),不传值时默认为-1",required = true)
    @NotNull(message = "代理商编码不允许为空")
    private Integer agentCode;

    @ApiModelProperty(value = "代理商名称(模糊查询)")
    private String agentName;

    @ApiModelProperty(value = "金豆金额(精确查询),不传值时默认为-1",required = true)
    @NotNull(message = "金豆金额不允许为空")
    private Long beanCounts;

    @ApiModelProperty(value = "开始日期")
    private String beginDate;

    @ApiModelProperty(value = "结束日期")
    private String endDate;
}
