package kitasoft;

import java.io.*;

public class practice2_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("あなたの年齢を教えてください");
		int age = Integer.parseInt(br.readLine());
		System.out.println("あなたが産まれてから約" + (age * 365) + "日が経過しています");
	}
}
