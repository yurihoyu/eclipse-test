package practice;

public class Human_b {

	//内部クラスh_footの中に、蹴るメソッドを定義
	public class h_foot {
		public void kick() {
			System.out.println("蹴る");
		}
	}

	//実行
	public static void main(String[] args) {
		Human_b b = new Human_b();
		Human_b.h_foot f = b.new h_foot();
		f.kick();
	}

}
