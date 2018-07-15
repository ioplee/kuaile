package com.hw.biz.dao.provider;

import com.hw.biz.model.UserDomain;
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
}
