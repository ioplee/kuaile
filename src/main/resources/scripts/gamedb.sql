/*
 Navicat Premium Data Transfer

 Source Server         : localhost-gamedb
 Source Server Type    : MySQL
 Source Server Version : 50615
 Source Host           : localhost
 Source Database       : gamedb

 Target Server Type    : MySQL
 Target Server Version : 50615
 File Encoding         : utf-8

 Date: 05/28/2019 17:19:49 PM
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `activity_lottery`
-- ----------------------------
DROP TABLE IF EXISTS `activity_lottery`;
CREATE TABLE `activity_lottery` (
  `item_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '奖项ID',
  `item_title` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '奖项名称',
  `item_img_url` varchar(128) COLLATE utf8_bin NOT NULL COMMENT '奖项图片',
  `item_bean_counts` bigint(11) NOT NULL COMMENT '奖项金豆数',
  `item_probability` tinyint(2) NOT NULL COMMENT '中奖几率',
  `item_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='大转盘配置表';

-- ----------------------------
--  Table structure for `activity_lottery_info`
-- ----------------------------
DROP TABLE IF EXISTS `activity_lottery_info`;
CREATE TABLE `activity_lottery_info` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '中奖记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '中奖会员ID',
  `info_time` datetime NOT NULL COMMENT '中奖时间',
  `option_id` bigint(11) NOT NULL COMMENT '中奖奖项ID',
  `bean_counts` bigint(11) NOT NULL COMMENT '中奖金豆',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='大转盘获奖记录表';

-- ----------------------------
--  Table structure for `agent_goldenbean`
-- ----------------------------
DROP TABLE IF EXISTS `agent_goldenbean`;
CREATE TABLE `agent_goldenbean` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `agent_id` bigint(11) NOT NULL COMMENT '代理商ID',
  `bean_counts` bigint(11) NOT NULL COMMENT '金豆数',
  `agent_status` tinyint(1) NOT NULL COMMENT '账户状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='代理商金豆表';

-- ----------------------------
--  Table structure for `agent_goldenbean_info`
-- ----------------------------
DROP TABLE IF EXISTS `agent_goldenbean_info`;
CREATE TABLE `agent_goldenbean_info` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '明细记录ID',
  `agent_id` bigint(11) NOT NULL COMMENT '代理商iD',
  `info_type` tinyint(1) NOT NULL COMMENT '记录类型',
  `bean_counts` bigint(11) NOT NULL COMMENT '金豆数值',
  `biz_id` bigint(11) NOT NULL COMMENT '业务记录ID',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  `base_counts` bigint(11) NOT NULL COMMENT '基础金豆数',
  `rebate_counts` bigint(11) NOT NULL COMMENT '返点金豆数',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='代理商金豆明细表';

-- ----------------------------
--  Table structure for `agent_info`
-- ----------------------------
DROP TABLE IF EXISTS `agent_info`;
CREATE TABLE `agent_info` (
  `agent_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '代理商ID',
  `agent_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '代理商名称',
  `agent_code` int(8) NOT NULL COMMENT '代理商编码',
  `qq` varchar(50) COLLATE utf8_bin NOT NULL COMMENT 'QQ号码',
  `agent_desc` varchar(200) COLLATE utf8_bin NOT NULL COMMENT '商家说明',
  `mobile` varchar(11) COLLATE utf8_bin NOT NULL COMMENT '手机号码',
  `agent_status` tinyint(1) NOT NULL COMMENT '商家状态',
  `creator` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `recharge_point` tinyint(2) NOT NULL COMMENT '充值返点',
  `cash_point` tinyint(2) NOT NULL COMMENT '提现返点',
  `register_date` datetime NOT NULL COMMENT '入住平台日期',
  `agent_account` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '登录账户',
  `agent_password` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '登录密码',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`agent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='代理商信息表';

-- ----------------------------
--  Records of `agent_info`
-- ----------------------------
BEGIN;
INSERT INTO `agent_info` VALUES ('1', '1', '1', '1', '1', '1', '1', '-1', '1', '1', '2019-10-30 11:11:11', 'asf', 'd68f6095c3e6d78a3ed9d01218e0040f', '2019-05-14 17:08:06', '2019-05-14 17:36:36'), ('2', '代理商1', '10001', '123123123', '测试代理商', '1313131313', '1', '10001', '2', '0', '2019-10-12 23:23:23', 'try111', '123456', '2019-05-14 17:30:49', '2019-05-14 17:30:49'), ('3', '代理商1', '10002', '123123123', '测试代理商', '1313131313', '1', '10001', '2', '0', '2019-10-12 23:23:23', 'try11123', 'a448410bdcbb4d7cfb32830909f6aa08', '2019-05-14 17:31:49', '2019-05-14 17:31:49');
COMMIT;

-- ----------------------------
--  Table structure for `base_banner`
-- ----------------------------
DROP TABLE IF EXISTS `base_banner`;
CREATE TABLE `base_banner` (
  `banner_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '图片ID',
  `banner_url` varchar(128) COLLATE utf8_bin NOT NULL COMMENT '图片地址',
  `banner_links` varchar(128) COLLATE utf8_bin NOT NULL COMMENT '图片链接配置',
  `banner_index` tinyint(2) NOT NULL COMMENT '图片排序位',
  `banner_status` tinyint(1) NOT NULL COMMENT '图片状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='banner广告图';

-- ----------------------------
--  Table structure for `base_lottery_info`
-- ----------------------------
DROP TABLE IF EXISTS `base_lottery_info`;
CREATE TABLE `base_lottery_info` (
  `lottery_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '福利ID',
  `lottery_title` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '福利标题',
  `lottery_content` text COLLATE utf8_bin NOT NULL COMMENT '福利内容',
  `begin_date` date NOT NULL COMMENT '活动开始日期',
  `end_date` date NOT NULL COMMENT '活动结束日期',
  `img_url` varchar(128) COLLATE utf8_bin NOT NULL COMMENT '活动宣传图片地址',
  `target_member` tinyint(1) NOT NULL COMMENT '活动参与对象',
  `lottery_status` tinyint(1) NOT NULL COMMENT '活动状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`lottery_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='玩家福利列表';

-- ----------------------------
--  Table structure for `base_news`
-- ----------------------------
DROP TABLE IF EXISTS `base_news`;
CREATE TABLE `base_news` (
  `news_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '新闻ID',
  `news_title` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '新闻标题',
  `news_date` datetime NOT NULL COMMENT '新闻时间',
  `news_content` varchar(2000) COLLATE utf8_bin NOT NULL COMMENT '新闻内容',
  `news_status` tinyint(1) NOT NULL COMMENT '新闻状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='新闻公告表';

-- ----------------------------
--  Records of `base_news`
-- ----------------------------
BEGIN;
INSERT INTO `base_news` VALUES ('1', '??1', '2019-05-25 11:11:11', '????????????', '1', '2019-05-27 12:22:46', '2019-05-27 12:22:46');
COMMIT;

-- ----------------------------
--  Table structure for `game_data_source`
-- ----------------------------
DROP TABLE IF EXISTS `game_data_source`;
CREATE TABLE `game_data_source` (
  `source_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '数据源ID',
  `source_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '数据源名称',
  `source_desc` varchar(1000) COLLATE utf8_bin DEFAULT NULL COMMENT '数据源描述',
  `source_step_time` int(4) NOT NULL COMMENT '数据源刷新数据周期，每期开奖时间间隔',
  `source_start_time` datetime NOT NULL COMMENT '每天开始时间',
  `source_end_time` datetime NOT NULL COMMENT '每天结束时间',
  `source_status` tinyint(1) NOT NULL COMMENT '数据源状态-1删除 0停用 1有效',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`source_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏数据源表';

-- ----------------------------
--  Table structure for `game_info`
-- ----------------------------
DROP TABLE IF EXISTS `game_info`;
CREATE TABLE `game_info` (
  `game_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '游戏ID',
  `game_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '游戏名称',
  `game_help` varchar(2000) COLLATE utf8_bin NOT NULL COMMENT '游戏帮助',
  `game_time` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '游戏时间',
  `game_step` int(8) NOT NULL COMMENT '游戏每期时间间隔',
  `game_count` int(8) NOT NULL COMMENT '游戏共多少期',
  `game_begin_time` datetime NOT NULL COMMENT '游戏每日开始时间',
  `game_edn_time` datetime NOT NULL COMMENT '游戏每日结束时间',
  `game_bet_min` bigint(11) NOT NULL COMMENT '投注范围开始',
  `game_bet_max` bigint(11) NOT NULL COMMENT '投注范围结束',
  `game_winner_amount` bigint(11) NOT NULL COMMENT '最高中奖额',
  `game_status` tinyint(1) NOT NULL COMMENT '游戏状态',
  `game_type_id` bigint(11) NOT NULL COMMENT '游戏类型ID',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`game_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏信息表';

-- ----------------------------
--  Table structure for `game_info_options`
-- ----------------------------
DROP TABLE IF EXISTS `game_info_options`;
CREATE TABLE `game_info_options` (
  `option_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '选项ID',
  `option_title` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '选项标题',
  `option_value` int(2) NOT NULL COMMENT '选项值',
  `option_odds` int(8) NOT NULL COMMENT '标准赔率',
  `option_status` tinyint(1) NOT NULL COMMENT '选项状态',
  `游戏ID` bigint(11) NOT NULL COMMENT '游戏ID',
  `option_max_value` bigint(11) NOT NULL,
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`option_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏投注项';

-- ----------------------------
--  Table structure for `game_org_source`
-- ----------------------------
DROP TABLE IF EXISTS `game_org_source`;
CREATE TABLE `game_org_source` (
  `record_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `game_org_id` bigint(11) NOT NULL COMMENT '游戏类型ID',
  `org_value` int(4) NOT NULL COMMENT '数据数值',
  `org_index` int(4) NOT NULL COMMENT '数据顺序',
  `org_group` int(4) NOT NULL COMMENT '数据组别',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='开奖数据源记录表';

-- ----------------------------
--  Table structure for `game_phase`
-- ----------------------------
DROP TABLE IF EXISTS `game_phase`;
CREATE TABLE `game_phase` (
  `phase_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '游戏期数记录ID',
  `phase_no` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '游戏期数编号',
  `game_id` bigint(11) NOT NULL COMMENT '游戏ID',
  `phase_date` date NOT NULL COMMENT '期数日期',
  `phase_status` tinyint(1) NOT NULL COMMENT '状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`phase_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏期数信息';

-- ----------------------------
--  Table structure for `game_player_betting`
-- ----------------------------
DROP TABLE IF EXISTS `game_player_betting`;
CREATE TABLE `game_player_betting` (
  `betting_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '投注记录ID',
  `game_id` bigint(11) NOT NULL COMMENT '游戏ID',
  `player_id` bigint(11) NOT NULL COMMENT '玩家ID',
  `game_phase` bigint(11) NOT NULL COMMENT '游戏期数',
  `option_id` bigint(11) NOT NULL COMMENT '游戏选项ID',
  `betting_amount` bigint(11) NOT NULL COMMENT '投注金豆',
  `betting_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`betting_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='玩家投注表';

-- ----------------------------
--  Table structure for `game_result_rule_10`
-- ----------------------------
DROP TABLE IF EXISTS `game_result_rule_10`;
CREATE TABLE `game_result_rule_10` (
  `record_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '出奖记录ID',
  `game_type_id` bigint(11) NOT NULL COMMENT '游戏类型ID',
  `game_id` bigint(11) NOT NULL COMMENT '游戏ID',
  `game_phase_id` bigint(11) NOT NULL COMMENT '游戏期数ID',
  `game_date` datetime NOT NULL COMMENT '游戏日期',
  `rule_type` tinyint(1) NOT NULL COMMENT '规则类型',
  `value_1` tinyint(2) NOT NULL COMMENT '第1个数值',
  `value_2` tinyint(2) NOT NULL COMMENT '第2个数值',
  `value_3` tinyint(2) DEFAULT NULL COMMENT '第三个数字',
  `value_4` tinyint(2) DEFAULT NULL COMMENT '第四个数字',
  `value_5` tinyint(2) DEFAULT NULL COMMENT '第五个数字',
  `value_6` tinyint(2) DEFAULT NULL COMMENT '第六个数字',
  `value_7` tinyint(2) DEFAULT NULL COMMENT '第七个数字',
  `value_8` tinyint(2) DEFAULT NULL COMMENT '第八个数字',
  `value_9` tinyint(2) DEFAULT NULL COMMENT '第九个数字',
  `value_10` tinyint(2) DEFAULT NULL COMMENT '第十个数字',
  `group_sum_value` tinyint(2) NOT NULL COMMENT '和数',
  `record_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏开奖结果-群数第一位 10';

-- ----------------------------
--  Table structure for `game_result_rule_11`
-- ----------------------------
DROP TABLE IF EXISTS `game_result_rule_11`;
CREATE TABLE `game_result_rule_11` (
  `record_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '出奖记录ID',
  `game_type_id` bigint(11) NOT NULL COMMENT '游戏类型ID',
  `game_id` bigint(11) NOT NULL COMMENT '游戏ID',
  `game_phase_id` bigint(11) NOT NULL COMMENT '游戏期数ID',
  `game_date` datetime NOT NULL COMMENT '游戏日期',
  `group_value_1` tinyint(2) NOT NULL COMMENT '第一组数值',
  `group_value_2` tinyint(2) NOT NULL COMMENT '第二组数值',
  `group_sum_value` tinyint(2) NOT NULL COMMENT '和数',
  `record_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏开奖结果-二数求和 11';

-- ----------------------------
--  Table structure for `game_result_rule_28`
-- ----------------------------
DROP TABLE IF EXISTS `game_result_rule_28`;
CREATE TABLE `game_result_rule_28` (
  `record_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '出奖记录ID',
  `game_type_id` bigint(11) NOT NULL COMMENT '游戏类型ID',
  `game_id` bigint(11) NOT NULL COMMENT '游戏ID',
  `game_phase_id` bigint(11) NOT NULL COMMENT '游戏期数ID',
  `game_date` datetime NOT NULL COMMENT '游戏日期',
  `group_value_1` tinyint(2) NOT NULL COMMENT '第一组数值',
  `group_value_2` tinyint(2) NOT NULL COMMENT '第二组数值',
  `group_value_3` tinyint(2) NOT NULL COMMENT '第三组数值',
  `group_sum_value` tinyint(2) NOT NULL COMMENT '和数',
  `record_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏开奖结果-三数求和-28';

-- ----------------------------
--  Table structure for `game_result_rule_29`
-- ----------------------------
DROP TABLE IF EXISTS `game_result_rule_29`;
CREATE TABLE `game_result_rule_29` (
  `record_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '出奖记录ID',
  `game_type_id` bigint(11) NOT NULL COMMENT '游戏类型ID',
  `game_id` bigint(11) NOT NULL COMMENT '游戏ID',
  `game_phase_id` bigint(11) NOT NULL COMMENT '游戏期数ID',
  `game_date` datetime NOT NULL COMMENT '游戏日期',
  `group_value_1` tinyint(2) NOT NULL COMMENT '第一组数值',
  `group_value_2` tinyint(2) NOT NULL COMMENT '第二组数值',
  `group_value_3` tinyint(2) NOT NULL COMMENT '第三组数值',
  `group_sum_value` tinyint(2) NOT NULL COMMENT '和数',
  `record_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏开奖结果-三数求和-16';

-- ----------------------------
--  Table structure for `game_result_rule_36`
-- ----------------------------
DROP TABLE IF EXISTS `game_result_rule_36`;
CREATE TABLE `game_result_rule_36` (
  `record_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '出奖记录ID',
  `game_type_id` bigint(11) NOT NULL COMMENT '游戏类型ID',
  `game_id` bigint(11) NOT NULL COMMENT '游戏ID',
  `game_phase_id` bigint(11) NOT NULL COMMENT '游戏期数ID',
  `game_date` datetime NOT NULL COMMENT '游戏日期',
  `group_value_1` tinyint(2) NOT NULL COMMENT '第一组数值',
  `group_value_2` tinyint(2) NOT NULL COMMENT '第二组数值',
  `group_value_3` tinyint(2) NOT NULL COMMENT '第三组数值',
  `group_sum_value` tinyint(2) NOT NULL COMMENT '和数',
  `record_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏开奖结果-三数组合类分类 36';

-- ----------------------------
--  Table structure for `game_type`
-- ----------------------------
DROP TABLE IF EXISTS `game_type`;
CREATE TABLE `game_type` (
  `type_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '类型ID',
  `type_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '类型名称',
  `type_summary` varchar(200) COLLATE utf8_bin NOT NULL COMMENT '类型描述',
  `type_content` varchar(2000) COLLATE ututf8_binf8mb4_bin DEFAULT NULL COMMENT '游戏介绍',
  `type_status` tinyint(1) NOT NULL COMMENT '类型状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  `org_type` bigint(11) NOT NULL COMMENT '数据源类型',
  `org_code` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '数据源业务编码',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='游戏类型表';

-- ----------------------------
--  Table structure for `member_account_change`
-- ----------------------------
DROP TABLE IF EXISTS `member_account_change`;
CREATE TABLE `member_account_change` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `info_type` tinyint(1) NOT NULL COMMENT '记录类型',
  `change_counts` bigint(11) NOT NULL COMMENT '变动金豆数',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `info_time` datetime NOT NULL COMMENT '记录时间',
  `info_desc` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员金豆和银行账户转账记录';

-- ----------------------------
--  Table structure for `member_almsbean_info`
-- ----------------------------
DROP TABLE IF EXISTS `member_almsbean_info`;
CREATE TABLE `member_almsbean_info` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '领取记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `get_date` date NOT NULL COMMENT '领取日期',
  `bean_counts` bigint(11) NOT NULL COMMENT '领取救济金豆数',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员每日救济金豆领取记录表';

-- ----------------------------
--  Table structure for `member_bankcard`
-- ----------------------------
DROP TABLE IF EXISTS `member_bankcard`;
CREATE TABLE `member_bankcard` (
  `card_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '卡ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `account_balance` bigint(11) NOT NULL COMMENT '存款金额',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  `card_status` tinyint(1) NOT NULL COMMENT '银行账户状态',
  PRIMARY KEY (`card_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员银行账户表';

-- ----------------------------
--  Table structure for `member_bankcard_info`
-- ----------------------------
DROP TABLE IF EXISTS `member_bankcard_info`;
CREATE TABLE `member_bankcard_info` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '明细ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `info_type` tinyint(1) NOT NULL COMMENT '明细类型',
  `info_fee` bigint(11) NOT NULL COMMENT '现金金额',
  `biz_id` bigint(11) NOT NULL COMMENT '业务记录ID',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员银行账户明细表';

-- ----------------------------
--  Table structure for `member_goldenbaen`
-- ----------------------------
DROP TABLE IF EXISTS `member_goldenbaen`;
CREATE TABLE `member_goldenbaen` (
  `bean_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `bean_count` bigint(11) NOT NULL COMMENT '金豆总数',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  `bean_status` tinyint(1) NOT NULL COMMENT '账户状态',
  PRIMARY KEY (`bean_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员金豆账户表';

-- ----------------------------
--  Table structure for `member_goldenbean_info`
-- ----------------------------
DROP TABLE IF EXISTS `member_goldenbean_info`;
CREATE TABLE `member_goldenbean_info` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '明细记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `info_type` tinyint(1) NOT NULL COMMENT '明细类型',
  `bena_counts` bigint(11) NOT NULL COMMENT '金豆数值',
  `biz_id` bigint(11) NOT NULL COMMENT '业务记录ID',
  `infp_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员金豆账户明细表';

-- ----------------------------
--  Table structure for `member_info`
-- ----------------------------
DROP TABLE IF EXISTS `member_info`;
CREATE TABLE `member_info` (
  `member_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '会员ID',
  `member_name` varchar(8) COLLATE utf8_bin NOT NULL COMMENT '会员编码',
  `member_nickname` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '会员昵称',
  `user_name` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `member_icon_url` varchar(128) COLLATE utf8_bin NOT NULL COMMENT '头像',
  `member_mobile` varchar(11) COLLATE utf8_bin NOT NULL COMMENT '手机号码',
  `member_qq` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT 'QQ',
  `member_email` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '常用邮箱',
  `member_wx` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '微信',
  `is_wxcheck` tinyint(1) DEFAULT '0' COMMENT '登录是否微信验证 0不需要 1需要',
  `member_level` tinyint(1) NOT NULL DEFAULT '1' COMMENT '会员等级',
  `member_xp` bigint(11) NOT NULL DEFAULT '0' COMMENT '会员经验值',
  `register_date` datetime NOT NULL COMMENT '注册日期',
  `member_status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '会员状态 -1删除 0停用 1有效',
  `extend_links` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '推广链接地址',
  `parent_id` bigint(11) DEFAULT NULL COMMENT '上级会员ID',
  `last_ip` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '上次登录ip地址',
  `last_logintime` datetime DEFAULT NULL COMMENT '上次登录时间',
  `singin_counts` tinyint(1) DEFAULT '0' COMMENT '连续签到数',
  `login_pass` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '登录密码',
  `bank_pass` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '银行密码',
  `member_type` tinyint(1) NOT NULL DEFAULT '1' COMMENT '玩家类型  1普通玩家（注册玩家） 2代理玩家\r\n            1 玩家 2代理玩家',
  `game_rate` int(3) DEFAULT NULL COMMENT '抽成比例',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  `agent_id` bigint(11) DEFAULT '-1' COMMENT '代理商ID',
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员表';

-- ----------------------------
--  Records of `member_info`
-- ----------------------------
BEGIN;
INSERT INTO `member_info` VALUES ('1', '123', '123', '13', '13', '123', '123', '123', '123', '0', '1', '0', '2019-05-15 11:11:23', '1', '123', '-1', null, null, '0', '123123', '123123', '2', null, '2019-05-15 16:54:12', '2019-05-15 17:07:34', '2'), ('2', '321', '321', '321', '321', '321', '123', '1231', '23', '1', '1', '1', '2019-05-15 11:11:11', '1', '1', '-1', null, null, '0', '321', '123', '2', null, '2019-05-15 17:04:50', '2019-05-15 17:04:50', null), ('3', '321', '321', '321', '321', '321543', '123', '1231', '23', '1', '1', '1', '2019-05-15 11:11:11', '1', '1', '-1', null, null, '0', '321', '123', '2', null, '2019-05-15 17:06:23', '2019-05-15 17:06:23', '1'), ('4', '', null, null, '', '13334564545', null, null, null, null, '1', '0', '2019-05-15 11:11:11', '1', null, null, null, null, '0', '123456', null, '1', null, '2019-05-17 10:35:15', '2019-05-17 10:35:15', null);
COMMIT;

-- ----------------------------
--  Table structure for `member_level_agent`
-- ----------------------------
DROP TABLE IF EXISTS `member_level_agent`;
CREATE TABLE `member_level_agent` (
  `level_id` bigint(11) NOT NULL COMMENT '等级ID',
  `level_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '等级名称',
  `level_score` int(3) NOT NULL COMMENT '等级抽成比例 0-999',
  `level_status` tinyint(1) NOT NULL COMMENT '等级状态 -1删除 0停用 1有效',
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`level_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='代理会员等级（直充模式下代理玩家各个等级的配置信息）';

-- ----------------------------
--  Table structure for `member_level_player`
-- ----------------------------
DROP TABLE IF EXISTS `member_level_player`;
CREATE TABLE `member_level_player` (
  `level_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '等级ID',
  `level_title` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '等级标题',
  `level_xp` int(8) NOT NULL COMMENT '所需经验数',
  `level_up_reward` tinyint(4) NOT NULL COMMENT '升级奖励金豆数',
  `level_credit_commision` tinyint(2) NOT NULL COMMENT '充值奖励比例',
  `level_signin_multiples` tinyint(4) NOT NULL COMMENT '签到奖励金豆基数',
  `level_alms_bean` tinyint(4) NOT NULL COMMENT '每日救济金豆数',
  `level_status` tinyint(1) NOT NULL COMMENT '等级状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  `level_index` tinyint(2) NOT NULL COMMENT '排序位',
  PRIMARY KEY (`level_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='玩家会员等级表';

-- ----------------------------
--  Records of `member_level_player`
-- ----------------------------
BEGIN;
INSERT INTO `member_level_player` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '2019-05-14 18:34:11', '2019-05-14 18:34:27', '1');
COMMIT;

-- ----------------------------
--  Table structure for `member_relation`
-- ----------------------------
DROP TABLE IF EXISTS `member_relation`;
CREATE TABLE `member_relation` (
  `realtion_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '关系记录ID',
  `player_id` bigint(11) NOT NULL COMMENT '玩家ID',
  `parent_id` bigint(11) NOT NULL COMMENT '上级ID',
  `relation_level` tinyint(2) NOT NULL COMMENT '当前玩家级别深度',
  `current_cut` tinyint(4) NOT NULL COMMENT '当前玩家抽成比例',
  `parent_cut` tinyint(4) NOT NULL COMMENT '上家抽成比例',
  `relation_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`realtion_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='玩家关系族谱表';

-- ----------------------------
--  Table structure for `member_signin_info`
-- ----------------------------
DROP TABLE IF EXISTS `member_signin_info`;
CREATE TABLE `member_signin_info` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '签到记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `signin_date` date NOT NULL COMMENT '签到日期',
  `bean_counts` int(4) NOT NULL COMMENT '签到获得金豆数',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员签到记录表';

-- ----------------------------
--  Table structure for `member_xp_info`
-- ----------------------------
DROP TABLE IF EXISTS `member_xp_info`;
CREATE TABLE `member_xp_info` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '明细记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `xp_type` tinyint(1) NOT NULL COMMENT '经验类型',
  `xp_value` int(8) NOT NULL COMMENT '经验值',
  `xp_gettime` datetime NOT NULL COMMENT '获取日期',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员经验值明细表';

-- ----------------------------
--  Table structure for `member_xp_to_bean`
-- ----------------------------
DROP TABLE IF EXISTS `member_xp_to_bean`;
CREATE TABLE `member_xp_to_bean` (
  `exchange_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '兑换记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '会员ID',
  `exchange_date` datetime NOT NULL COMMENT '兑换日期',
  `xp_counts` bigint(11) NOT NULL COMMENT '兑换消耗经验值',
  `bean_counts` bigint(11) NOT NULL COMMENT '兑换所得金豆值',
  `exchange_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`exchange_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='会员经验兑换金豆记录表';

-- ----------------------------
--  Table structure for `order_goods`
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods` (
  `goods_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `goods_type` tinyint(1) NOT NULL COMMENT '商品分类ID（1电子充值卡 2其他）',
  `goods_name` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '商品名称',
  `goods_price` bigint(11) NOT NULL COMMENT '商品金额展示使用',
  `goods_img_url` varchar(128) COLLATE utf8_bin NOT NULL COMMENT '商品图片',
  `goods_beans` bigint(11) NOT NULL COMMENT '商品价格（金豆数）',
  `goods_desc` varchar(500) COLLATE utf8_bin DEFAULT NULL COMMENT '奖品说明',
  `p0_beans` bigint(11) NOT NULL COMMENT '等级价格p0',
  `p1_beans` bigint(11) NOT NULL COMMENT '等级价格p1',
  `p2_beans` bigint(11) NOT NULL COMMENT '等级价格p2',
  `p3_beans` bigint(11) NOT NULL COMMENT '等级价格p3',
  `p4_beans` bigint(11) NOT NULL COMMENT '等级价格p4',
  `p5_beans` bigint(11) NOT NULL COMMENT '等级价格p5',
  `p6_beans` bigint(11) NOT NULL COMMENT '等级价格p6',
  `p7_beans` bigint(11) NOT NULL COMMENT '等级价格p7',
  `goods_status` tinyint(1) DEFAULT '1' COMMENT '商品状态（-1删除 0停用 1有效）',
  `goods_amount` bigint(11) DEFAULT '999999' COMMENT '商品数量',
  `recommend` tinyint(1) DEFAULT '0' COMMENT '是否推荐商品（0不推荐 1推荐奖品）',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='商品表';

-- ----------------------------
--  Records of `order_goods`
-- ----------------------------
BEGIN;
INSERT INTO `order_goods` VALUES ('1', '1', '??111', '500', '????', '50000', null, '55000', '54500', '54000', '53500', '53000', '52500', '52000', '52000', '-1', '999999', '0', '2019-05-27 11:36:16', '2019-05-27 11:58:45');
COMMIT;

-- ----------------------------
--  Table structure for `order_goods_member`
-- ----------------------------
DROP TABLE IF EXISTS `order_goods_member`;
CREATE TABLE `order_goods_member` (
  `order_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '交易记录ID',
  `member_id` bigint(11) NOT NULL COMMENT '玩家ID',
  `goods_id` bigint(11) NOT NULL COMMENT '商品ID',
  `bean_total` bigint(11) NOT NULL COMMENT '购买订单金豆总数',
  `bean_base` bigint(11) NOT NULL COMMENT '购买订单金豆数',
  `bean_rebate` bigint(11) NOT NULL COMMENT '购买订单手续费',
  `order_date` datetime NOT NULL COMMENT '购买交易时间',
  `order_status` tinyint(1) NOT NULL COMMENT '订单状态',
  `agent_id` bigint(11) NOT NULL COMMENT '受让代理商ID',
  `grant_date` datetime NOT NULL COMMENT '受让日期',
  `grant_bean` bigint(11) NOT NULL COMMENT '受让金豆数',
  `grant_rebate` bigint(11) NOT NULL COMMENT '受让佣金',
  `buy_back_date` datetime NOT NULL COMMENT '回购日期',
  `buy_back_bean` bigint(11) NOT NULL COMMENT '回购金豆数',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='玩家购买商品表';

-- ----------------------------
--  Table structure for `plam_verification_code`
-- ----------------------------
DROP TABLE IF EXISTS `plam_verification_code`;
CREATE TABLE `plam_verification_code` (
  `code_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '验证码记录ID',
  `code_type` tinyint(1) NOT NULL COMMENT '业务类型',
  `member_id` bigint(11) DEFAULT NULL COMMENT '会员ID',
  `mobile_no` varchar(11) COLLATE utf8_bin NOT NULL COMMENT '手机号码',
  `code_info` varchar(6) COLLATE utf8_bin NOT NULL COMMENT '验证码',
  `limit_time` datetime NOT NULL COMMENT '有效期限',
  `code_status` tinyint(1) NOT NULL COMMENT '记录状态',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='验证码记录表';

-- ----------------------------
--  Table structure for `security_token`
-- ----------------------------
DROP TABLE IF EXISTS `security_token`;
CREATE TABLE `security_token` (
  `token_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '授信记录ID',
  `user_type` tinyint(1) NOT NULL COMMENT '用户类型',
  `user_id` bigint(11) NOT NULL COMMENT '用户ID',
  `account` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '登录账户',
  `login_time` datetime NOT NULL COMMENT '登录时间',
  `login_ip` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '登录ip',
  `login_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
  `token_content` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'token',
  `limit_time` bigint(20) NOT NULL COMMENT '有效时间',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '最后修改时间',
  `token_status` tinyint(1) NOT NULL COMMENT '记录状态',
  PRIMARY KEY (`token_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='用户授信记录表';

-- ----------------------------
--  Table structure for `sys_log`
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `log_id` bigint(18) NOT NULL AUTO_INCREMENT,
  `log_sys` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '1 运营端（oss）\r\n            2 代理端（agent）\r\n            3 客户端（PC）\r\n            4 客户端（App）',
  `log_module` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '模块记录对应着相关的模块列表（此列表目前不在库中保存，后续添加进来）',
  `log_function` varchar(20) COLLATE utf8_bin NOT NULL COMMENT '功能名称',
  `log_user_id` bigint(11) NOT NULL COMMENT '操作人ID',
  `log_biz_message` varchar(500) COLLATE utf8_bin NOT NULL COMMENT '具体业务操作描述',
  `log_biz_time` datetime NOT NULL COMMENT '操作的具体时间',
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='系统日志';

-- ----------------------------
--  Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '菜单名称',
  `menu_desc` varchar(500) COLLATE utf8_bin DEFAULT NULL COMMENT '菜单描述',
  `menu_url` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '菜单链接地址',
  `menu_parent` bigint(11) NOT NULL COMMENT '上级菜单ID（如果是一级菜单，则此字段属性为-1）',
  `menu_type` tinyint(1) NOT NULL DEFAULT '0' COMMENT '菜单类型 0 系统菜单 1外部菜单',
  `menu_status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '菜单状态 -1删除 0停用 1有效',
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='系统菜单表（系统权限控制在菜单级）';

-- ----------------------------
--  Records of `sys_menu`
-- ----------------------------
BEGIN;
INSERT INTO `sys_menu` VALUES ('1', '权限管理', null, null, '-1', '1', '1', '2019-05-10 11:42:15', '2019-05-10 11:42:57'), ('2', '财务', null, null, '-1', '1', '1', '2019-05-10 22:48:58', '2019-05-10 22:48:58'), ('3', '角色管理', null, null, '1', '1', '1', '2019-05-10 22:49:15', '2019-05-10 22:49:15'), ('4', '用户管理', null, null, '1', '1', '1', '2019-05-10 22:49:21', '2019-05-10 22:49:21');
COMMIT;

-- ----------------------------
--  Table structure for `sys_relation_role_resource`
-- ----------------------------
DROP TABLE IF EXISTS `sys_relation_role_resource`;
CREATE TABLE `sys_relation_role_resource` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `role_id` bigint(11) NOT NULL COMMENT '角色ID',
  `resource_id` bigint(11) NOT NULL COMMENT '资源记录ID（菜单ID、功能ID）',
  `resource_type` tinyint(1) NOT NULL DEFAULT '1' COMMENT '资源类型（1菜单 2功能）',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态-1删除 0停用 1有效',
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）';

-- ----------------------------
--  Records of `sys_relation_role_resource`
-- ----------------------------
BEGIN;
INSERT INTO `sys_relation_role_resource` VALUES ('1', '3', '1', '1', '-1', '2019-05-10 23:43:23', '2019-05-10 23:43:23'), ('2', '3', '2', '1', '-1', '2019-05-10 23:43:23', '2019-05-10 23:43:23'), ('3', '3', '3', '1', '-1', '2019-05-10 23:43:23', '2019-05-10 23:43:23'), ('4', '3', '2', '1', '1', '2019-05-10 23:44:53', '2019-05-10 23:44:53'), ('5', '3', '3', '1', '1', '2019-05-10 23:44:53', '2019-05-10 23:44:53'), ('6', '3', '4', '1', '1', '2019-05-10 23:44:53', '2019-05-10 23:44:53');
COMMIT;

-- ----------------------------
--  Table structure for `sys_relation_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_relation_user_role`;
CREATE TABLE `sys_relation_user_role` (
  `info_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `user_id` bigint(11) NOT NULL COMMENT '用户ID',
  `role_id` bigint(11) NOT NULL COMMENT '角色ID',
  `info_status` tinyint(1) NOT NULL COMMENT '记录状态 -1删除 0停用 1有效',
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='用户具有角色记录表';

-- ----------------------------
--  Records of `sys_relation_user_role`
-- ----------------------------
BEGIN;
INSERT INTO `sys_relation_user_role` VALUES ('1', '2', '3', '-1', '2019-05-14 16:39:22', '2019-05-14 16:44:19'), ('2', '2', '3', '1', '2019-05-14 16:44:19', '2019-05-14 16:44:19');
COMMIT;

-- ----------------------------
--  Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) COLLATE utf8_bin NOT NULL,
  `role_desc` varchar(500) COLLATE utf8_bin NOT NULL,
  `role_status` tinyint(1) NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='系统角色表';

-- ----------------------------
--  Records of `sys_role`
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` VALUES ('3', '测试角色', '测试数据', '1', '2019-05-10 23:43:23', '2019-05-10 23:44:53');
COMMIT;

-- ----------------------------
--  Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '用户姓名',
  `user_mobile` varchar(11) COLLATE utf8_bin NOT NULL COMMENT '联系手机号码',
  `user_email` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '电子邮箱',
  `user_account` varchar(50) COLLATE utf8_bin NOT NULL COMMENT '登录账户',
  `user_password` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '登录密码（64位加密）',
  `user_status` tinyint(1) NOT NULL COMMENT '用户状态-1删除 0停用 1有效',
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  `last_login_ip` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '用户最后登录IP地址',
  `last_login_time` datetime DEFAULT NULL COMMENT '用户最后登录时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC COMMENT='系统用户表';

-- ----------------------------
--  Records of `sys_user`
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES ('1', '管理员1', '13333456789', '123@qq.om', '123123123', '123123123', '1', '2019-05-14 16:29:04', '2019-05-14 16:29:04', null, null), ('2', '用户1', '23453123', '123124@qw.com', '123123132213', '34234234', '1', '2019-05-14 16:39:22', '2019-05-14 16:44:19', null, null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
