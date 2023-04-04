
public class Chapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		int型の変数「val」宣言。同時に「2 + 5」の結果を代入
		int val = 2+5;
		System.out.println(val);

		val++;
		System.out.println(val);

//		val = val*5;
		val *= 5;
		System.out.println(val);

//		boolean型の変数「bool」を宣言。同時に「valは50と等しい」の結果を代入
//		boolean bool = val==50;
		boolean bool = (val==50);
		System.out.println(bool);

//		変数「bool」に「valは50未満」 且つ 「valを10で割った余りが0」の結果を代入
		bool = val<50 && val%10==0;
		bool = (val<50) && (val%10==0);
		System.out.println(bool);




	}

}
