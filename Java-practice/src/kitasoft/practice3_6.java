package kitasoft;

import java.io.*;

public class practice3_6 {
	public static void main(String[] arts) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(rb.readLine());
		
		if (num % 2 == 0) {
			if(num >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の偶数");
			}
		} else {
			if(num >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		}
	}
}
