package kitasoft;

import java.io.*;

public class practice3_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(rb.readLine());
		
		if (num % 2 == 0) {
			System.out.println("偶数です");
		} else if (num % 2 == 1){
			System.out.println("奇数です");
		} else {
			System.out.println("終わり");
		}
	}
}
