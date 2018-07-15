package com.hw.biz.dao;

import com.github.pagehelper.Page;
import com.hw.biz.model.UserDomain;
import org.apache.ibatis.annotations.*;

/**
 * 例子:User映射类
 * Created by Administrator on 2017/11/24.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM T_USER WHERE PHONE = #{phone}")
    UserDomain findUserByPhone(@Param("phone") String phone);

    @Select("SELECT * FROM T_USER")
    Page<UserDomain> findAllByPage() ;

    /**
     * 这里把id带上了，ID如果是自增的话，就不需要加上ID
     * @param user 用户对象
     * @return 影响行数
     */
    @Insert("INSERT INTO T_USER(ID, NAME, PASSWORD, PHONE) VALUES(#{id},#{name}, #{password}, #{phone})")
    int insert(UserDomain user);

    @Delete("DELETE FROM T_USER WHERE ID = #{id}")
    int delete(UserDomain user) ;
}
