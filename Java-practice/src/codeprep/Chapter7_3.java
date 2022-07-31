package codeprep;

import java.util.Scanner;

public class Chapter7_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		putMethod(i);

		}
	
		public static void putMethod(int i) {
			while (i < 10) {
			System.out.println(i);
			i += 2;			
		}
	}
}
