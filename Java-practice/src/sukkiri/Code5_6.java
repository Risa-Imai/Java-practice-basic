package sukkiri;


// コンパイルエラーなる
public class Code5_6 {
	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add();
	}
	public static void add() {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
