package com.hw.web.server.player;/**
 * Created by robin on 2019/5/14.
 */

import com.hw.bean.BO.QueryMemberLevelPlayerByPrimaryKey;
import com.hw.bean.BO.QueryMemberLevelPlayerPage;
import com.hw.bean.DTO.ADDMemberLevelPlayerDTO;
import com.hw.bean.DTO.ModifyMemberLevelPlayerDTO;
import com.hw.bean.PO.MemberLevelPlayerPO;
import com.hw.bean.VO.MemberLevelPlayerVO;
import com.hw.services.MemberLevelPlayerService;
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
 * @create: 2019-05-14 18:17
 * @description: 管理端 玩家等级管理
 **/

@Api(value = "[oss] 系统管理 - 玩家管理",description = "玩家等级信息管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/playerLevel")
@Slf4j
public class SysPlayerLevelController implements Serializable{

    private static final long serialVersionUID = -2770895815316890322L;

    //玩家等级Service
    @Autowired
    private MemberLevelPlayerService memberLevelPlayerService;

    @ApiOperation(value = "创建玩家等级")
    @PostMapping(value = "add")
    public BaseResultDTO addPlayerLevel(@RequestBody @Validated @ModelAttribute(value = "")ADDMemberLevelPlayerDTO addMemberLevelPlayerDTO){
        MemberLevelPlayerPO memberLevelPlayerPO = PropertiesCopyUtil.copyProperties(addMemberLevelPlayerDTO,MemberLevelPlayerPO.class);
        return memberLevelPlayerService.addMemberLevelPlayer(memberLevelPlayerPO);
    }

    @ApiOperation(value = "修改玩家等级")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyPlayerLevel(@RequestBody @Validated @ModelAttribute(value = "")ModifyMemberLevelPlayerDTO modifyMemberLevelPlayerDTO){
        MemberLevelPlayerPO memberLevelPlayerPO = PropertiesCopyUtil.copyProperties(modifyMemberLevelPlayerDTO,MemberLevelPlayerPO.class);
        return memberLevelPlayerService.modifyMemberLevelPlayer(memberLevelPlayerPO);
    }

    @ApiOperation(value = "查询玩家等级信息")
    @PostMapping(value = "getinfo")
    public ResultDTO<MemberLevelPlayerVO> getLevelInfo(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberLevelPlayerByPrimaryKey queryMemberLevelPlayerByPrimaryKey){
        return memberLevelPlayerService.getmemberLevelPlayer(queryMemberLevelPlayerByPrimaryKey);
    }
    @ApiOperation(value = "查询玩家等级信息列表")
    @PostMapping(value = "getList")
    public BatchResultDTO<MemberLevelPlayerVO> getLevelList(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberLevelPlayerPage queryMemberLevelPlayerPage){
        return memberLevelPlayerService.getMemberLevelPlayerList(queryMemberLevelPlayerPage);
    }

}
