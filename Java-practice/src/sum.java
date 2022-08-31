
public class sum {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		while(b <= 100) {
			if(b % 2 == 0) {
				a += b;
			}
			b++;
		}
		System.out.println(a);
	}
}
