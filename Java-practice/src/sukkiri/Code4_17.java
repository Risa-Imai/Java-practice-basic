package sukkiri;

// nullを使って「参照を切る」

public class Code4_17 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		array = null;
		// nullにした変数には代入できない
		array[0] = 10;
	}
}
