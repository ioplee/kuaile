package com.hw.bean.BO;

import com.hw.utils.BaseQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]会员表
**/

@Data
public class QueryMemberInfoPage extends BaseQuery {

    private static final long serialVersionUID = 4706961537826195956L;

    /**
     * 玩家ID
     */
    @ApiModelProperty(value = "玩家ID")
    private String playerCode;
    /**
     * 手机号码
     */
    @ApiModelProperty(value = "玩家手机号码")
    private String mobile;
}
