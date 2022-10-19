package sukkiri;

public class Code4_16 {
	public static void main(String[] args) {
		boolean judge = true;
		if (judge == true) {
			int[] array = {1, 2, 3};
		}
	}
}
// ガベージコレクション
// ブロック変数の中で作成された配列はブロック外では使用する事が出来ないが
// メモリとしては残り続ける
// Javaはガベージコレクションを使って使用していないメモリは自動的に削除してくれる機能が備わっている