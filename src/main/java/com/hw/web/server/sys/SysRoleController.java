package com.hw.web.server.sys;/**
 * Created by robin on 2019/5/10.
 */

import com.hw.bean.BO.QuerySysRoleByPrimaryKey;
import com.hw.bean.BO.QuerySysRolePage;
import com.hw.bean.DTO.ADDSysRoleDTO;
import com.hw.bean.DTO.ModifySysRoleDTO;
import com.hw.bean.PO.SysRolePO;
import com.hw.bean.VO.SysRoleVO;
import com.hw.services.SysRoleService;
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
 * @create: 2019-05-10 11:56
 * @description: 运营平台 系统权限管理 角色管理
 **/

@Api(value = "[oss] 系统管理 - 权限管理",description = "角色管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/role")
@Slf4j
public class SysRoleController implements Serializable {


    private static final long serialVersionUID = -7595908043411169790L;

    @Autowired
    private SysRoleService sysRoleService;

    @ApiOperation(value = "添加角色")
    @PostMapping(value = "add")
    public BaseResultDTO addRole(@RequestBody @Validated @ModelAttribute(value = "")ADDSysRoleDTO addSysRoleDTO){
        SysRolePO sysRolePO = PropertiesCopyUtil.copyProperties(addSysRoleDTO,SysRolePO.class);
        return sysRoleService.addSysRole(sysRolePO);
    }

    @ApiOperation(value = "修改角色")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyRole(@RequestBody @Validated @ModelAttribute(value = "")ModifySysRoleDTO modifySysRoleDTO){
        SysRolePO sysRolePO = PropertiesCopyUtil.copyProperties(modifySysRoleDTO,SysRolePO.class);
        return sysRoleService.modifySysRole(sysRolePO);
    }

    @ApiOperation(value = "查询角色信息")
    @PostMapping(value = "getRoleInfo")
    public ResultDTO<SysRoleVO> getRole(@RequestBody @Validated @ModelAttribute(value = "")QuerySysRoleByPrimaryKey querySysRoleByPrimaryKey){
        return sysRoleService.getsysRole(querySysRoleByPrimaryKey);
    }

    @ApiOperation(value = "查询角色列表")
    @PostMapping(value = "getRolePage")
    public BatchResultDTO<SysRoleVO> getRolePage(@RequestBody @Validated @ModelAttribute(value = "")QuerySysRolePage querySysRolePage){
        return sysRoleService.getSysRoleList(querySysRolePage);
    }




}
