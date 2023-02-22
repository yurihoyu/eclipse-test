
public class Null01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String string1;
		// ”あいう”の文字数を出力
		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		// ””（空文字）の文字数を出力
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		// nullの変数を参照するとNullPointerExceptionのエラー
//		string1 = null;
//		System.out.println(string1 + "の文字数：" + string1.length());


		Integer integer1 = 5;                   // オートボクシング
		System.out.println(integer1);
		Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
		System.out.println(integer2);
		int int1 = integer1; // アンボクシング
		System.out.println(int1);
		int int2 = integer2.intValue();  // 明示的なアンボクシング
		System.out.println(int2);


	}

}
