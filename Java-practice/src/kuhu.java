
public class kuhu {
	public static void main(String[] args) {
		int i = 10;
		String square = "■";
		String squ = square * i;
		
		while(i >= 0) {
			String squ = square * i;
			System.out.println(squ);
			i--;
		}
	}
}
