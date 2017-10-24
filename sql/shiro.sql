/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.21-log : Database - hnzhsw
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hnzhsw` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hnzhsw`;

/*Table structure for table `u_permission` */

DROP TABLE IF EXISTS `u_permission`;

CREATE TABLE `u_permission` (
  `pid` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(256) DEFAULT NULL COMMENT 'url地址',
  `pname` varchar(65) DEFAULT NULL COMMENT 'url描述',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `u_permission` */

insert  into `u_permission`(`pid`,`url`,`pname`) values (1,'user:add','用户添加'),(2,'user:delete','用户删除'),(3,'role:add','角色添加'),(4,'role:delete','角色删除'),(5,'user:show','用户列表');

/*Table structure for table `u_role` */

DROP TABLE IF EXISTS `u_role`;

CREATE TABLE `u_role` (
  `rid` bigint(20) NOT NULL AUTO_INCREMENT,
  `rname` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `type` varchar(20) DEFAULT NULL COMMENT '角色类型',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `u_role` */

insert  into `u_role`(`rid`,`rname`,`type`) values (1,'系统管理员','888888'),(2,'普通用户','666666');

/*Table structure for table `u_role_permission` */

DROP TABLE IF EXISTS `u_role_permission`;

CREATE TABLE `u_role_permission` (
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `pid` bigint(20) DEFAULT NULL COMMENT '权限ID',
  KEY `rid` (`rid`),
  KEY `pid` (`pid`),
  CONSTRAINT `u_role_permission_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `u_role` (`rid`),
  CONSTRAINT `u_role_permission_ibfk_2` FOREIGN KEY (`pid`) REFERENCES `u_permission` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `u_role_permission` */

insert  into `u_role_permission`(`rid`,`pid`) values (1,1),(1,2),(1,3),(1,4),(1,5),(2,5);

/*Table structure for table `u_user` */

DROP TABLE IF EXISTS `u_user`;

CREATE TABLE `u_user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱|登录帐号',
  `pswd` varchar(32) DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` bigint(1) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `u_user` */

insert  into `u_user`(`uid`,`nickname`,`email`,`pswd`,`create_time`,`last_login_time`,`status`) values (1,'等不到天亮等时光','171437912@qq.com','123456','2017-10-18 17:17:20',NULL,NULL),(2,'回忆里待续','jack','123456','2017-10-18 17:22:52',NULL,1),(3,'天王盖地虎','tom','123456','2017-10-23 10:52:45',NULL,1),(4,'小鸡炖蘑菇','json','123456','2017-10-23 14:34:38',NULL,1);

/*Table structure for table `u_user_role` */

DROP TABLE IF EXISTS `u_user_role`;

CREATE TABLE `u_user_role` (
  `uid` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID',
  KEY `uid` (`uid`),
  KEY `rid` (`rid`),
  CONSTRAINT `u_user_role_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `u_user` (`uid`),
  CONSTRAINT `u_user_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `u_role` (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `u_user_role` */

insert  into `u_user_role`(`uid`,`rid`) values (1,2),(2,1),(3,2),(4,2),(2,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
