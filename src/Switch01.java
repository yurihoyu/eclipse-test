
public class Switch01 {

	// 列挙型
	enum Vals {
		EXCELLENT,
		GOOD,
		POOR,
	};

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Vals val = Vals.EXCELLENT;
		switch (val) {
		case EXCELLENT:
			System.out.println("よくできました！");
			break;
		case GOOD:
			System.out.println("ふつうでした！");
			break;
		default:
			System.out.println("がんばろう！");
		}

	}

}
