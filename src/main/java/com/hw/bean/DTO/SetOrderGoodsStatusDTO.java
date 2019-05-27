package com.hw.bean.DTO;/**
 * Created by robin on 2019/5/27.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 11:41
 * @description: 设置奖品状态DTO
 **/

@Data
public class SetOrderGoodsStatusDTO implements Serializable{
    private static final long serialVersionUID = 6539822956508838593L;

    /**
     *   奖品状态
     */
    @ApiModelProperty(value = "goodsStatus 奖品状态(-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "goodsStatus不允许为空")
    private Integer goodsStatus = 1;

    @ApiModelProperty(value = "奖品ID" , required = true)
    @NotNull(message = "奖品ID不允许为空")
    private Long goodsId;
}
