/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2018/8/18 21:32:39                           */
/*==============================================================*/


drop table if exists 商品表;

/*==============================================================*/
/* Table: 商品表                                                   */
/*==============================================================*/
create table 商品表 
(
   id                   int                            not null,
   name                 varchar(24)                    null,
   description          varchar(1024)                  null,
   category_id          int                            null,
   price                double                         null,
   stock                double                         null,
   picture_url          varchar(255)                   null,
   constraint PK_商品表 primary key clustered (id)
);

comment on table 商品表 is 
'商品表';

