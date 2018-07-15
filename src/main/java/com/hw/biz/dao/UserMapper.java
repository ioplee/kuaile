package com.hw.biz.dao;

import com.github.pagehelper.Page;
import com.hw.biz.dao.provider.UserDynaSqlProvider;
import com.hw.biz.model.UserDomain;
import org.apache.ibatis.annotations.*;

import java.util.Map;

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
     * 动态组装查询方法名不能跟其他任何查询方法名(包括其他动态组装参数)重复。
     * @param param 参数集合
     * @return 返回分页的数据
     */
    @SelectProvider(type=UserDynaSqlProvider.class,method="selectWhitParamSql")
    Page<UserDomain> findSameByPage(Map<String, String> param) ;

    @SelectProvider(type=UserDynaSqlProvider.class,method="selectWhitUserSql")
    Page<UserDomain> findUserByPage(UserDomain user) ;

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
