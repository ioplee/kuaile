package com.hw.web.client.agent.player;/**
 * Created by robin on 2019/5/15.
 */

import com.hw.bean.BO.QueryMemberInfoByAgent;
import com.hw.bean.BO.QueryMemberInfoByPrimaryKey;
import com.hw.bean.BO.QueryMemberInfoPage;
import com.hw.bean.DTO.ADDMemberInfoDTO;
import com.hw.bean.DTO.ModifyMemberInfoDTO;
import com.hw.bean.PO.MemberInfoPO;
import com.hw.bean.VO.MemberInfoVO;
import com.hw.services.MemberInfoService;
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
 * @create: 2019-05-15 15:22
 * @description: 代理商端 玩家管理 控制类
 **/

@Api(value = "代理商端 - 玩家管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "agent/player")
@Slf4j
public class AgentPlayerController implements Serializable{
    private static final long serialVersionUID = 3803014907510750012L;

    @Autowired
    private MemberInfoService memberInfoService;

    @ApiOperation(value = "[直充模式下功能]代理商创建玩家")
    @PostMapping(value = "addPlayerByAgent")
    public BaseResultDTO addPlayerByAgent(@RequestBody @Validated @ModelAttribute(value = "")ADDMemberInfoDTO addMemberInfoDTO){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(addMemberInfoDTO,MemberInfoPO.class);
        log.debug("add agentID is:"+addMemberInfoDTO.getAgentID());
        log.debug("破agentID is:"+memberInfoPO.getAgentID());
        return memberInfoService.addMemberInfo(memberInfoPO);
    }

    @ApiOperation(value = "[直充模式下功能]代理商修改玩家信息")
    @PostMapping(value = "modifyPlayerByAgent")
    public BaseResultDTO modifyPlayerInfoByAgent(@RequestBody @Validated @ModelAttribute(value = "")ModifyMemberInfoDTO modifyMemberInfoDTO){
        MemberInfoPO memberInfoPO = PropertiesCopyUtil.copyProperties(modifyMemberInfoDTO,MemberInfoPO.class);
        return memberInfoService.modifyMemberInfo(memberInfoPO);
    }

    @ApiOperation(value = "[通用功能]根据玩家ID查询玩家详情信息")
    @PostMapping(value = "getPlayerInfoByUserID")
    public ResultDTO<MemberInfoVO> getMemberInfo(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberInfoByPrimaryKey queryMemberInfoByPrimaryKey){
        return memberInfoService.getmemberInfo(queryMemberInfoByPrimaryKey);
    }

    @ApiOperation(value = "[直充模式下功能]获取代理商下的玩家列表,可按玩家ID和手机号码查询玩家")
    @PostMapping(value = "getPlayerPageByAgent")
    public BatchResultDTO<MemberInfoVO> getMemberPageByAgent(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberInfoByAgent queryMemberInfoByAgent){
        return memberInfoService.getMemberInfoListByAgent(queryMemberInfoByAgent);
    }

    @ApiOperation(value = "[普通功能]获取代理商下的玩家列表,可按玩家ID和手机号码查询玩家")
    @PostMapping(value = "getPlayerPageByCondition")
    public BatchResultDTO<MemberInfoVO> getMemberPage(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberInfoPage queryMemberInfoPage){
        return memberInfoService.getMemberInfoList(queryMemberInfoPage);
    }

}
