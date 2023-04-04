package dayOfWeek;

public enum DayOfWeek {

	// それぞれに値段を指定する（フィールドなどを定義する場合、最後にセミコロンを付ける）
	SUN("日"), MON("月"), TUE("火"), WED("水"), THU("木"), FRI("金"), SAT("土");

	//		  // 値段を保持するフィールド
	private String dayOfWeek;

	// privateコンストラクタを追加。引数はint型の値段。
	private DayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	// 値段を取得するメソッドを追加
	public String getDayOfWeek() {
		return dayOfWeek;
	}
}
