package com.hw.web.server.agent;/**
 * Created by robin on 2019/5/20.
 */

import com.hw.bean.BO.QueryAgentGoldenbeanInfoPage;
import com.hw.bean.BO.QueryAgentGoldenbeanPage;
import com.hw.bean.DTO.ADDAgentGoldenbeanDTO;
import com.hw.bean.DTO.ModifyAgentGoldenbeanDTO;
import com.hw.bean.PO.AgentGoldenbeanPO;
import com.hw.bean.VO.AgentGoldenbeanInfoVO;
import com.hw.bean.VO.AgentGoldenbeanVO;
import com.hw.services.AgentGoldenbeanInfoService;
import com.hw.services.AgentGoldenbeanService;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
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
 * @create: 2019-05-20 15:31
 * @description: 系统管理 代理商上下分管理
 **/

@Api(value = "[oss] 系统管理 - 代理商管理",description = "代理商上下分管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/agentBean")
@Slf4j
public class SysAgentBeanController implements Serializable {
    private static final long serialVersionUID = 7751333558127203046L;

    @Autowired
    private AgentGoldenbeanService agentGoldenbeanService;

    @Autowired
    private AgentGoldenbeanInfoService agentGoldenbeanInfoService;

    @ApiOperation(value = "平台给代理商上分")
    @PostMapping(value = "upGoldenBean")
    public BaseResultDTO upAgentGoldenBean(@RequestBody @Validated @ModelAttribute(value = "")ADDAgentGoldenbeanDTO addAgentGoldenbeanDTO){
        AgentGoldenbeanPO agentGoldenbeanPO = PropertiesCopyUtil.copyProperties(addAgentGoldenbeanDTO, AgentGoldenbeanPO.class);
        return agentGoldenbeanService.upAgentGoldenBean(agentGoldenbeanPO);
    }

    @ApiOperation(value = "平台给代理商上分")
    @PostMapping(value = "downGoldenBean")
    public BaseResultDTO downAgentGoldenBean(@RequestBody @Validated @ModelAttribute(value = "")ModifyAgentGoldenbeanDTO modifyAgentGoldenbeanDTO){
        AgentGoldenbeanPO agentGoldenbeanPO = PropertiesCopyUtil.copyProperties(modifyAgentGoldenbeanDTO,AgentGoldenbeanPO.class);
        return agentGoldenbeanService.downAgentGoldenBean(agentGoldenbeanPO);
    }

    @ApiOperation(value = "读取代理商金豆记录明细")
    @PostMapping(value = "getAgentGoldenBean")
    public BatchResultDTO<AgentGoldenbeanVO> getAgentGoldenBean(@RequestBody @Validated @ModelAttribute(value = "")QueryAgentGoldenbeanPage queryAgentGoldenbeanPage){
        return agentGoldenbeanService.getAgentGoldenbeanList(queryAgentGoldenbeanPage);
    }

    @ApiOperation(value = "查询代理商金豆明细记录(分页)")
    @PostMapping(value = "getAgentGoldenBeanInfo")
    public BatchResultDTO<AgentGoldenbeanInfoVO> getAgentGoldenBeanInfoPage(@RequestBody @Validated @ModelAttribute(value = "")QueryAgentGoldenbeanInfoPage queryAgentGoldenbeanInfoPage){
        return agentGoldenbeanInfoService.getAgentGoldenbeanInfoList(queryAgentGoldenbeanInfoPage);
    }

}
