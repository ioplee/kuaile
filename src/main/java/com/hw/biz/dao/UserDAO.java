package com.hw.biz.dao;

import com.hw.biz.dao.provider.UserDynaSqlProvider;
import com.hw.biz.model.UserDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDAO {

    /**
     * 通过用户名与密码查询用户信息
     * @param nick
     * @param password
     * @return
     */
    @Results({
            @Result(property = "uuid", column = "uuid"),
            @Result(property = "nick", column = "nick"),
            @Result(property = "password", column = "password"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "qq", column = "qq"),
            @Result(property = "secretPassword", column = "secret_password"),
            @Result(property = "alipayId", column = "alipay_id"),
            @Result(property = "weixinOpenId", column = "weixin_open_id"),
            @Result(property = "weixinNick", column = "weixin_nick"),
            @Result(property = "headImageUrl", column = "head_image_url"),
            @Result(property = "type", column = "type"),
            @Result(property = "caiPiaoFanDian", column = "cai_piao_fan_dian"),
            @Result(property = "peiLv", column = "pei_lv"),
            @Result(property = "fatherId", column = "father_id"),
            @Result(property = "status", column = "status"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "back", column = "back")
    })
    @Select("SELECT * FROM hw_user WHERE nick = #{nick} AND password = #{password}")
    UserDO findUserByNickAndPassword(@Param("nick") String nick, @Param("password") String password);

    @Insert("INSERT INTO hw_user(uuid, nick, password, phone, email, qq, secret_password, alipay_id, weixin_open_id," +
            " weixin_nick, head_image_url, type, cai_piao_fan_dian, pei_lv, father_id, status, gmt_create," +
            " gmt_modify, back) VALUES( #{uuid}, #{nick}, #{password}, #{phone}, #{email}, #{qq}, #{secretPassword}," +
            " #{alipayId}, #{weixinOpenId}, #{weixinNick}, #{headImageUrl}, #{type}, #{caiPiaoFanDian}, #{peiLv}," +
            " #{fatherId}, #{status}, now(), now(), #{back})")
    int insert(UserDO userDO);

    /**
     * 通过用户id查询用户信息
     * @param id
     * @return
     */
    @Results({
            @Result(property = "uuid", column = "uuid"),
            @Result(property = "nick", column = "nick"),
            @Result(property = "password", column = "password"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "qq", column = "qq"),
            @Result(property = "secretPassword", column = "secret_password"),
            @Result(property = "alipayId", column = "alipay_id"),
            @Result(property = "weixinOpenId", column = "weixin_open_id"),
            @Result(property = "weixinNick", column = "weixin_nick"),
            @Result(property = "headImageUrl", column = "head_image_url"),
            @Result(property = "type", column = "type"),
            @Result(property = "caiPiaoFanDian", column = "cai_piao_fan_dian"),
            @Result(property = "peiLv", column = "pei_lv"),
            @Result(property = "fatherId", column = "father_id"),
            @Result(property = "status", column = "status"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "back", column = "back")
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
            @Result(property = "uuid", column = "uuid"),
            @Result(property = "nick", column = "nick"),
            @Result(property = "password", column = "password"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "qq", column = "qq"),
            @Result(property = "secretPassword", column = "secret_password"),
            @Result(property = "alipayId", column = "alipay_id"),
            @Result(property = "weixinOpenId", column = "weixin_open_id"),
            @Result(property = "weixinNick", column = "weixin_nick"),
            @Result(property = "headImageUrl", column = "head_image_url"),
            @Result(property = "type", column = "type"),
            @Result(property = "caiPiaoFanDian", column = "cai_piao_fan_dian"),
            @Result(property = "peiLv", column = "pei_lv"),
            @Result(property = "fatherId", column = "father_id"),
            @Result(property = "status", column = "status"),
            @Result(property = "gmtCreate", column = "gmt_create"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "back", column = "back")
    })
    @Select("SELECT * FROM hw_user WHERE father_id = #{fatherId}")
    List<UserDO> findChildrenByUserId(@Param("fatherId") Long fatherId);

}
