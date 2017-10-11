/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : tea

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-10-11 22:58:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tea
-- ----------------------------
DROP TABLE IF EXISTS `tea`;
CREATE TABLE `tea` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `shape` float(2,1) NOT NULL,
  `color` float(2,1) NOT NULL,
  `purity` float(2,1) unsigned NOT NULL,
  `soup_color` float(2,1) NOT NULL,
  `smell` float(2,1) NOT NULL,
  `leaf_buttom` float(2,1) NOT NULL,
  `teagrade_id` bigint(20) NOT NULL,
  `votes` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` tinyint(1) unsigned zerofill DEFAULT NULL,
  `sweet_smell` float unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tea
-- ----------------------------
INSERT INTO `tea` VALUES ('1', null, '0.4', '0.6', '0.6', '0.9', '0.4', '0.6', '7', null, '2017-10-09 09:53:50', '2017-10-09 09:53:53', null, '0.8');
INSERT INTO `tea` VALUES ('2', null, '0.7', '0.6', '0.6', '0.9', '0.4', '0.6', '7', null, '2017-09-14 09:54:41', '2017-10-09 09:54:54', null, '0.8');
INSERT INTO `tea` VALUES ('3', null, '1.0', '1.0', '1.0', '1.0', '1.0', '1.0', '7', null, '2017-10-10 09:53:55', '2017-10-09 09:53:59', null, '1');
INSERT INTO `tea` VALUES ('4', null, '0.5', '0.3', '0.8', '0.9', '0.6', '0.5', '7', null, '2017-10-02 09:54:00', '2017-10-09 09:54:04', null, '0.4');
INSERT INTO `tea` VALUES ('5', null, '0.4', '0.2', '0.3', '0.2', '0.6', '0.6', '7', null, '2017-10-11 09:54:28', '2017-10-09 09:54:31', null, '0.4');
INSERT INTO `tea` VALUES ('6', null, '0.3', '0.5', '0.7', '0.6', '0.9', '0.4', '7', null, '2017-10-02 09:54:32', '2017-10-09 09:54:36', null, '0.4');
INSERT INTO `tea` VALUES ('7', null, '0.4', '0.5', '0.6', '0.5', '0.5', '0.5', '7', null, '2017-10-17 09:54:06', '2017-10-09 09:54:09', null, '0.5');
INSERT INTO `tea` VALUES ('8', null, '0.4', '0.5', '0.6', '0.5', '0.5', '0.8', '7', null, '2017-10-01 09:54:38', '2017-10-09 09:54:40', null, '0.5');
INSERT INTO `tea` VALUES ('9', null, '0.5', '0.5', '0.5', '0.4', '0.4', '0.4', '7', null, '2017-10-04 09:54:11', '2017-10-09 09:54:14', null, '0.5');
INSERT INTO `tea` VALUES ('10', null, '0.5', '0.5', '0.5', '0.4', '0.4', '0.4', '7', null, '2017-10-06 09:54:15', '2017-10-09 09:54:19', null, '0.5');
INSERT INTO `tea` VALUES ('11', null, '0.4', '0.5', '0.4', '0.5', '0.4', '0.4', '7', null, '2017-10-07 09:54:20', '2017-10-09 09:54:23', null, '0.3');
INSERT INTO `tea` VALUES ('12', null, '0.5', '0.4', '0.5', '0.7', '0.5', '0.6', '7', null, '2017-10-08 09:54:24', '2017-10-09 09:54:27', null, '0.6');
INSERT INTO `tea` VALUES ('13', null, '0.9', '0.5', '0.5', '0.5', '0.4', '0.4', '7', null, '2017-10-18 14:29:11', '2017-10-09 14:29:14', null, '0.5');
INSERT INTO `tea` VALUES ('14', null, '0.4', '0.4', '0.1', '0.3', '0.3', '0.4', '7', null, '2017-10-17 14:29:26', '2017-10-09 14:29:29', null, '0.3');
INSERT INTO `tea` VALUES ('15', null, '0.4', '0.4', '0.1', '0.3', '0.3', '0.4', '7', null, '2017-10-10 14:29:30', '2017-10-09 14:29:34', null, '0.3');
INSERT INTO `tea` VALUES ('16', null, '0.5', '0.5', '0.4', '0.5', '0.3', '0.4', '7', null, '2017-10-06 14:30:41', '2017-10-09 14:30:44', null, '0.3');
INSERT INTO `tea` VALUES ('17', null, '0.5', '0.5', '0.5', '0.5', '0.7', '0.6', '7', null, '2017-10-12 14:30:46', '2017-10-09 14:30:48', null, '0.5');
INSERT INTO `tea` VALUES ('18', null, '0.4', '0.5', '0.4', '0.4', '0.2', '0.2', '7', null, '2017-10-07 14:30:50', '2017-10-09 14:30:53', null, '0.3');
INSERT INTO `tea` VALUES ('19', null, '0.4', '0.3', '0.3', '0.3', '0.4', '0.3', '7', null, '2017-10-14 14:30:54', '2017-10-09 14:30:56', null, '0.3');
INSERT INTO `tea` VALUES ('20', null, '0.5', '0.5', '0.4', '0.5', '0.4', '0.3', '7', null, '2017-10-04 14:30:58', '2017-10-09 14:31:01', null, '0.4');
INSERT INTO `tea` VALUES ('21', null, '0.5', '0.3', '0.3', '0.1', '0.1', '0.7', '7', null, '2017-10-10 14:29:39', '2017-10-09 14:29:42', null, '0.4');
INSERT INTO `tea` VALUES ('22', null, '0.5', '0.4', '0.4', '0.2', '0.4', '0.4', '7', null, '2017-10-08 14:31:02', '2017-10-09 14:31:05', null, '0.4');
INSERT INTO `tea` VALUES ('23', null, '0.4', '0.7', '0.3', '0.6', '0.1', '0.2', '7', null, '2017-10-17 14:31:06', '2017-10-09 14:31:10', null, '0.3');
INSERT INTO `tea` VALUES ('24', null, '0.3', '0.5', '0.2', '0.1', '0.2', '0.3', '7', null, '2017-10-24 14:29:44', '2017-10-09 14:29:47', null, '0.3');
INSERT INTO `tea` VALUES ('25', null, '0.4', '0.3', '0.3', '0.2', '0.2', '0.1', '7', null, '2017-10-04 14:30:15', '2017-10-09 14:30:18', null, '0.2');
INSERT INTO `tea` VALUES ('26', null, '0.5', '0.8', '0.7', '0.2', '0.9', '0.4', '4', null, '2017-10-04 14:30:18', '2017-10-09 14:30:22', null, '0.4');
INSERT INTO `tea` VALUES ('27', null, '0.4', '0.4', '0.4', '0.4', '0.5', '0.4', '6', null, '2017-10-05 14:30:23', '2017-10-09 14:30:26', null, '0.7');
INSERT INTO `tea` VALUES ('28', null, '0.4', '0.4', '0.3', '0.3', '0.2', '0.3', '7', null, '2017-10-13 14:30:27', '2017-10-09 14:30:30', null, '0.3');
INSERT INTO `tea` VALUES ('29', null, '0.2', '0.8', '0.2', '0.3', '0.6', '0.3', '5', null, '2017-10-11 14:30:32', '2017-10-09 14:30:35', null, '0.8');
INSERT INTO `tea` VALUES ('30', null, '0.5', '1.0', '1.0', '0.5', '0.6', '0.5', '4', null, '2017-10-11 14:30:09', '2017-10-09 14:30:13', null, '0.7');
INSERT INTO `tea` VALUES ('31', null, '0.4', '0.8', '1.0', '0.6', '0.4', '0.5', '4', null, '2017-10-10 14:30:36', '2017-10-09 14:30:38', null, '0.7');
INSERT INTO `tea` VALUES ('32', null, '0.5', '0.4', '0.5', '0.8', '0.8', '0.6', '4', null, '2017-10-24 14:29:48', '2017-10-09 14:29:51', null, '0.8');
INSERT INTO `tea` VALUES ('33', null, '0.5', '0.4', '0.4', '0.3', '0.3', '0.2', '7', null, '2017-10-16 14:29:52', '2017-10-09 14:29:55', null, '0.3');
INSERT INTO `tea` VALUES ('34', null, '0.5', '0.8', '0.6', '0.7', '0.5', '0.3', '5', null, '2017-10-10 14:29:56', '2017-10-09 14:29:59', null, '0.4');
INSERT INTO `tea` VALUES ('35', null, '0.4', '0.4', '0.4', '0.3', '0.4', '0.3', '6', null, '2017-10-11 14:30:00', '2017-10-09 14:30:02', null, '0.3');
INSERT INTO `tea` VALUES ('36', null, '0.4', '0.8', '0.6', '0.2', '0.7', '0.6', '4', null, '2017-10-04 14:30:03', '2017-10-09 14:30:06', null, '0.6');
INSERT INTO `tea` VALUES ('37', null, '0.5', '0.2', '0.7', '0.7', '0.7', '0.7', '4', null, '2017-10-17 14:31:20', '2017-10-09 14:31:23', null, '0.6');
INSERT INTO `tea` VALUES ('38', null, '0.5', '0.5', '0.4', '0.4', '0.4', '0.3', '6', null, '2017-10-24 14:31:23', '2017-10-09 14:31:26', null, '0.4');
INSERT INTO `tea` VALUES ('39', null, '0.4', '1.0', '1.0', '0.8', '1.0', '0.9', '1', null, '2017-10-22 14:31:26', '2017-10-09 14:31:29', null, '0.8');

-- ----------------------------
-- Table structure for teabrand
-- ----------------------------
DROP TABLE IF EXISTS `teabrand`;
CREATE TABLE `teabrand` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `status` tinyint(1) unsigned zerofill NOT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `votes` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teabrand
-- ----------------------------
INSERT INTO `teabrand` VALUES ('1', '0', '2017-10-11 22:51:20', '1024');
INSERT INTO `teabrand` VALUES ('2', '0', '2017-10-11 22:35:35', '4212');
INSERT INTO `teabrand` VALUES ('3', '0', '2017-10-07 17:49:38', '4635');
INSERT INTO `teabrand` VALUES ('4', '0', '2017-10-07 17:49:49', '4152');
INSERT INTO `teabrand` VALUES ('5', '0', '2017-10-07 17:50:02', '3520');
INSERT INTO `teabrand` VALUES ('6', '0', '2017-10-07 17:50:12', '2563');
INSERT INTO `teabrand` VALUES ('7', '0', '2017-10-07 17:50:22', '5821');
INSERT INTO `teabrand` VALUES ('8', '0', '2017-10-07 17:50:35', '3625');
INSERT INTO `teabrand` VALUES ('9', '0', '2017-10-07 17:50:49', '2685');
INSERT INTO `teabrand` VALUES ('10', '0', '2017-10-07 17:51:13', '5142');
INSERT INTO `teabrand` VALUES ('11', '0', '2017-10-07 17:51:32', '1526');
INSERT INTO `teabrand` VALUES ('12', '0', '2017-10-07 17:51:47', '3654');

-- ----------------------------
-- Table structure for teagrade
-- ----------------------------
DROP TABLE IF EXISTS `teagrade`;
CREATE TABLE `teagrade` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `crate_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` tinyint(1) unsigned zerofill NOT NULL,
  `shape` float unsigned NOT NULL,
  `color` float unsigned NOT NULL,
  `purity` float NOT NULL,
  `soup_color` float unsigned NOT NULL,
  `sweet_smell` float unsigned NOT NULL,
  `smell` float unsigned NOT NULL,
  `leaf_buttom` float unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teagrade
-- ----------------------------
INSERT INTO `teagrade` VALUES ('1', '特一级', '2017-10-01 16:51:05', '2017-10-03 13:03:54', '0', '1', '0.9', '0.9', '0.9', '1', '1', '0.9');
INSERT INTO `teagrade` VALUES ('2', '特二级', '2017-10-01 16:51:40', '2017-10-03 13:10:56', '0', '0.9', '0.8', '0.9', '0.9', '0.9', '0.9', '0.8');
INSERT INTO `teagrade` VALUES ('3', '特三级', '2017-10-03 13:07:05', '2017-10-03 13:09:12', '0', '0.8', '0.7', '0.9', '0.8', '0.8', '0.7', '0.7');
INSERT INTO `teagrade` VALUES ('4', '一级', '2017-10-01 16:52:21', '2017-10-03 13:12:09', '0', '0.6', '0.5', '0.7', '0.6', '0.7', '0.7', '0.6');
INSERT INTO `teagrade` VALUES ('5', '二级', '2017-10-01 16:52:40', '2017-10-03 13:12:46', '0', '0.5', '0.4', '0.5', '0.5', '0.6', '0.6', '0.4');
INSERT INTO `teagrade` VALUES ('6', '三级', '2017-10-01 16:52:54', '2017-10-03 13:13:16', '0', '0.4', '0.3', '0.5', '0.4', '0.5', '0.5', '0.4');
INSERT INTO `teagrade` VALUES ('7', '四级', '2017-10-01 16:53:06', '2017-10-03 13:14:12', '0', '0.3', '0.2', '0.5', '0.2', '0.3', '0.3', '0.2');

-- ----------------------------
-- Table structure for teauser
-- ----------------------------
DROP TABLE IF EXISTS `teauser`;
CREATE TABLE `teauser` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) unsigned NOT NULL,
  `teabrand_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teauser
-- ----------------------------
INSERT INTO `teauser` VALUES ('1', '1', '1');
INSERT INTO `teauser` VALUES ('2', '2', '2');
INSERT INTO `teauser` VALUES ('3', '3', '2');
INSERT INTO `teauser` VALUES ('4', '4', '1');
INSERT INTO `teauser` VALUES ('5', '5', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `number` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '13027520232');
INSERT INTO `user` VALUES ('2', '13027521281');
INSERT INTO `user` VALUES ('3', '13027521282');
INSERT INTO `user` VALUES ('4', '13027521283');
INSERT INTO `user` VALUES ('5', '13027521284');
