package com.hw.biz.dao;

import com.hw.biz.model.TargetDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TypeTargetDAO {

    /**
     * 通过彩票类型ID查询投注项列表
     * @param typeId
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "targetName", column = "target_name"),
            @Result(property = "theoreticalOdds", column = "theoretical_odds"),
            @Result(property = "status", column = "status"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT hw_target.id id, hw_target.target_name target_name, hw_type_target.theoretical_odds theoretical_odds, hw_target.status status, hw_target.gmt_modify gmt_modify, hw_target.gmt_create gmt_create " +
            " FROM hw_type_target, hw_target WHERE hw_type_target.type_id = #{typeId} AND hw_type_target.target_id = hw_target.id AND hw_type_target.status <> -1 AND hw_target.status <> -1")
    List<TargetDO> findTargetListByTypeId(@Param("typeId") Long typeId);

}
