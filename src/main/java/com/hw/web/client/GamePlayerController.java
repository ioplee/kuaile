package com.hw.web.client;/**
 * Created by robin on 2019/4/16.
 */

import com.hw.services.MemberInfoService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
/**
    @ApiOperation(value = "玩家注册")
    @PostMapping(value = "register")
    public BaseResultDTO register(@RequestBody @Validated @ModelAttribute(value = "")AddMemberInfoDTO addMemberInfoDTO,HttpServletRequest request){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(addMemberInfoDTO,MemberInfoPO.class);
        //String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpcCI6IjE5Mi4xNjguMC4xMDEiLCJ1c2VySUQiOjEwMDAxLCJ1c2VyVHlwZSI6MCwiaXNzIjoidG9rZW5fY2hlY2siLCJhdWQiOiJod2dhbWUiLCJleHAiOjE1NTU0OTAxMzYsIm5iZiI6MTU1NTQ4OTgzNn0.DDb3Oanm1sfuPMpYS7MsXEVmuTQwQXG0R9Ql53aAllc";
        log.debug("remoteHost"+request.getRemoteHost());
        log.debug("remoteUser"+request.getRemoteUser());
        log.debug("remoteSessionID"+request.getRequestedSessionId());
        log.debug(request.getRequestURI()+"111");
        String token = JWTUtil.createJWT("192.168.0.101",0,10001l);
        log.debug("token is:"+token);
        Date now = new Date();
        log.debug("token"+JWTUtil.parseJWT(token).isEmpty());
        log.debug("token"+JWTUtil.parseJWT(token).toString());
        log.debug(JWTUtil.parseJWT(token).getExpiration()+"");
        log.debug("是否超时"+JWTUtil.parseJWT(token).getExpiration().after(now));
        return memberInfoService.addMember(memberInfoPO);
    }

*/


}
