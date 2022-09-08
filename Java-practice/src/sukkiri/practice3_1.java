package sukkiri;

import java.io.*;

public class practice3_1 {
	public static void main(String[] args)throws IOException{
		int weight = 60;
		if (weight == 60) {
			System.out.println("あなたの体重は" + weight + "です");
		}
		System.out.println("数字を二つ入力してください");
		int age1 = new java.util.Scanner(System.in).nextInt(),age2 = new java.util.Scanner(System.in).nextInt();
		if ((age1 + age2) * 2 > 60) {
			System.out.println("こんにちは" + (age1 + age2) * 2);
		}
		System.out.println("数字を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		if (age % 2 == 1) {
			System.out.println("こんばんは" + (age));
		}
		String name = new java.util.Scanner(System.in).nextLine();
		if (name.equals("湊")) {
			System.out.println("あなたは湊さんですね");
		}
	}
}
