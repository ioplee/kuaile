package com.hw.biz.dao.provider;

import com.hw.biz.model.UserDomain;
import com.hw.biz.model.UserDO;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * User动态sql查询
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
                if(null != userDO.getEmail()) {
                    SET("email=#{email}");
                }
                if(null != userDO.getQq()) {
                    SET("qq=#{qq}");
                }
                if(null != userDO.getSecretPassword()) {
                    SET("secret_password=#{secretPassword}");
                }
                if(null != userDO.getAlipayId()) {
                    SET("alipay_id=#{alipayId}");
                }
                if(null != userDO.getWeixinOpenId()) {
                    SET("weixin_open_id=#{weixinOpenId}");
                }
                if(null != userDO.getWeixinNick()) {
                    SET("weixin_nick=#{weixinNick}");
                }
                if(null != userDO.getHeadImageUrl()) {
                    SET("head_image_url=#{headImageUrl}");
                }
                if(null != userDO.getType()) {
                    SET("type=#{type}");
                }
                if(null != userDO.getCaiPiaoFanDian()) {
                    SET("cai_piao_fan_dian=#{caiPiaoFanDian}");
                }
                if(null != userDO.getPeiLv()) {
                    SET("pei_lv=#{peiLv}");
                }
                if(null != userDO.getFatherId()) {
                    SET("father_id=#{fatherId}");
                }
                if(null != userDO.getStatus()) {
                    SET("status=#{status}");
                }
                SET("gmt_modify=now()");
                if(null != userDO.getBack()) {
                    SET("back=#{back}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }

}
