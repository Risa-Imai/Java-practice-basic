import java.util.*;

public class Kazuate {

	public static void main(String[] args) {
		// 入力準備
		Scanner sc = new Scanner(System.in);
		// コンピュータが数を選ぶ
		int a = (int)(Math.random() * 20) + 1;
		// 数を入力
		System.out.println("当ててごらん：");
		int x = sc.nextInt();
		// 当たるまで繰り返し
		while ( x != a) {
			// はずれのメッセージ
			System.out.println("違うよーん");
			// 数を入力
			System.out.println("当ててごらん");
			x = sc.nextInt();
		}
		// 最後のメッセージ
		System.out.println("当たりです");
	}

}