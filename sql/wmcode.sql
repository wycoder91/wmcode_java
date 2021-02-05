drop table if exists wmcode_info;
create table wmcode_info (
                             coder_id        bigint(20)      not null auto_increment    comment '编码id',
                             coder_code     varchar(30)      default 0             comment '编码号',
                             loader_name     varchar(30)     default ''                comment '装载机简称',
                             loader_info     varchar(200)     default ''               comment '装载机详细配置信息',
                             status            char(1)         default '0'              comment '状态（0正常 1停用）',
                             primary key (coder_id)
) engine=innodb auto_increment=1 comment = '整机编码表';

/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2021/1/2 13:47:17                            */
/*==============================================================*/


drop table if exists tb_boom;

drop table if exists tb_bucket;

drop table if exists tb_discharge;

drop table if exists tb_dynamic_forms;

drop table if exists tb_engine;

drop table if exists tb_format;

drop table if exists tb_operation_mode;

drop table if exists tb_product_type;

drop table if exists tb_sale;

drop table if exists tb_special;

drop table if exists tb_tonnage;

drop table if exists tb_trans_style;

drop table if exists tb_transmission;

drop table if exists tb_upgrade;

/*==============================================================*/
/* Table: tb_boom                                               */
/*==============================================================*/
create table tb_boom
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_boom(description, code_num) values
('超短臂','S'),
('标准臂','B'),
('加长臂','C'),
('长臂金刚','J'),
('超长臂','L'),
('特殊臂','T');
/*==============================================================*/
/* Table: tb_bucket                                             */
/*==============================================================*/
create table tb_bucket
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_bucket(description,code_num) values
('标准斗','B'),
('测卸斗','C'),
('岩石斗','Y'),
('煤斗','M'),
('抓木器','Z'),
('抓草机','G'),
('简易除雪铲','S'),
('货叉','H'),
('破碎锤','P'),
('推土铲','T'),
('液控除雪铲','R'),
('岩石叉','F'),
('抱管机','U');
/*==============================================================*/
/* Table: tb_discharge                                          */
/*==============================================================*/
create table tb_discharge
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);

insert into tb_discharge(description,code_num) values
('国Ⅱ','B'),
('国Ⅲ','C'),
('国Ⅳ','G'),
('欧Ⅳ','K');

/*==============================================================*/
/* Table: tb_dynamic_forms                                      */
/*==============================================================*/
create table tb_dynamic_forms
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_dynamic_forms(description,code_num) values
('柴油','A'),
('电池','B'),
('汽油','G'),
('天然气','L');

/*==============================================================*/
/* Table: tb_engine                                             */
/*==============================================================*/
create table tb_engine
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_engine(description,code_num) values
('潍柴','W'),
('重发','C'),
('康明斯','K'),
('上柴','S'),
('道依茨','D'),
('洛拖','L');
/*==============================================================*/
/* Table: tb_format                                             */
/*==============================================================*/
create table tb_format
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_format(description,code_num) values
('煤炭版','CH'),
('沙漠版','DS'),
('极寒版','EC'),
('灵动版','FL'),
('叉装版','FT'),
('重载版','HD'),
('高原版','HL'),
('夹木版','HW'),
('矿石版','MH'),
('矿井版','MW'),
('沙石版','SG'),
('冰雪版','SI'),
('侧卸版','SU'),
('牧场版','MC');
/*==============================================================*/
/* Table: tb_operation_mode                                     */
/*==============================================================*/
create table tb_operation_mode
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_operation_mode(description,code_num) values
('非先导双手柄','J'),
('非先导三手柄','S'),
('简配先导单手柄','A'),
('简配先导双手柄','B'),
('简配先导三手柄','C'),
('卡特先导单手柄','D'),
('卡特先导双手柄','E'),
('卡特先导三手柄','F'),
('三联液控双手柄','G');
/*==============================================================*/
/* Table: tb_optional                                           */
/*==============================================================*/
drop table if exists tb_optional;

create table tb_optional
(
   id                   int not null auto_increment,
   description          varchar(20),
   category             varchar(10),
   optionalItemId          char(1),
   primary key (id)
);
insert into tb_optional(description,category,optionalItemId) values
('空调','1类','1'),
('暖风','1类','2'),
('GPS','2类','3'),
('金城桥','3类','4'),
('3方标准斗','4类','5'),
('3.3方标准斗','4类','6'),
('双刃版标准斗','4类','7'),
('4方煤斗','4类','8'),
('4方(双刃版)煤斗','4类','9');
/*==============================================================*/
/* Table: tb_product_type                                       */
/*==============================================================*/
create table tb_product_type
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_product_type(description,code_num) values
('山推','L'),
('德工','D');
/*==============================================================*/
/* Table: tb_sale                                               */
/*==============================================================*/
create table tb_sale
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_sale(description,code_num) values
('国内','0'),
('国外','1');
/*==============================================================*/
/* Table: tb_special                                            */
/*==============================================================*/
create table tb_special
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_special(description,code_num) values
('无','A');
/*==============================================================*/
/* Table: tb_tonnage                                            */
/*==============================================================*/
create table tb_tonnage
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_tonnage(description,code_num) values
('2吨','2'),
('3吨','3'),
('4吨','4'),
('5吨','5'),
('6吨','6'),
('7吨','7'),
('8吨','8'),
('9吨','9'),
('12吨','A');
/*==============================================================*/
/* Table: tb_trans_style                                        */
/*==============================================================*/
create table tb_trans_style
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_trans_style(description,code_num) values
('液力传动','A'),
('机械传动','M'),
('静液压传动','H'),
('电传动','E');
/*==============================================================*/
/* Table: tb_transmission                                       */
/*==============================================================*/
create table tb_transmission
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_transmission(description,code_num) values
('杭齿双变','H'),
('山推双变','S'),
('青州双变','Q'),
('WG180箱','W'),
('4WG200箱','G'),
('YB230','Y'),
('金城双变','J');
/*==============================================================*/
/* Table: tb_upgrade                                            */
/*==============================================================*/
create table tb_upgrade
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_upgrade(description,code_num) values
('无','1'),
('2','2'),
('3','3'),
('4','4'),
('5','5'),
('6','6'),
('7','7'),
('8','8'),
('9','9');
/*==============================================================*/
/* Table: tb_wheel                                              */
/*==============================================================*/
drop table if exists tb_wheel;
create table tb_wheel
(
   id                   int not null auto_increment,
   description          varchar(20),
   code_num             varchar(10),
   primary key (id)
);
insert into tb_wheel(description,code_num) values
('短轴距_2','2'),
('中轴距_3','3'),
('中轴距_5','5'),
('长轴距_6','6'),
('长轴距_8','8'),
('长轴距_9','9');
