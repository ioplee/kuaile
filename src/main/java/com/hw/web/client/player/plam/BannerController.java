package com.hw.web.client.player.plam;/**
 * Created by robin on 2019/5/27.
 */

import com.hw.bean.BO.QueryBaseBannerPage;
import com.hw.bean.VO.BaseBannerVO;
import com.hw.services.player.PlayerBannerService;
import com.hw.utils.BatchResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-27 12:35
 * @description: Banner 图controller
 **/

@Api(value = "[玩家端] - banner接口")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "player/plam/banner")
@Slf4j
public class BannerController implements Serializable{
    private static final long serialVersionUID = -4043741631154786555L;

    @Autowired
    private PlayerBannerService playerBannerService;

    @ApiOperation(value = "获取banner列表")
    @PostMapping(value = "getBannerList")
    public BatchResultDTO<BaseBannerVO> getBannerList(@RequestBody @Validated @ModelAttribute(value = "")QueryBaseBannerPage queryBaseBannerPage){
        return playerBannerService.getBannerList(queryBaseBannerPage);
    }
}
