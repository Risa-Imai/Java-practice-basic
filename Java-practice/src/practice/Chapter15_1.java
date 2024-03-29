package practice;
// ユークリッドの互除法の計算方法
// 大きい数を小さい数（割った数）で割り、割った数を余りで割る。
// さらに割った数を余りで割り、余りが０になるまで計算する。
// 余りが０になった時の割った数が最大公約数
public class Chapter15_1 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
	}
	
	// ユークリッドの互除法で最大公約数を計算するメソッド
	static int gcd(int a, int b) {
		// b(余り)が0になった時のaが最大公約数
		if (b == 0) {
			return a;
		}
		// 再起呼び出し
		return gcd(b, a % b);
	}
}
