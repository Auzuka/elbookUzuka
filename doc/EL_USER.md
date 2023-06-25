## システム名：ELBOOK
## テーブル名：EL_USER
## 作成日：2022/10/01


| No   |     カラム名     |   データ型  | Not Null| デフォルト|備考 |
| ---  | -------------- | ---------  | --------| ------ |--- |
| 1    |user_id         |    int     | ●       |        |auto_increment,primarykey    |
| 2    |user_name       |varchar(30) | ●       |        |    |
| 3    |mail            |varchar(60) | ●       |        |    |
| 4    |pass            |varchar(256)| ●       |   9999 |    |
| 5    |create_time     | timestamp  | ●       |        |    |
| 6    |delete_flg      | timestamp  | ●       |0       |0:初期値　1:削除    |
| 7    |authority       | enum       | ●       |        |ADMIN　USER   |
