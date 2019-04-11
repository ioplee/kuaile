package com.hw.utils;/**
 * Created by robin on 2019/3/5.
 */

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author: Robin
 * @create: 2019-03-05 13:38
 * @description: 查询基础BEAN
 **/


public class BaseQuery implements Serializable{
    private static final long serialVersionUID = -1208011493812303177L;

    @ApiModelProperty(value = "每页记录数")
    private int pageSize = 20;
    @ApiModelProperty(value = "当前页数")
    private int pageNo = 1;
    @ApiModelProperty(value = "总记录数")
    private int record;

    @ApiModelProperty(value = "是否分页 true分页,false 不分页")
    private boolean isPage;

    public int getPageSize() {
        if (pageSize < 0) return 10;// 默认一页10个
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        if (pageNo < 1) {
            return 1;
        }
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageIndex() {
        return (getPageNo() - 1) * getPageSize();
    }

    public int getRecord() {
        if (record < 0) {
            return 0;
        }
        return record;
    }

    /**
     * 设置总记录数
     */
    public void setRecord(int record) {
        this.record = record;
    }

    /**
     * 获取总页数
     */
    public int getTotalPages() {
        // 如果pageSize=0 json转该对象在次会出现除0bug,所以=0时直接返回无穷大
        if (getPageSize() == 0) return Integer.MAX_VALUE;
        if (record % getPageSize() == 0) {
            return record / getPageSize();
        } else {
            return record / getPageSize() + 1;
        }
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean isPage) {
        this.isPage = isPage;
    }
}
