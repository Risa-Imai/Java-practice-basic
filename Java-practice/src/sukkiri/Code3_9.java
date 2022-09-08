package sukkiri;

import java.io.*;
// for文のループを入れ子にして九九の表を出力する
public class Code3_9 {
	public static void main(String[] args)throws IOException{
		for(int i = 1; i < 10; i++) { // iは1～9まで繰り返し
			for(int j = 1; j < 10; j++) { // jも1～9まで繰り返し
				System.out.print(i * j); // 掛け算の結果を出力
				System.out.print(" "); // 空白を出力
			}
			System.out.println(""); // 改行を出力
		}
	}
}
