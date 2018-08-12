package com.hw.biz.dao;

import com.hw.biz.dao.provider.UserDynaSqlProvider;
import com.hw.biz.model.UserDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDAO {

    /**
     * 通过手机号码与密码查询用户信息
     * @param phone
     * @param password
     * @return
     */
    @Results({
            @Result(property = "secretPassword", column = "secret_password"),
            @Result(property = "weixinOpenId", column = "weixin_open_id"),
            @Result(property = "weixinNick", column = "weixin_nick"),
            @Result(property = "headImage", column = "head_image"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_user WHERE phone = #{phone} AND password = #{password}")
    UserDO findUserByPhoneAndPassword(@Param("phone") String phone, @Param("password") String password);

    @Insert("INSERT INTO hw_user(nick, password, phone, status, type, gmt_create, gmt_modify) VALUES(#{nick}, #{password}, #{phone}, #{status}, #{type}, now(), now())")
    int insert(UserDO userDO);

    /**
     * 通过用户id查询用户信息
     * @param id
     * @return
     */
    @Results({
            @Result(property = "secretPassword", column = "secret_password"),
            @Result(property = "weixinOpenId", column = "weixin_open_id"),
            @Result(property = "weixinNick", column = "weixin_nick"),
            @Result(property = "headImage", column = "head_image"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_user WHERE id = #{id}")
    UserDO findUserById(@Param("id") Long id);

    @UpdateProvider(type=UserDynaSqlProvider.class,method="updateUserSql")
    int update(UserDO userDO);

    @Update("UPDATE hw_user SET status=-1, gmt_modify=now() WHERE id=#{id}")
    int delete(@Param("id") Long id);

    /**
     * 根据父节点ID查询孩子用户信息
     * @param fatherId
     * @return
     */
    @Results({
            @Result(property = "secretPassword", column = "secret_password"),
            @Result(property = "weixinOpenId", column = "weixin_open_id"),
            @Result(property = "weixinNick", column = "weixin_nick"),
            @Result(property = "headImage", column = "head_image"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_user WHERE father_id = #{fatherId}")
    List<UserDO> findChildrenByUserId(@Param("fatherId") Long fatherId);

}
