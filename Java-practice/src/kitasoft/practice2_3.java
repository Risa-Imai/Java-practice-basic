package kitasoft;

import java.io.*;

public class practice2_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		System.out.println(x);
		System.out.println(x * x);
		System.out.println(x * x * x);
		
		System.out.println(Math.pow(x,1));
		System.out.println(Math.pow(x,2));
		System.out.println(Math.pow(x,3));
	}
}
