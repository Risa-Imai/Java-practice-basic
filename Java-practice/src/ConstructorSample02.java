
class ConstructorSample02 {
	String name;
	
	ConstructorSample02(String str) {
		name = str;
	}
	
	public static void main(String[] args) {
		ConstructorSample02 sample01 = new ConstructorSample02("sample");
		ConstructorSample02 sample02 = new ConstructorSample02("サンプル");
		
		System.out.println(sample01.name);
		System.out.println(sample02.name);
	}
}
