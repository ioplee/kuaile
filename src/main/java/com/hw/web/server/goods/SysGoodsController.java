package com.hw.web.server.goods;/**
 * Created by robin on 2019/5/17.
 */

import com.hw.bean.BO.QueryOrderGoodsByPrimaryKey;
import com.hw.bean.BO.QueryOrderGoodsPage;
import com.hw.bean.DTO.ADDOrderGoodsDTO;
import com.hw.bean.DTO.ModifyOrderGoodsDTO;
import com.hw.bean.PO.OrderGoodsPO;
import com.hw.bean.VO.OrderGoodsVO;
import com.hw.services.OrderGoodsService;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.PropertiesCopyUtil;
import com.hw.utils.ResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-17 10:54
 * @description: 管理端 商品管理 控制类
 **/

@Api(value = "[oss] 系统管理 - 商品管理",description = "商品信息管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/goods")
@Slf4j
public class SysGoodsController implements Serializable{
    private static final long serialVersionUID = 1546216750015573969L;

    @Autowired
    private OrderGoodsService orderGoodsService;

    @ApiOperation(value = "创建商品")
    @PostMapping(value = "add")
    public BaseResultDTO addGoods(@RequestBody @Validated @ModelAttribute(value = "")ADDOrderGoodsDTO addOrderGoodsDTO){
        OrderGoodsPO orderGoodsPO = PropertiesCopyUtil.copyProperties(addOrderGoodsDTO,OrderGoodsPO.class);
        return orderGoodsService.addOrderGoods(orderGoodsPO);
    }

    @ApiOperation(value = "修改商品")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyGoods(@RequestBody @Validated @ModelAttribute(value = "")ModifyOrderGoodsDTO modifyOrderGoodsDTO){
        OrderGoodsPO orderGoodsPO = PropertiesCopyUtil.copyProperties(modifyOrderGoodsDTO,OrderGoodsPO.class);
        return orderGoodsService.modifyOrderGoods(orderGoodsPO);
    }

    @ApiOperation(value = "查看商品详情")
    @PostMapping(value = "getGoodsInfo")
    public ResultDTO<OrderGoodsVO> getGoodsInfo(@RequestBody @Validated @ModelAttribute(value = "")QueryOrderGoodsByPrimaryKey queryOrderGoodsByPrimaryKey){
        return orderGoodsService.getorderGoods(queryOrderGoodsByPrimaryKey);
    }

    @ApiOperation(value = "获取商品列表")
    @PostMapping(value = "getGoodsPage")
    public BatchResultDTO<OrderGoodsVO> getGoodsPage(@RequestBody @Validated @ModelAttribute(value = "")QueryOrderGoodsPage queryOrderGoodsPage){
        return orderGoodsService.getOrderGoodsList(queryOrderGoodsPage);
    }

}
