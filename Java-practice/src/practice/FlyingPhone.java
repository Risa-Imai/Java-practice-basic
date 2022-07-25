package practice;

import extend.phone.Phone;

// インターフェースからインターフェースの実装は可能
// implementsしたインターフェースは必ず実装する必要がある
public class FlyingPhone implements Phone, Flying {
	private int minutes;
	
	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}
	
	// Flyingインターフェースの抽象メソッドを実装
	// オーバーライドする
	public void fly() {
		System.out.println(minutes + " 分間、飛びます。");
	}
	
	// Phoneインターフェースのメソッドを実装
	// オーバーライドする
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	public void powerOff() {
		System.out.println("飛んでいる場合は落下します。");
	}
}
