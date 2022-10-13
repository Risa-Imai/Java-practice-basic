
public class MultArray {
	public static void main(String[] args) {
		// int[][] Array = new int[2][3];
		
		int[][] Array = {{10, 20, 30}, {40, 50, 60}};
		
		System.out.println(Array[0][0] + "点");
		System.out.println(Array[0][1] + "点");
		System.out.println(Array[0][2] + "点");
		System.out.println(Array[1][0] + "点");
		System.out.println(Array[1][1] + "点");
		System.out.println(Array[1][2] + "点");
		
		System.out.println("Array.length：" + Array.length);
		System.out.println("Array[0].length：" + Array[0].length);
	}
}
