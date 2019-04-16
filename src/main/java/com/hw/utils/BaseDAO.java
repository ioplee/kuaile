package com.hw.utils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by robin on 2019/4/15.
 * DAO 基类
 *
 * @param <Model>    the type parameter     PO数据实体对象
 * @param <PK>       the type parameter     主键ID
 * @param <Query>    the type parameter     查询及条件属性BO
 * @param <ListVO>   the type parameter     列表展示VO
 * @param <SingleVO> the type parameter     详情展示VO
 */
public interface BaseDAO<Model, PK extends Serializable, Query, ListVO, SingleVO> {

    /**
     * Insert integer.
     *
     * @param record the record
     * @return the integer
     */
    public Integer insert(Model record);

    /**
     * Select by primary key model.
     *
     * @param id the id
     * @return the model
     */
    public SingleVO selectByPrimaryKey(PK id);

    /**
     * Update by primary key integer.
     *
     * @param record the record
     * @return the integer
     */
    public Integer updateByPrimaryKey(Model record);

    /**
     * Select list list.
     *
     * @param query the query
     * @return the list
     */
    public List<ListVO> selectList(Query query);

    /**
     * Select list count integer.
     *
     * @param query the query
     * @return the integer
     */
    public Integer selectListCount(Query query);

}
