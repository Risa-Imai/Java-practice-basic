package kitasoft;

import java.io.*;

public class practice4_2 {
	public static void main(String[] args)throws IOException{
		for(int i = 0 ; i <= 27 ; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		for(int j = 1 ; j <= 9 ; j++) {
			System.out.print(( 3 * j ) + " " );
		}
	}
}
