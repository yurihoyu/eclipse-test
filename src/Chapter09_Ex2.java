
public class Chapter09_Ex2 {

	public static void main(String[] args) {
		// 実行
		int a = 976;
		int b = 427;
		System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
	}

	// ユークリッドの互除法で最大公約数を計算するメソッド
	static int gcd(int a, int b) {

		// 大きい方から小さい方を割った余を求める
		int c = a % b;

		// 割り切れていれば、それを返す
		if (c == 0) {
			return b;
		}

		// 割り切れなければ再帰的に自信を呼び出す
		c = gcd(b, c);

		return c;

	}

}
