package practice;

import extend.phone.Phone;

// インターフェースからインターフェースの実装は可能
// implementsしたインターフェースは必ず実装する必要がある
public class FlyingPhone implements Phone, Flying {
	private int minutes;
	
	// コンストラクタ。引数でメンバ変数を初期化
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
	
	/* [Phone]と{Flying]の両インターフェースにdefaultメソッドがあるのでオーバーライドする必要がある。
	 * しないとコンパイルエラーになる。今回の場合は[Flying]インターフェースの処理なので[super]を使用して、
	 * [Flying]インターフェースのdefaultメソッドを呼び出す。 */
	public void powerOff() {
		Flying.super.powerOff();
	}
}
