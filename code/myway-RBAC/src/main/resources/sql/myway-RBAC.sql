/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/21 16:28:53                           */
/*==============================================================*/


drop table if exists role;

drop table if exists user;

drop table if exists user_role;

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
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int(24) not null,
   acct                 varchar(24) not null,
   name                 varchar(24) not null,
   createTime           datetime,
   lastLoginTime        datetime,
   mobile               varchar(20),
   enail                varchar(50),
   remark               varchar(200),
   status               varchar(1) not null,
   primary key (id)
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

alter table user_role add constraint FK_Reference_1 foreign key (user_id)
      references user (id) on delete restrict on update restrict;

alter table user_role add constraint FK_Reference_2 foreign key (role_id)
      references role (id) on delete restrict on update restrict;

