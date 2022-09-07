package kitasoft;

import java.io.*;

public class practice4_3 {
	public static void main(String[] args)throws IOException{
		int x = 1;
		for(int i = 1; i <= 8; i++) {
			x *= 2;
			System.out.println("2の" + x + "乗=" + x);
		}
		for(int a = 1, b = 2; a <= 8; a++, b *= 2) {
			System.out.println("2の" + a + "乗=" + b);
		}
	}
}
