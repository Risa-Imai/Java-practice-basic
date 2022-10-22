package sukkiri;

// int型配列を受け取り、すべての要素を表示するメソッド
public class Code5_12 {
	public static void printArray(int[] array) {
		// 拡張for文
		for (int element : array) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array); // 配列を渡す
	}
}
