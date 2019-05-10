package com.hw.web.server.sys;/**
 * Created by robin on 2019/5/10.
 */

import com.hw.bean.BO.QuerySysMenuByPrimaryKey;
import com.hw.bean.BO.QuerySysMenuPage;
import com.hw.bean.DTO.ADDSysMenuDTO;
import com.hw.bean.DTO.ModifySysMenuDTO;
import com.hw.bean.PO.SysMenuPO;
import com.hw.bean.VO.SysMenuVO;
import com.hw.services.SysMenuService;
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
 * @create: 2019-05-10 11:30
 * @description: 运营平台 系统权限管理 菜单管理
 **/

@Api(value = "[oss] 系统管理 - 权限管理",description = "菜单管理")
@CrossOrigin(origins = "*", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping(value = "oss/sys/menu")
@Slf4j
public class SysMenuController implements Serializable{

    private static final long serialVersionUID = -1004376231226081522L;
    @Autowired
    private SysMenuService sysMenuService;

    @ApiOperation(value = "添加菜单")
    @PostMapping(value = "add")
    public BaseResultDTO addMenu(@RequestBody @Validated @ModelAttribute(value = "")ADDSysMenuDTO addSysMenuDTO){
        SysMenuPO sysMenuPO = PropertiesCopyUtil.copyProperties(addSysMenuDTO,SysMenuPO.class);
        return sysMenuService.addSysMenu(sysMenuPO);
    }

    @ApiOperation(value = "修改菜单")
    @PostMapping(value = "modify")
    public BaseResultDTO modifyMenu(@RequestBody @Validated @ModelAttribute(value = "")ModifySysMenuDTO modifySysMenuDTO){
        SysMenuPO sysMenuPO = PropertiesCopyUtil.copyProperties(modifySysMenuDTO,SysMenuPO.class);
        return sysMenuService.modifySysMenu(sysMenuPO);
    }

    @ApiOperation(value = "查询菜单记录")
    @PostMapping(value = "getMenuInfo")
    public ResultDTO<SysMenuVO> getMenuInfo(@RequestBody @Validated @ModelAttribute(value = "")QuerySysMenuByPrimaryKey querySysMenuByPrimaryKey){
        return sysMenuService.getsysMenu(querySysMenuByPrimaryKey);
    }

    @ApiOperation(value = "查询菜单列表")
    @PostMapping(value = "menuPage")
    public BatchResultDTO<SysMenuVO> getMenuPage(@RequestBody @Validated @ModelAttribute(value = "")QuerySysMenuPage querySysMenuPage){
        return sysMenuService.getSysMenuList(querySysMenuPage);
    }


}
