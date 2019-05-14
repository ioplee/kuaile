package com.hw.web.server.agent;/**
 * Created by robin on 2019/5/14.
 */

import com.hw.bean.BO.QueryAgentInfoByPrimaryKey;
import com.hw.bean.BO.QueryAgentInfoPage;
import com.hw.bean.DTO.ADDAgentInfoDTO;
import com.hw.bean.DTO.ModifyAgentInfoDTO;
import com.hw.bean.PO.AgentInfoPO;
import com.hw.bean.VO.AgentInfoVO;
import com.hw.services.AgentInfoService;
import com.hw.utils.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-05-14 16:46
 * @description: 管理端 代理商 控制类
 **/

@Api(value = "[oss] 系统管理 - 代理商管理",description = "代理商信息管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/agent")
@Slf4j
public class SysAgentInfoController implements Serializable{
    private static final long serialVersionUID = -4087330341693354306L;

    @Autowired
    private AgentInfoService agentInfoService;

    @ApiOperation(value = "创建代理商")
    @PostMapping(value = "add")
    public BaseResultDTO addAgent(@RequestBody @Validated @ModelAttribute(value = "")ADDAgentInfoDTO addAgentInfoDTO){
        AgentInfoPO agentInfoPO = PropertiesCopyUtil.copyProperties(addAgentInfoDTO,AgentInfoPO.class);
        return agentInfoService.addAgentInfo(agentInfoPO);
    }

    @ApiOperation(value = "修改代理商信息")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyAgent(@RequestBody @Validated @ModelAttribute(value = "")ModifyAgentInfoDTO modifyAgentInfoDTO){
        AgentInfoPO agentInfoPO = PropertiesCopyUtil.copyProperties(modifyAgentInfoDTO,AgentInfoPO.class);
        return agentInfoService.modifyAgentInfo(agentInfoPO);
    }

    @ApiOperation(value = "查询代理商信息")
    @PostMapping(value = "getAgentInfo")
    public ResultDTO<AgentInfoVO> getAgentInfo(@RequestBody @Validated @ModelAttribute(value = "")QueryAgentInfoByPrimaryKey queryAgentInfoByPrimaryKey){
        return agentInfoService.getagentInfo(queryAgentInfoByPrimaryKey);
    }

    @ApiOperation(value = "查询代理商信息列表")
    @PostMapping(value = "agentInfoPage")
    public BatchResultDTO<AgentInfoVO> getAgentInfoPage(@RequestBody @Validated @ModelAttribute(value = "")QueryAgentInfoPage queryAgentInfoPage){
        return agentInfoService.getAgentInfoList(queryAgentInfoPage);
    }

}
