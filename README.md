# ELBOOK2022


ELBOOK2022/src/main/resources/application.properties

```
server.port=8043　 #ポート番号の指定
spring.datasource.url=jdbc:mysql://localhost/ELBOOK2022　　#DB名　下記のSQLを使用する場合変更なし
spring.datasource.username=　　　　        #ローカル環境のDBの名前
spring.datasource.password=   #ローカル環境のDBのパスワード
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```


```mysql

--DBが存在しない場合は、作成をする
CREATE DATABASE ELBOOK2022 ;

USE ELBOOK2022;

/* 下記テーブル作成文 */ 

-- 新テーブルの作成
CREATE  TABLE EL_USER  (
    user_id int(4)  auto_increment not null primary key
  , user_name varchar(30) not null
  , mail varchar(60) not null
  , pass varchar(256) default '9999' not null
  , create_time timestamp
  , delete_flg boolean default 0 not null
  ,authority enum('ADMIN','USER')
 ) ;

  CREATE  TABLE EL_BOOK (
 book_id int(4) auto_increment not null primary key
,book_name varchar(60) not null
,book_author varchar(30) not null
,book_publisher varchar(30) not null
,book_releasetime date
,create_time timestamp
,update_time datetime
,file_name varchar(200) DEFAULT NULL
,stock int
) ;



 CREATE  TABLE EL_RENT (
 rent_id int(12) auto_increment not null primary key
, user_id int(4)  not null
, book_id int(4)  not null
, rent_day timestamp 
, return_day timestamp
, dlt_flg boolean default 0 not null
) ;
 ```

セキュリティ関係の追加
```

show columns from  el_user;

INSERT INTO el_user values (15,'city','test@com','92e7d0ed04e062d134b011232169e07634bb34e4f745a22db05e5a676e778b1d358a028ad7d37b01',now(),0,'ADMIN');

INSERT INTO el_user values (16,'tako','test@com','8173fe759c718bf523c7dd84f8d5aebdb127c20dc823969d64f9e6158df94bdf13a805516efdc6f5',now(),0,'USER');

```
