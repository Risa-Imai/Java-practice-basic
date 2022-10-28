package pai;

import java.io.*;
import java.util.*;

public class C086 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = s.replaceAll("[AIUEOaiueo]", "");
		System.out.println(result);
	}
}
