package com.hw.web.server.goldBean;/**
 * Created by robin on 2019/5/31.
 */

import com.hw.bean.BO.QueryAgentGBCondtion;
import com.hw.bean.BO.QueryAgentInfoPage;
import com.hw.bean.BO.QueryMemberInfoPage;
import com.hw.bean.BO.QueryPlayerGBCondition;
import com.hw.bean.VO.AgentGoldenBeanShowVO;
import com.hw.bean.VO.AgentGoldenbeanInfoShowVO;
import com.hw.bean.VO.PlayerGoldenBeanInfoShowVO;
import com.hw.bean.VO.PlayerGoldenBeanShowVO;
import com.hw.services.AgentGoldenbeanInfoService;
import com.hw.services.AgentInfoService;
import com.hw.services.MemberGoldenbeanInfoService;
import com.hw.services.MemberInfoService;
import com.hw.utils.BatchResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author: Robin
 * @create: 2019-05-31 10:00
 * @description: 平台 金豆查询 Controller
 **/

@Api(value = "[oss] 系统管理 - 金豆明细记录")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/goldenBean")
@Slf4j
public class PlamGoldBeanController implements Serializable {
    private static final long serialVersionUID = -8672431304018436709L;

    @Autowired
    private AgentInfoService agentInfoService;

    @Autowired
    private MemberInfoService memberInfoService;

    @Autowired
    private AgentGoldenbeanInfoService agentGoldenbeanInfoService;

    @Autowired
    private MemberGoldenbeanInfoService memberGoldenbeanInfoService;

    @ApiOperation(value = "代理商列表")
    @PostMapping(value = "agentPage")
    public BatchResultDTO<AgentGoldenBeanShowVO> agentPage(@RequestBody @Validated @ModelAttribute(value = "")QueryAgentInfoPage queryAgentInfoPage){
        BatchResultDTO<AgentGoldenBeanShowVO> resultDTO = new BatchResultDTO<AgentGoldenBeanShowVO>();
        try {
            resultDTO = agentInfoService.getAgentInfoListForGoldBean(queryAgentInfoPage);
        }catch (Exception e){
            log.error("#PlamGoldBeanController called agentPage error#",e);
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
        }
        return resultDTO;
    }

    @ApiOperation(value = "玩家列表")
    @PostMapping(value = "playerPage")
    public BatchResultDTO<PlayerGoldenBeanShowVO> playerList(@RequestBody @Validated @ModelAttribute(value = "")QueryMemberInfoPage queryMemberInfoPage){
        BatchResultDTO<PlayerGoldenBeanShowVO> resultDTO = new BatchResultDTO<PlayerGoldenBeanShowVO>();
        try {
            resultDTO = memberInfoService.getPlayerPage(queryMemberInfoPage);
        }catch (Exception e){
            log.error("#PlamGoldBeanController called agentPage error#",e);
            resultDTO.setModule(new ArrayList<>());
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
        }
        return resultDTO;
    }


    @ApiOperation(value = "代理商金豆明细按条件查询")
    @PostMapping(value = "agentGBByCondition")
    public BatchResultDTO<AgentGoldenbeanInfoShowVO> getAgentGoldenBeanInfoPageByCondiiton(@RequestBody @Validated @ModelAttribute(value = "")QueryAgentGBCondtion queryAgentGBCondtion){
        return agentGoldenbeanInfoService.getAgentGoldenbeanByCondition(queryAgentGBCondtion);
    }


    @ApiOperation(value = "玩家金豆明细按条件查询")
    @PostMapping(value = "playerGBByCondition")
    public BatchResultDTO<PlayerGoldenBeanInfoShowVO> getPlayerGBByCondition(@RequestBody @Validated @ModelAttribute(value = "")QueryPlayerGBCondition queryPlayerGBCondition){
        return memberGoldenbeanInfoService.getPlayerGBByCondition(queryPlayerGBCondition);
    }
}
