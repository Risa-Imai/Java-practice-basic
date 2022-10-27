package kitasoft;

import java.io.*;

public class practice3_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		int chukan = Integer.parseInt(rb.readLine());
		int kimatu = Integer.parseInt(rb.readLine());
		
		if ((chukan >= 60) && (kimatu >= 60)) {
			System.out.println("合格（１）");
		} else if ((chukan + kimatu) >= 130) {
			System.out.println("合格（２）");
		} else if (((chukan + kimatu) >= 100) && ((chukan >= 90) || (kimatu >= 90))){
			System.out.println("合格（３）");
		} else {
			System.out.println("不合格");
		}
		
		if ((chukan >= 60 && kimatu >= 60) || ((chukan + kimatu) >= 130) || ((chukan + kimatu) >= 100 && (chukan >= 90 || kimatu >= 90))) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}
}
