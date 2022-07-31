package practice;

import java.util.Scanner;

public class Chapter15_1_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
	}
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
}

