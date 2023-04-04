package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Chapter4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// HashMapを生成する場合(キーがInteger、値がString)
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// TreeMapを生成する場合(キー、値共にString)
		Map<String, String> map2 = new TreeMap<String, String>();

		// 要素を追加する
		map1.put(0, "ぶどう");
		map1.put(3, "もも");

		// 登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");

		System.out.println(map1);
		//{0=マスカット, 3=もも}

		System.out.println(map1.get(0));
		//マスカット

		System.out.println(map1.containsKey(0));
		//true;

		//指定したキーの要素を削除する
		map1.remove(1);
		//そのキーはないのでnullを返す

	}

}
