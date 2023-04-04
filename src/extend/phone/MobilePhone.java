package extend.phone;

public class MobilePhone implements Camera, Phone {

	private String number;

	public MobilePhone(String number) {
		this.number = number;
	}

	@Override
	public void call(String number) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.number + " から " + number + " に電話をかけます。");

	}

	@Override
	public void takePicture() {
		System.out.println("写真をとります。");

	}

}
