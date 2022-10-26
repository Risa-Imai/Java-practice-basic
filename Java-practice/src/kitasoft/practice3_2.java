package kitasoft;

import java.io.*;

public class practice3_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(rb.readLine());
		int y = Integer.parseInt(rb.readLine());
		
		if(x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
}
