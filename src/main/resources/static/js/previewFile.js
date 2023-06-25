/*
 画像プレビュー
 */
function previewFile(image) {
	//画像ファイルの読み込みクラス
	var fileData = new FileReader();

	//選択した画像ファイルの情報をimgタグのsrc属性に設定
	fileData.onload = (function() {
		//fileReaderで取得した値の結果を入力することでプレビュー表示している
		document.getElementById('preview').src = fileData.result;
	});

	//読み込んだ画像ファイルをURLに変換
	fileData.readAsDataURL(image.files[0]);

}