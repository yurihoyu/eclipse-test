package practice;

public class Chapter18_2 {

	public Chapter18_2() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] strings = new String[100];


		for(int i =0; i<100; i++) {
			String s = Integer.toString(i+1);
			strings[i] = s;

		}

        String str = String.join(",", strings);
        System.out.println(str);

        String[] numbers = str.split(",");
        for (String num : numbers ) {
            System.out.println(num);
        }




	}

}
