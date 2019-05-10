package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.SysMenuPO;
import com.hw.bean.VO.SysMenuVO;
import com.hw.bean.BO.QuerySysMenuPage;
import com.hw.bean.BO.QuerySysMenuByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:36
* @description: 系统菜单表（系统权限控制在菜单级） Service 接口
**/

public interface SysMenuService {

    /**
    * Add 系统菜单表（系统权限控制在菜单级） dto.
    *
    * @param sysMenuPO  系统菜单表（系统权限控制在菜单级） 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addSysMenu(SysMenuPO sysMenuPO);

    /**
    * Modify 系统菜单表（系统权限控制在菜单级） dto.
    *
    * @param sysMenuPO  系统菜单表（系统权限控制在菜单级） 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifySysMenu(SysMenuPO sysMenuPO);

    /**
    * Gets SysMenu info.
    *
    * @param querySysMenuByPrimaryKey the query SysMenu bean by primary key
    * @return the info
    */
    public ResultDTO<SysMenuVO> getsysMenu(QuerySysMenuByPrimaryKey querySysMenuByPrimaryKey);

    /**
    * Gets SysMenu list.
    *
    * @param querySysMenuPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<SysMenuVO> getSysMenuList(QuerySysMenuPage querySysMenuPage);
}
