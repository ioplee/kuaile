package com.hw.biz.dao.provider;

import com.hw.biz.model.UserDomain;
import com.hw.biz.model.UserDO;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * 动态sql查询范例
 */
public class UserDynaSqlProvider {
    public String selectWhitParamSql(Map<String, Object> param) {
        return new SQL() {
            {
                SELECT("*");
                FROM("T_USER");
                if (param.get("id")!=null) {
                    WHERE("id=#{id}");
                }
                if(param.get("password")!=null) {
                    WHERE("password=#{password}");
                }
                if(param.get("name")!=null) {
                    WHERE("name=#{name}");
                }

                if(param.get("phone")!=null) {
                    WHERE("phone=#{phone}");
                }
            }

        }.toString();
    }

    public String selectWhitUserSql(UserDomain user) {
        return new SQL() {
            {
                SELECT("*");
                FROM("T_USER");
                if (user.getId()!=null) {
                    WHERE("id=#{id}");
                }
                if(user.getPassword()!=null) {
                    WHERE("password=#{password}");
                }
                if(user.getName()!=null) {
                    WHERE("name=#{name}");
                }

                if(user.getPhone()!=null) {
                    WHERE("phone=#{phone}");
                }
            }

        }.toString();
    }

    public String updateUserSql(UserDO userDO) {
        return new SQL() {
            {
                UPDATE("hw_user");
                if(null != userDO.getNick()) {
                    SET("nick=#{nick}");
                }
                if(null != userDO.getPassword()) {
                    SET("password=#{password}");
                }
                if(null != userDO.getPhone()) {
                    SET("phone=#{phone}");
                }
                if(null != userDO.getQq()) {
                    SET("qq=#{qq}");
                }
                if(null != userDO.getEmail()) {
                    SET("email=#{email}");
                }
                if(null != userDO.getName()) {
                    SET("name=#{name}");
                }
                if(null != userDO.getType()) {
                    SET("type=#{type}");
                }
                if(null != userDO.getHeadImage()) {
                    SET("head_image=#{headImage}");
                }
                if(null != userDO.getSecretPassword()) {
                    SET("secret_password=#{secretPassword}");
                }
                if(null != userDO.getWeixinNick()) {
                    SET("weixin_nick=#{weixinNick}");
                }
                if(null != userDO.getWeixinOpenId()) {
                    SET("weixin_open_id=#{weixinOpenId}");
                }
                if(null != userDO.getStatus()) {
                    SET("status=#{status}");
                }
                SET("gmt_modify=now()");
                WHERE("id=#{id}");
            }
        }.toString();
    }

}
