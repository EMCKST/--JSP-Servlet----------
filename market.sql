/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : market
Target Host     : localhost:3306
Target Database : market
Date: 2019-12-13 17:10:27
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL auto_increment COMMENT '商品编号',
  `name` varchar(255) NOT NULL COMMENT '商品名称',
  `address` varchar(255) default NULL COMMENT '产地',
  `spec` varchar(255) NOT NULL COMMENT '规格',
  `trademark` varchar(255) default NULL COMMENT '商标',
  `Pprice` double(10,2) default NULL COMMENT '进价',
  `Tprice` double(10,2) default NULL COMMENT '批发价',
  `price` double(10,2) default NULL COMMENT '零售价',
  `qgp` varchar(255) default NULL COMMENT '保质期',
  `supplier` varchar(255) default NULL COMMENT '供应商',
  `rema` varchar(255) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '旺仔牛奶', '河南', '奶制品', '蒙牛', '2.00', '2.50', '3.50', '六个月', '蒙牛', '批发仅接受整数倍批发（10箱起）');
INSERT INTO `goods` VALUES ('4', '伊利纯牛奶', '郑州', '奶制品', '伊利', '5.00', '5.50', '7.00', '六个月', '伊利奶制品有限公司', '该牛奶保质期较短，优先售卖快到保质期的，上货须少量上');
INSERT INTO `goods` VALUES ('5', '特仑苏', '郑州', '奶制品', '蒙牛', '5.00', '5.50', '7.50', '六个月', '蒙牛有限公司', '暂无');
INSERT INTO `goods` VALUES ('10', '111', '11', '11', '11', '11.00', '11.00', '111.00', '11', '111', '11');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `id` int(11) NOT NULL auto_increment,
  `rec` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('5', '2019-12-11  admin  售出了一件 旺仔牛奶');
INSERT INTO `record` VALUES ('8', '2019-12-11  admin  增加了 特仑苏 的库存');
INSERT INTO `record` VALUES ('9', '2019-12-13  admin  修改了 旺仔牛奶 的库存');
INSERT INTO `record` VALUES ('10', '2019-12-13  admin  售出了一件 旺仔牛奶');
INSERT INTO `record` VALUES ('11', '2019-12-13  admin  售出了一件 特仑苏');
INSERT INTO `record` VALUES ('12', '2019-12-13  admin  售出了一件 伊利纯牛奶');
INSERT INTO `record` VALUES ('13', '2019-12-13  admin  添加了商品 111');
INSERT INTO `record` VALUES ('14', '2019-12-13  admin  修改了商品   111');
INSERT INTO `record` VALUES ('15', '2019-12-13  admin  修改了商品   111');
INSERT INTO `record` VALUES ('16', '2019-12-13  admin  修改了商品   111');
INSERT INTO `record` VALUES ('17', '2019-12-13  admin  售出了一件 旺仔牛奶');
INSERT INTO `record` VALUES ('18', '2019-12-13  admin  售出了一件 伊利纯牛奶');
INSERT INTO `record` VALUES ('19', '2019-12-13  admin  售出了一件 111');
INSERT INTO `record` VALUES ('20', '2019-12-13  admin  修改了 旺仔牛奶 的库存');
INSERT INTO `record` VALUES ('21', '2019-12-13  admin  修改了 111 的库存');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `roleId` int(11) default NULL COMMENT '1 管理员   2 超市经理   3 收银员   4 仓管',
  PRIMARY KEY  (`id`),
  KEY `MK00001` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123123', '1');
INSERT INTO `user` VALUES ('2', '张三', '123456', '2');
INSERT INTO `user` VALUES ('3', '李四', '123456', '3');
INSERT INTO `user` VALUES ('5', '王五', '123456', '4');

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `id` int(11) NOT NULL auto_increment COMMENT '主键',
  `g_name` varchar(11) NOT NULL COMMENT '商品名称',
  `stock` bigint(50) default NULL COMMENT '库存',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
INSERT INTO `warehouse` VALUES ('1', '旺仔牛奶', '3586');
INSERT INTO `warehouse` VALUES ('2', '伊利纯牛奶', '2145');
INSERT INTO `warehouse` VALUES ('3', '特仑苏', '2848');
INSERT INTO `warehouse` VALUES ('8', '111', '221');
