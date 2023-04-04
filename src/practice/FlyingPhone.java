package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int minutes2;




	public FlyingPhone(int minutes2) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.minutes2 = minutes2;
	}

	@Override
	public void powerOff() {
		// TODO 自動生成されたメソッド・スタブ
		Flying.super.powerOff();
	}
	// プログラムを作成

	@Override
	public void fly(){
		System.out.println(minutes2 + "分間飛びます");

	}



	@Override
	public void call(String number) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");

	}
}