package codeprep;

import java.util.Scanner;

// 三項演算子を使う
// 三項演算子とはif文の略記法で条件式の結果によって返り値を切り替えることができる
public class Chapter6_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		// [条件式] ? [trueの場合の返り値] : [falseの場合の返り値]
		String msg = num % 5 == 0 ? "numは5で割り切れます。" : "numは5では割り切れません";
		System.out.println(msg);
	}
}
