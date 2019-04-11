package com.hw.web.client;/**
 * Created by robin on 2019/4/11.
 */

import com.hw.bean.BO.QueryTUserPageBO;
import com.hw.bean.DTO.AddTuserDTO;
import com.hw.bean.DTO.ModifyTUserDTO;
import com.hw.bean.DTO.SetTUserStatusDTO;
import com.hw.bean.PO.TUserPO;
import com.hw.bean.VO.TUserVO;
import com.hw.services.client.TUserService;
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
 * @create: 2019-04-11 12:57
 * @description: 客户端 测试用户 controller
 **/

@Api(value = "[client - V1.0] 权限管理",description = "测试用户管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "client/tuser")
@Slf4j
public class TUserController implements Serializable {
    private static final long serialVersionUID = 448345908541062039L;

    @Autowired
    private TUserService tUserService;

    @ApiOperation(value = "添加测试用户信息")
    @PostMapping(value = "add")
    public BaseResultDTO addTUser(@RequestBody @Validated @ModelAttribute(value = "")AddTuserDTO addTuserDTO){
        TUserPO tUserPO = PropertiesCopyUtil.copyProperties(addTuserDTO,TUserPO.class);
        return  tUserService.addTUser(tUserPO);
    }

    @ApiOperation(value = "修改测试用户信息")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyTUser(@RequestBody @Validated @ModelAttribute(value = "")ModifyTUserDTO modifyTUserDTO){
        TUserPO tUserPO = PropertiesCopyUtil.copyProperties(modifyTUserDTO,TUserPO.class);
        return  tUserService.modifyTUser(tUserPO);
    }

    @ApiOperation(value = "修改测试用户信息")
    @PostMapping(value = "setStatus")
    public BaseResultDTO setTUserStatus(@RequestBody @Validated @ModelAttribute(value = "")SetTUserStatusDTO setTUserStatusDTO){
        TUserPO tUserPO = PropertiesCopyUtil.copyProperties(setTUserStatusDTO,TUserPO.class);
        return  tUserService.setTUserStatus(tUserPO);
    }

    @ApiOperation(value = "获取测试用户信息")
    @PostMapping(value = "getPage")
    public BatchResultDTO<TUserVO> getTUserPage(@RequestBody @Validated @ModelAttribute(value = "")QueryTUserPageBO queryTUserPageBO){
        return tUserService.getTUserPage(queryTUserPageBO);
    }
}
