package sukkiri;

import java.io.*;
import java.util.*;

public class Code5_5_1 {
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String lastname = sc.nextLine();
		String firstname = sc.nextLine();
		fullName(lastname, firstname);
	}
	public static void fullName(String lastname,String firstname) {
		System.out.println("苗字：" + lastname + " 名前：" + firstname);
	}
}
// 標準入力をフルで書くと
// String str = new java.util.Scanner(System.in).nextLine();
// int num = new java.util.Scanner(System.in).nextInt();
