package sukkiri;

public class practice4_4 {
	public static void main(String[] args) {
		int[] numbers = {3,4,9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int m = 0; m < numbers.length; m++) {
			if(numbers[m] == input) {
				System.out.println("アタリ！");
			}
		}
//		for (int i : numbers ) {
//			if(i == input) {
//				System.out.println("アタリ！");
//			}
//		}
	}
}
