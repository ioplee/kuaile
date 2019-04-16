package com.hw.web.client;/**
 * Created by robin on 2019/4/16.
 */

import com.hw.bean.DTO.memberInfo.AddMemberInfoDTO;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.services.MemberInfoService;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.PropertiesCopyUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-04-16 11:07
 * @description: 玩家端controller
 **/

@Api(value = "玩家接口")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "player")
@Slf4j
public class GamePlayerController implements Serializable{
    private static final long serialVersionUID = -5713545720866433691L;

    @Autowired
    private MemberInfoService memberInfoService;

    @ApiOperation(value = "玩家注册")
    @PostMapping(value = "register")
    public BaseResultDTO register(@RequestBody @Validated @ModelAttribute(value = "")AddMemberInfoDTO addMemberInfoDTO){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(addMemberInfoDTO,MemberInfoPO.class);
        return memberInfoService.addMember(memberInfoPO);
    }


}
