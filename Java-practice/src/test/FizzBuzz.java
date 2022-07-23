package test;

public class FizzBuzz {
	public static void main(String[] args) {
		int number = 4;
		if (number % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if (number % 5 == 0) {
			System.out.println("Buzz");
		} else if (number % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println("出力された数字は" + number + "です");
		}
	}
}
