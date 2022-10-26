package kitasoft;

import java.io.*;

public class practice3_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(rb.readLine());
		int y = Integer.parseInt(rb.readLine());
		
		if ( x > y ) {
			System.out.println("xはyより大きい。");
		}
	}
}
