package sukkiri;

import java.io.*;
import java.util.*;

public class practice3_4 {
	public static void main(String[] args)throws IOException{
		boolean tenki = true;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		}else 
			// 15行目を追加する場合は12行目のelseに{}を追加する必要がある
			// 1行なら{}が無くても問題なく動く
			System.out.println("DVDをみます");
			// System.out.println("寝ます");
	}
}
