
public class progate2 {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 6, 9, 13, 16, 21, 26 };
		
		// 奇数の合計を代入する変数
		int oddSum = 0;
		// 偶数の合計を代入する変数
		int evenSum = 0;
		
		// 拡張for文
		for (int number : numbers) {
			// 奇数から割り出すやり方がわからないので偶数から
			if (number % 2 == 0) {
				System.out.println(number);
				evenSum = evenSum + number;
			} else
				oddSum = oddSum + number;
		}
		System.out.println("奇数の和は" + oddSum + "です");
		System.out.println("偶数の和は" + evenSum + "です");
	}
}
