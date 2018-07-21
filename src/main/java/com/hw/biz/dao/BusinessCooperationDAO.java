package com.hw.biz.dao;

import com.hw.biz.dao.provider.BizCoopDynaSqlProvider;
import com.hw.biz.model.BusinessCooperationDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BusinessCooperationDAO {

    @Results({
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_business_cooperation WHERE status = 1")
    List<BusinessCooperationDO> findAllBusinessCooperation();

    @Insert("INSERT INTO hw_business_cooperation(name, qq, rank, type, status, gmt_modify, gmt_create) VALUES(#{name}, #{qq}, #{rank}, #{type}, #{status}, now(), now())")
    int insert(BusinessCooperationDO businessCooperationDO);

    @Update("UPDATE hw_business_cooperation SET status=-1, gmt_modify=now() WHERE id=#{id}")
    int delete(@Param("id") Long id);

    @UpdateProvider(type=BizCoopDynaSqlProvider.class,method="updateBizCoopSql")
    int update(BusinessCooperationDO businessCooperationDO);

    @Results({
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_business_cooperation WHERE id = #{id}")
    BusinessCooperationDO findBizCoopById(@Param("id") Long id);

}
