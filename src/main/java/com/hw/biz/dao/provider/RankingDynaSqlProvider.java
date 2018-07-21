package com.hw.biz.dao.provider;

import com.hw.biz.model.RankingDO;
import org.apache.ibatis.jdbc.SQL;

public class RankingDynaSqlProvider {

    public String updateRankingSql(RankingDO rankingDO) {
        return new SQL() {
            {
                UPDATE("hw_ranking");
                if(null != rankingDO.getNick()) {
                    SET("nick=#{nick}");
                }
                if(null != rankingDO.getJindou()) {
                    SET("jindou=#{jindou}");
                }
                if(null != rankingDO.getRank()) {
                    SET("rank=#{rank}");
                }
                if(null != rankingDO.getReward()) {
                    SET("reward=#{reward}");
                }
                if(null != rankingDO.getType()) {
                    SET("type=#{type}");
                }
                if(null != rankingDO.getStatus()) {
                    SET("status=#{status}");
                }
                SET("gmt_modify=now()");
                WHERE("id=#{id}");
            }
        }.toString();
    }

}
