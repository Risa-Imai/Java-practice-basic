package kitasoft;

public class practice6_2 {
	public static int average(int x, int y) {
		int result = (x + y) / 2;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("平均値を出したい数字を２つ入力してください");
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		System.out.println("結果は：" + average(x, y));
	}
}
