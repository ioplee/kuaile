package com.hw.biz.dao.provider;

import com.hw.biz.model.BusinessCooperationDO;
import org.apache.ibatis.jdbc.SQL;

public class BizCoopDynaSqlProvider {

    public String updateBizCoopSql(BusinessCooperationDO bizCoopDO) {
        return new SQL() {
            {
                UPDATE("hw_business_cooperation");
                if(null != bizCoopDO.getName()) {
                    SET("name=#{name}");
                }
                if(null != bizCoopDO.getQq()) {
                    SET("qq=#{qq}");
                }
                if(null != bizCoopDO.getRank()) {
                    SET("rank=#{rank}");
                }
                if(null != bizCoopDO.getStatus()) {
                    SET("status=#{status}");
                }
                if(null != bizCoopDO.getType()) {
                    SET("type=#{type}");
                }
                SET("gmt_modify=now()");
                WHERE("id=#{id}");
            }
        }.toString();
    }

}
