
class ConstructorSample01 {
	ConstructorSample01() {
		System.out.println("ConstructorSample01のコンストラクタ");
	}
	
	public static void main(String[] args) {
		System.out.println("コンストラクタ呼出し前");
		new ConstructorSample01();
		System.out.println("コンストラクタ呼出し後");
	}
}
