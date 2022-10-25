package kitasoft;

public class practice1_7 {
	public static void main(String[] args) {
		int x = 3, y = 7;
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x=" + x + ",y=" + y);
	}
}
