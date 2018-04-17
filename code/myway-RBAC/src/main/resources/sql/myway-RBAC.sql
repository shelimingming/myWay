/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/4/16 20:33:53                           */
/*==============================================================*/


drop table if exists auth;

drop table if exists role;

drop table if exists role_auth;

drop table if exists user;

drop table if exists user_auth;

drop table if exists user_role;

/*==============================================================*/
/* Table: auth                                                  */
/*==============================================================*/
create table auth
(
   id                   int(24) not null,
   name                 varchar(24),
   description          varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   id                   int(24) not null,
   name                 varchar(24) not null,
   description          varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: role_auth                                             */
/*==============================================================*/
create table role_auth
(
   role_id              int(24),
   auth_id              int(24)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int(24) not null,
   acct                 varchar(24) not null comment '账户',
   name                 varchar(24) not null comment '用户名',
   mobile               varchar(20) comment '手机号',
   email                varchar(50) comment '邮箱',
   description          varchar(256) comment '描述信息',
   status               varchar(1) not null comment '状态 0:禁用，1:正常',
   password             varchar(256) comment '密码',
   createTime           datetime comment '创建时间',
   lastLoginTime        datetime comment '最近登录时间',
   primary key (id)
);

alter table user comment '用户表';

/*==============================================================*/
/* Table: user_auth                                             */
/*==============================================================*/
create table user_auth
(
   id                   int(24),
   user_id              int(24),
   auth_id              int(24)
);

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   id                   int(24) not null,
   user_id              int(24),
   role_id              int(24),
   primary key (id)
);

alter table user_auth add constraint FK_Reference_3 foreign key (id)
references user (id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_1 foreign key (user_id)
references user (id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_2 foreign key (role_id)
references role (id) on delete restrict on update restrict;

