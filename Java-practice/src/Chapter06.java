
public class Chapter06 {
	public static void main(String[] args) {
	int val;
	val = 2 + 5;
	System.out.println(val);
	val++;
	val--;
	System.out.println(val);
	int val1 = 5;
	val = ++val1; // 前置
	System.out.println(val);
	System.out.println(val1);
	val = val1++; // 後置
	System.out.println(val);
	System.out.println(val1);
	val *= 5;
	System.out.println(val);
	boolean bool;
	bool = val == 50;
	System.out.println(bool);
	val += 20;
	bool = val == 50;
	System.out.println(bool);
	bool = val < 50 && val % 10 == 0; // 演算子の左辺と右辺は()で括る
	System.out.println(bool);
	}
}
