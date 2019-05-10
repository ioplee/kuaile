package com.hw.web.server.sys;/**
 * Created by robin on 2019/5/10.
 */

import com.hw.bean.BO.QuerySysUserByPrimaryKey;
import com.hw.bean.BO.QuerySysUserPage;
import com.hw.bean.DTO.ADDSysUserDTO;
import com.hw.bean.DTO.ModifySysUserDTO;
import com.hw.bean.PO.SysUserPO;
import com.hw.bean.VO.SysUserVO;
import com.hw.services.SysUserService;
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
 * @create: 2019-05-10 11:43
 * @description: 运营平台 系统权限管理 用户管理
 **/

@Api(value = "[oss] 系统管理 - 权限管理",description = "用户管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/user")
@Slf4j
public class SysUserController implements Serializable{
    private static final long serialVersionUID = -8035766097477565821L;

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "添加用户")
    @PostMapping(value = "add")
    public BaseResultDTO addUser(@RequestBody @Validated @ModelAttribute(value = "")ADDSysUserDTO addSysUserDTO){
        SysUserPO sysUserPO = PropertiesCopyUtil.copyProperties(addSysUserDTO,SysUserPO.class);
        return sysUserService.addSysUser(sysUserPO);
    }

    @ApiOperation(value = "修改菜单")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyUser(@RequestBody @Validated @ModelAttribute(value = "")ModifySysUserDTO modifySysUserDTO){
        SysUserPO sysUserPO = PropertiesCopyUtil.copyProperties(modifySysUserDTO,SysUserPO.class);
        return sysUserService.modifySysUser(sysUserPO);
    }

    @ApiOperation(value = "查询用户信息")
    @PostMapping(value = "getUserInfo")
    public ResultDTO<SysUserVO> getUserInfo(@RequestBody @Validated @ModelAttribute(value = "")QuerySysUserByPrimaryKey querySysUserByPrimaryKey){
        return sysUserService.getsysUser(querySysUserByPrimaryKey);
    }

    @ApiOperation(value = "查询用户列表")
    @PostMapping(value = "getUserPage")
    public BatchResultDTO<SysUserVO> getUserPage(@RequestBody @Validated @ModelAttribute(value = "")QuerySysUserPage querySysUserPage){
        return sysUserService.getSysUserList(querySysUserPage);
    }
}
