/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2018/6/20 23:46:55                           */
/*==============================================================*/


drop table if exists sys_menu;

/*==============================================================*/
/* Table: sys_menu                                              */
/*==============================================================*/
create table sys_menu 
(
   id                   bigint                         not null,
   parent_id            bigint                         null,
   name                 varchar(50)                    null,
   url                  varchar(200)                   null,
   type                 varchar(50)                    null,
   icon                 varchar(200)                   null,
   order_num            int                            null,
   create_time          datetime                       null,
   modify_time          datetime                       null,
   constraint PK_SYS_MENU primary key clustered (id)
);

