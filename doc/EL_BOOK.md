## システム名：ELBOOK
## テーブル名：EL_BOOK
## 作成日：2022/10/01


| No   |     カラム名     |   データ型  | Not Null| デフォルト|備考 |
| ---  | -------------- | ---------- | --------| ------ |--------------------------|
| 1    |book_id         |    int     | ●       |        |auto_increment primary key|
| 2    |book_name       |varchar(60) | ●       |        |                          |
| 3    |book_author     |varchar(30) | ●       |        |                          |
| 4    |book_publisher  |varchar(30) | ●       |        |                          |
| 5    |book_releasetime|   date     | ●       |        |                          |
| 6    |create_time     | timestamp  | ●       |        |                          |
| 7    |update_time     | datetime   | ●       |        |                          |
| 8    |stock           |    int     | ●       |        |                          |
| 9    |file_name       |varchar(200)| ●       |        |                          |
