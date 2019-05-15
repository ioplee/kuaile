package com.hw.web.server.player;/**
 * Created by robin on 2019/5/15.
 */

import com.hw.bean.BO.QueryMemberInfoByPrimaryKey;
import com.hw.bean.BO.QueryMemberInfoPage;
import com.hw.bean.VO.MemberInfoVO;
import com.hw.services.MemberInfoService;
import com.hw.utils.BatchResultDTO;
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
 * @create: 2019-05-15 14:05
 * @description: 系统管理 玩家管理 控制类
 **/

@Api(value = "[oss] 系统管理 - 玩家管理",description = "玩家信息管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/player")
@Slf4j
public class SysPlayerController implements Serializable {
    private static final long serialVersionUID = -707310972478837454L;

    @Autowired
    private MemberInfoService memberInfoService;

    @ApiOperation(value = "获取玩家列表")
    @PostMapping(value = "getPlayerPage")
    public BatchResultDTO<MemberInfoVO> getPlayerPage(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberInfoPage queryMemberInfoPage){
        return memberInfoService.getMemberInfoList(queryMemberInfoPage);
    }

    @ApiOperation(value = "查看玩家详情")
    @PostMapping(value = "getPlayerInfo")
    public ResultDTO<MemberInfoVO> getPlayerInfo(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberInfoByPrimaryKey queryMemberInfoByPrimaryKey){
        return memberInfoService.getmemberInfo(queryMemberInfoByPrimaryKey);
    }


}
