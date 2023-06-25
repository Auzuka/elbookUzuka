

## システム名：ELBOOK
## テーブル名：EL_RENT
## 作成日：2022/10/15


| No   |     カラム名     |   データ型  | Not Null| デフォルト|備考 |
| ---  | -------------- | --------- | --------| ------ |--------------------------|
| 1    |rent_id         |   int      | ●       |        |auto_increment primary key|
| 2    |user_id         |    int     | ●       |        |                          |
| 3    |book_id         |  int       | ●       |        |                          |
| 4    |rent_day        | timestamp |  ●       |        |                          |
| 5    |return_day      |  timestamp  | ●      |        |                          |
| 6    |dlt_flg          | bollean | ●       |  0       |      0：貸し出し中1：返却済み          |
