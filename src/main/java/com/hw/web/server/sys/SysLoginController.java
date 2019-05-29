package com.hw.web.server.sys;/**
 * Created by robin on 2019/5/28.
 */

import com.hw.bean.DTO.PlamLoginDTO;
import com.hw.bean.PO.SysUserPO;
import com.hw.bean.VO.SysUserVO;
import com.hw.services.SysUserService;
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
 * @create: 2019-05-28 16:07
 * @description: 平台用户登录
 **/

@Api(value = "[oss] 系统管理 - 平台用户登录")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/")
@Slf4j
public class SysLoginController implements Serializable {
    private static final long serialVersionUID = 7030573314317566719L;

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "平台用户登录")
    @PostMapping(value = "login")
    public ResultDTO<SysUserVO> plamLogin(@RequestBody @Validated @ModelAttribute(value = "")PlamLoginDTO plamLoginDTO){
        SysUserPO sysUserPO = PropertiesCopyUtil.copyProperties(plamLoginDTO,SysUserPO.class);
        return sysUserService.sysLogin(sysUserPO);
    }
}
