package com.hw.web.client.player;/**
 * Created by robin on 2019/5/15.
 */

import com.hw.bean.DTO.player.*;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.services.MemberInfoService;
import com.hw.services.player.PlayerInfoService;
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
 * @create: 2019-05-15 18:22
 * @description: 玩家端 玩家信息 控制类
 **/

@Api(value = "[玩家端] - 个人信息管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "player/info")
@Slf4j
public class PlayerInfoController implements Serializable {
    private static final long serialVersionUID = -4382924575522857894L;

    @Autowired
    private MemberInfoService memberInfoService;

    @Autowired
    private PlayerInfoService playerInfoService;

    @ApiOperation(value = "玩家注册")
    @PostMapping(value = "register")
    public BaseResultDTO register(@RequestBody @Validated @ModelAttribute(value = "")PlayerRegisterDTO playerRegisterDTO){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(playerRegisterDTO,MemberInfoPO.class);
        //完善没有填写的信息
        memberInfoPO.setMemberName("");//玩家编码
        memberInfoPO.setMemberIconUrl("");//此处应该设置默认头像(一期先配置死)
        memberInfoPO.setMemberLevel(1);
        memberInfoPO.setMemberStatus(1);
        memberInfoPO.setMemberType(playerRegisterDTO.getRegType());//注册玩家
        memberInfoPO.setMemberXp(0l);//玩家经验值

        return memberInfoService.addMemberInfo(memberInfoPO);
    }

    @ApiOperation(value = "玩家修改个人信息")
    @PostMapping(value = "resetPlayerInfo")
    public BaseResultDTO modifyMemberInfo(@RequestBody @Validated @ModelAttribute(value = "")ResetPlayerInfoDTO resetPlayerInfoDTO){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(resetPlayerInfoDTO,MemberInfoPO.class);
        return playerInfoService.resetPlayerInfo(memberInfoPO);
    }

    @ApiOperation(value = "玩家修改个人登录密码")
    @PostMapping(value = "resetLoginPassword")
    public BaseResultDTO resetLoginPassword(@RequestBody @Validated @ModelAttribute(value = "")ResetPlayerPasswordDTO resetPlayerPasswordDTO){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(resetPlayerPasswordDTO,MemberInfoPO.class);
        return playerInfoService.resetLoginPassword(memberInfoPO);
    }

    @ApiOperation(value = "玩家修改个人银行密码")
    @PostMapping(value = "resetBankPassword")
    public BaseResultDTO resetBankPassword(@RequestBody @Validated @ModelAttribute(value = "")ResetPlayerBankPasswordDTO resetPlayerBankPasswordDTO){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(resetPlayerBankPasswordDTO,MemberInfoPO.class);
        return playerInfoService.resetBankPassword(memberInfoPO);
    }

    @ApiOperation(value = "发送短信验证码")
    @PostMapping(value = "sendVerifyCode")
    public BaseResultDTO sendVeryCode(@RequestBody @Validated @ModelAttribute(value = "")SendVeryCodeDTO sendVeryCodeDTO){
        return null;
    }


}
