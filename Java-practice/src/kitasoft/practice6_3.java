package kitasoft;

import java.io.*;

public class practice6_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		System.out.println(MaxValue(x, MaxValue(y,z)));
	}
	static int MaxValue(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
}
