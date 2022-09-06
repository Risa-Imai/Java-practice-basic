package kitasoft;

import java.io.*;

public class practice4_1 {
	public static void main(String[] args) throws IOException {
		int i = 1;
		while(i <= 10) {
			System.out.println(i + ":SPAM");
			i++;
		}
		for(int j = 0; j < 10; j++) {
			System.out.println(j + ":SPAMEX");
		}
	}
}
