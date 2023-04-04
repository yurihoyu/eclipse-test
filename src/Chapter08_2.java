
public class Chapter08_2 {
	// 列挙型
	enum Vals {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,
	};

	public static void main(String[] args) {
		Vals val = Vals.Sunday;
		switch (val) {
		case Sunday:
			System.out.println("日曜日");
			break;
		case Monday:
			System.out.println("月曜日");
			break;
		case Tuesday:
			System.out.println("火曜日");
			break;
		case Wednesday:
			System.out.println("水曜日");
			break;
		case Thursday:
			System.out.println("木曜日");
			break;
		case Friday:
			System.out.println("金曜日");
			break;
		case Saturday:
			System.out.println("土曜日");
			break;

		default:
			System.out.println("曜日ではありません");

		}

//		デフォルトをわすれた

	}

}
