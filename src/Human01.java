
public class Human01 {

	// メンバー変数
		public String name;
		public int age;

	    // 引数なしのコンストラクタ
		public Human01() {
			name = "山田";
			age = 20;
		}
	    // 引数2つのコンストラクタ
		public Human01(String name, int age) {
			this.name = name;
			this.age = age;
		}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human01 h1 = new Human01("さゆり", 18);
		System.out.println("名前は" + h1.name + "で、年齢は" + h1.age + "です。");

		Human01 h2 = new Human01();
		System.out.println("名前は" + h2.name + "で、年齢は" + h2.age + "です。");


	}

}
