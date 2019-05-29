package com.hw.services;

import com.hw.bean.BO.QuerySysUserByPrimaryKey;
import com.hw.bean.BO.QuerySysUserPage;
import com.hw.bean.PO.SysUserPO;
import com.hw.bean.VO.SysUserVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

/**
 * The interface Sys user service.
 *
 * @author: Robin
 * @create: 2019 -05-10 11:11:36
 * @description: 系统用户表 Service 接口
 */
public interface SysUserService {

    /**
     * Add 系统用户表 dto.
     *
     * @param sysUserPO 系统用户表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO addSysUser(SysUserPO sysUserPO);

    /**
     * Modify 系统用户表 dto.
     *
     * @param sysUserPO 系统用户表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO modifySysUser(SysUserPO sysUserPO);

    /**
     * Gets SysUser info.
     *
     * @param querySysUserByPrimaryKey the query SysUser bean by primary key
     * @return the info
     */
    public ResultDTO<SysUserVO> getsysUser(QuerySysUserByPrimaryKey querySysUserByPrimaryKey);

    /**
     * Gets SysUser list.
     *
     * @param querySysUserPage the query bean for page
     * @return the agent info list
     */
    public BatchResultDTO<SysUserVO> getSysUserList(QuerySysUserPage querySysUserPage);

    /**
     * Sys login result dto.    用户登录
     *
     * @param sysUserPO the sys user po
     * @return the result dto
     */
    public ResultDTO<SysUserVO> sysLogin(SysUserPO sysUserPO);
}
