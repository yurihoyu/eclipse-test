package practice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Chapter6 {

	public static void main(String[] args) {
		// Setを生成する場合 (値に順序があるとかぎらない)

		Set<Integer> set = new LinkedHashSet<>();
		// TODO 自動生成されたメソッド・スタブ
		set.add(1);
		set.remove(3);

//		キーと値をペアにして複数のデータを格納できるもの
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "value");
		map.get(2);

	}

}
