package sukkiri;

public class Code5_5 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		add(x, y);
		add(100, 20);
		add(200, 50);
	}
	
	// 複数の値を受け取るaddメソッド
	public static void add(int x,int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
