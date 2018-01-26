/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/26 21:45:49                           */
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
   id                   int(24) not null auto_increment,
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
   id                   int(24) not null auto_increment,
   acct                 varchar(24) not null,
   name                 varchar(24) not null,
   createTime           datetime,
   lastLoginTime        datetime,
   mobile               varchar(20),
   email                varchar(50),
   description          varchar(256),
   status               varchar(1) not null,
   primary key (id)
);

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
   id                   int(24) not null auto_increment,
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

