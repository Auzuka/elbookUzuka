/*
モーダル画面にIDを受け渡すロジック
*/
let delinfo = function(myvalue) {
	const modalresult = document.getElementById('deluser');
	/*
	 console.log(myvalue);
	 console.log(modalresult);
	 */
	modalresult.setAttribute('value', myvalue);
}