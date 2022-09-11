package sukkiri;

import java.io.*;
import java.util.*;

public class practice3_3 {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int isHungry = 1;
		System.out.print("好きな食べ物を入力してください:");
		String food = sc.nextLine();
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		}else {
			System.out.println("はらぺこです");
		}
		if(isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}
}
