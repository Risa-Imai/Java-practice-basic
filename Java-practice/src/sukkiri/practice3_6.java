package sukkiri;

import java.util.*;
import java.io.*;

public class practice3_6 {
	public static void main(String[] args)throws IOException{
		System.out.println("【数あてゲーム】");
		int ans = new Random().nextInt(8);
		for(int i = 0; i <= 4; i++) {
			System.out.println("数字を入力してください");
			int num = new Scanner(System.in).nextInt();
			if(num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}
