package sukkiri;

public class Code4_13 {
	public static void main(String[] args) {
		// 従来のfor文
		int[] scores = {20, 30, 40, 50, 60};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		// 拡張for文
		for (int i : scores) {
			System.out.println(i);
		}
	}
}
