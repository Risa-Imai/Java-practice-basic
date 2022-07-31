import java.util.Scanner;

public class programPractice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
	}
	
	static int sign_number(int n) {
		if(n > 0) {
			for(int i = n; i >= 0; i--) {
				System.out.println(i);
			}
		} else {
			for(int i = n; i <= 0; i++) {
				System.out.println(i);
			}
		} return n;
	}
}
