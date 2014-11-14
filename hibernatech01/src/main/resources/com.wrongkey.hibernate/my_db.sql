/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : my_db

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2014-11-15 00:51:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `persons`
-- ----------------------------
DROP TABLE IF EXISTS `persons`;
CREATE TABLE `persons` (
  `Id_P` int(11) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `City` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id_P`),
  UNIQUE KEY `Id_P` (`Id_P`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of persons
-- ----------------------------
INSERT INTO `persons` VALUES ('1', 'Adams', 'John', 'Oxford Street', 'London');
INSERT INTO `persons` VALUES ('2', 'key', 'wrong', 'Chenglong Avenue 1819', 'Chengdu');
INSERT INTO `persons` VALUES ('3', 'Kai', 'Hu', 'chenglong Avenue 1819', 'Chengdu Sichuan');
INSERT INTO `persons` VALUES ('4', 'yanjun', 'Song', 'guojiaqiao street', 'Chengdu');
