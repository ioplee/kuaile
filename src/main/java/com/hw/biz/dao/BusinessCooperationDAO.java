package com.hw.biz.dao;

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

}
