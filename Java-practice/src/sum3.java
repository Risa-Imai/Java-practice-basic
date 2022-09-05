
public class sum3 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i += 2) {
			sum = sum + i;
			System.out.println(sum);
		}
		int a = 0;
		int b = 1;
		while(b <= 100) {
			if(b % 2 == 1) {
				System.out.println(a += b);
			}
		b++;
		}
	}
}
