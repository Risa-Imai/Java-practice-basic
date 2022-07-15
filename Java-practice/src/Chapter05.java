
public class Chapter05 {
	public static void main(String[] args) {
		long long1 = 9223372036854775807L;
		System.out.println(long1);
		double double1 = 3.14d;
		System.out.println(double1);
		boolean boolean1 = true;
		System.out.println(boolean1);
		Float f = 3.14f;
		System.out.println(f);
		Integer int1 = 1827;
		System.out.println(int1);
		Character c = 'あ';
		System.out.println(c);

		int[] array = new int[] { 10, 20, 50 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int[] array1 = { 0, 10, 20, 30, 40 };
		System.out.println(array1[3]);

		int[] array2 = new int[3]; // 配列の宣言と生成
		array1[0] = 60; // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20; // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 20; // ３番目と同じ値を２番目の要素に代入
		int int2 = array2[2]; // インデックス番号「2」を指定して３番目の要素を取得
		System.out.println(int2);
		int array3[] = null; // []は変数名の後ろでも可
		System.out.println(array3);
	}
}
