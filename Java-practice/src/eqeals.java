
public class eqeals {
	public static void main(String[] args) {
		String str = "夕日";
		
		if (str.equals("夕日")) {
			// Javaでは文字列を比較する時、str == "夕日"だとタチの悪い不具合が起きる
			System.out.println("綺麗な夕日ですね");
		} else {
			System.out.println("雲が出ているので夕日は見えません");
		}
	}
}
