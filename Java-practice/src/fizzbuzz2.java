
public class fizzbuzz2 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num < 100) {
			num++;
			if (num % 15 == 0) {
				System.out.println("出力された数値：" + num + " => FizzBuzz");
			} else if (num % 5 == 0) {
				System.out.println("出力された数値：" + num + " => Buzz");
			} else if (num % 3 == 0) {
				System.out.println("出力された数値：" + num + " => Fizz");
			} else {
				System.out.println("出力された数値：" + num);
			}
		}
	}
}
