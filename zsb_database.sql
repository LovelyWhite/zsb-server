/*
 Navicat MySQL Data Transfer

 Source Server         : zsb
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : 39.106.117.227:3306
 Source Schema         : zsb_database

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 14/01/2021 08:05:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `type` enum('管理员','超级管理员') NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (7, 'abcd', 'abcd', '管理员');
COMMIT;

-- ----------------------------
-- Table structure for answerrecord
-- ----------------------------
DROP TABLE IF EXISTS `answerrecord`;
CREATE TABLE `answerrecord` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `questionbankid` int NOT NULL COMMENT '题库id',
  `costtime` int NOT NULL COMMENT '花费的秒数',
  `ansertime` timestamp NOT NULL COMMENT '答题时间',
  `gotsocre` int NOT NULL COMMENT '得分',
  `socre` int DEFAULT NULL COMMENT '满意度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for bankwithquestion
-- ----------------------------
DROP TABLE IF EXISTS `bankwithquestion`;
CREATE TABLE `bankwithquestion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `questionbankid` int NOT NULL COMMENT '题库id',
  `questionid` int NOT NULL COMMENT '题id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `bookkindid` int NOT NULL COMMENT '书种类id',
  `priceid` int NOT NULL COMMENT '价格id',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '书名',
  `press` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '出版社',
  `ISBN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ISBN',
  `poster` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '/default_poster.png' COMMENT '封面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for bookcomment
-- ----------------------------
DROP TABLE IF EXISTS `bookcomment`;
CREATE TABLE `bookcomment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `bookid` int NOT NULL COMMENT '图书id',
  `time` timestamp NOT NULL COMMENT '评论时间',
  `score` int NOT NULL COMMENT '评价等级',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '评论内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for booktype
-- ----------------------------
DROP TABLE IF EXISTS `booktype`;
CREATE TABLE `booktype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '种类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for carousel
-- ----------------------------
DROP TABLE IF EXISTS `carousel`;
CREATE TABLE `carousel` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) NOT NULL COMMENT '轮播图地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for cdk
-- ----------------------------
DROP TABLE IF EXISTS `cdk`;
CREATE TABLE `cdk` (
  `id` int NOT NULL,
  `CDK` varchar(0) NOT NULL COMMENT 'CDK',
  `goodid` int NOT NULL COMMENT 'cdk对应实体id',
  `type` enum('图书','课程','题库') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '''图书'',''课程'',''题库''',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int NOT NULL AUTO_INCREMENT,
  `teacherid` int NOT NULL,
  `priceid` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `intro` longblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for coursecomment
-- ----------------------------
DROP TABLE IF EXISTS `coursecomment`;
CREATE TABLE `coursecomment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `courseid` int NOT NULL COMMENT '课程id',
  `score` int NOT NULL COMMENT '评价分数',
  `time` timestamp NOT NULL COMMENT '评论时间',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '评论内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for dealrecord
-- ----------------------------
DROP TABLE IF EXISTS `dealrecord`;
CREATE TABLE `dealrecord` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `type` enum('收入','支出') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '交易类型',
  `money` double NOT NULL COMMENT '交易学豆数额',
  `time` timestamp NOT NULL COMMENT '交易时间',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',
  `historymoney` int DEFAULT '0' COMMENT '历史金额总数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for firstsubject
-- ----------------------------
DROP TABLE IF EXISTS `firstsubject`;
CREATE TABLE `firstsubject` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '一级科目名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `id` int NOT NULL,
  `readygoodid` int NOT NULL COMMENT '准备上架的商品id',
  `type` enum('图书','课程','题库','CDK') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '准备上架的商品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL,
  `time` timestamp NOT NULL,
  `log` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for notelike
-- ----------------------------
DROP TABLE IF EXISTS `notelike`;
CREATE TABLE `notelike` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `questionnoteid` int NOT NULL COMMENT '题评论id',
  `status` enum('空','踩','赞') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '评论状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `status` enum('已下单','已支付','待评价','已完成') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '支付状态',
  `ordertime` timestamp NOT NULL COMMENT '下单时间',
  `paytime` timestamp NULL DEFAULT NULL COMMENT '支付时间',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '订单评价',
  `socre` int DEFAULT NULL COMMENT '评价分数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `orderdetail`;
CREATE TABLE `orderdetail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `orderid` int NOT NULL COMMENT '订单id',
  `goodid` int NOT NULL COMMENT '商品id',
  `num` int NOT NULL DEFAULT '1' COMMENT '商品数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for price
-- ----------------------------
DROP TABLE IF EXISTS `price`;
CREATE TABLE `price` (
  `id` int NOT NULL AUTO_INCREMENT,
  `price` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '正常价格',
  `superprice` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '促销价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` enum('单选','多选','简答','判断','填空','改错','其他') NOT NULL DEFAULT '其他',
  `typename` varchar(100) NOT NULL DEFAULT '',
  `title` longblob NOT NULL,
  `cqans` blob COMMENT '选择题答案',
  `jqans` blob COMMENT '判断题答案',
  `fbans` blob COMMENT '填空题答案',
  `saand` blob COMMENT '简答题答案',
  `options` blob COMMENT '选择题选项',
  `difficulty` int NOT NULL DEFAULT '1' COMMENT '难度',
  `righttime` int NOT NULL DEFAULT '0' COMMENT '答对次数',
  `wrongtime` int NOT NULL DEFAULT '0' COMMENT '答错次数',
  `analysis` blob COMMENT '文字解析',
  `video` varchar(255) DEFAULT '' COMMENT '视频解析',
  `testcentre` varchar(255) DEFAULT '' COMMENT '考点',
  `keyword` varchar(255) DEFAULT '' COMMENT '关键词',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for questionbank
-- ----------------------------
DROP TABLE IF EXISTS `questionbank`;
CREATE TABLE `questionbank` (
  `id` int NOT NULL AUTO_INCREMENT,
  `questionbanktypeid` int NOT NULL COMMENT '题库类型id',
  `fsubjectid` int NOT NULL COMMENT '一级科目类型id',
  `ssubjectid` int NOT NULL COMMENT '二级科目类型id',
  `city` varchar(50) DEFAULT NULL COMMENT '省份',
  `priceid` int NOT NULL COMMENT '价格id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '题库名称',
  `anticipatetime` timestamp NOT NULL COMMENT '答题预计耗时',
  `updatetime` timestamp NOT NULL COMMENT '试题更新日期',
  `prefectscore` int NOT NULL COMMENT '试卷满分',
  `passscore` int NOT NULL COMMENT '通过分数',
  `intro` varchar(255) DEFAULT '' COMMENT '试题介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for questionbankcollect
-- ----------------------------
DROP TABLE IF EXISTS `questionbankcollect`;
CREATE TABLE `questionbankcollect` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `questionbankid` int NOT NULL COMMENT '题库id',
  `time` timestamp NOT NULL COMMENT '收藏时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for questionbankcomment
-- ----------------------------
DROP TABLE IF EXISTS `questionbankcomment`;
CREATE TABLE `questionbankcomment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `questionbankid` int NOT NULL COMMENT '题库id',
  `score` int NOT NULL COMMENT '评分',
  `time` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '评论时间',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '评论内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for questionbanktype
-- ----------------------------
DROP TABLE IF EXISTS `questionbanktype`;
CREATE TABLE `questionbanktype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '类型名称',
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '/default_icon.png' COMMENT '图标',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of questionbanktype
-- ----------------------------
BEGIN;
INSERT INTO `questionbanktype` VALUES (1, '每日一练', '/icons/qianbi.png');
INSERT INTO `questionbanktype` VALUES (2, '考点练习', '/icons/jilu.png');
INSERT INTO `questionbanktype` VALUES (3, '历年真题', '/icons/diqiuyi.png');
INSERT INTO `questionbanktype` VALUES (4, '模拟试题', '/icons/shiyan.png');
INSERT INTO `questionbanktype` VALUES (5, '高频题库', '/icons/chuangyi.png');
INSERT INTO `questionbanktype` VALUES (6, '通关密卷', '/icons/xueshimao.png');
INSERT INTO `questionbanktype` VALUES (7, '考点划题', '/icons/jiaodai.png');
INSERT INTO `questionbanktype` VALUES (8, '临考要点', '/icons/fangdajing.png');
COMMIT;

-- ----------------------------
-- Table structure for questionnote
-- ----------------------------
DROP TABLE IF EXISTS `questionnote`;
CREATE TABLE `questionnote` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `questionid` int NOT NULL COMMENT '题目id',
  `time` timestamp NOT NULL COMMENT '笔记时间',
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '笔记内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for secondsubject
-- ----------------------------
DROP TABLE IF EXISTS `secondsubject`;
CREATE TABLE `secondsubject` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstsubjectid` int NOT NULL COMMENT '所属一级科目id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '科目名称',
  `code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '科目代码',
  `hascity` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT 'N' COMMENT '是否有城市选项',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '讲师名称',
  `intro` longblob NOT NULL COMMENT '讲师介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '账号',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '密码',
  `sex` enum('男','女') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '男' COMMENT '性别',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '/assests/icons/loginavatar.png' COMMENT '头像地址',
  `age` int DEFAULT '18' COMMENT '年龄',
  `nickname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '' COMMENT '昵称',
  `usertypeid` int NOT NULL DEFAULT '1' COMMENT '用户类型id',
  `regtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `updatetime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `recommendid` int DEFAULT NULL COMMENT '推荐人id',
  `realname` varchar(100) DEFAULT NULL COMMENT '真实姓名',
  `idcardnum` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '身份证号码',
  `birthday` timestamp NULL DEFAULT NULL COMMENT '生日',
  `ban` char(1) DEFAULT 'N' COMMENT '是否封禁',
  `qus` varchar(255) DEFAULT NULL COMMENT '安全问题',
  `qusans` varchar(255) DEFAULT NULL COMMENT '安全问题答案',
  `tel` varchar(50) DEFAULT NULL COMMENT '电话',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `qq` varchar(100) DEFAULT NULL COMMENT 'qq号',
  `wechat` varchar(100) DEFAULT NULL COMMENT '微信号',
  `learning2id` int DEFAULT NULL COMMENT '正在学习的2级科目',
  `openid` varchar(100) DEFAULT NULL COMMENT '微信openid',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (10, NULL, '', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKSL3j0YXvGzY0jreQ16pLktYQStKDzzaEEaTvoHjmoAh84PUibKuP9hGGGIyutZCeoSG10oedYpiaQ/132', 18, '小白', 1, '2020-08-29 08:35:08', NULL, NULL, NULL, NULL, NULL, 'N', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'oJe_F5LgD1NTUIn6RY2Q1f-spZ8Q');
COMMIT;

-- ----------------------------
-- Table structure for usertype
-- ----------------------------
DROP TABLE IF EXISTS `usertype`;
CREATE TABLE `usertype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of usertype
-- ----------------------------
BEGIN;
INSERT INTO `usertype` VALUES (1, '普通会员');
INSERT INTO `usertype` VALUES (2, '会员');
COMMIT;

-- ----------------------------
-- Table structure for wronganswer
-- ----------------------------
DROP TABLE IF EXISTS `wronganswer`;
CREATE TABLE `wronganswer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ssubjectid` int NOT NULL COMMENT '二级科目id',
  `questionid` int NOT NULL COMMENT '题目id',
  `time` timestamp NOT NULL COMMENT '错题时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SET FOREIGN_KEY_CHECKS = 1;
