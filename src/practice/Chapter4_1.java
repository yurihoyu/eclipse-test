package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chapter4_1 {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();

		// LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();

		list1.add("りんご");
		list1.add("みかん");
		list1.add(0, "バナナ");


		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));

		list1.remove(0); //戻り値は"りんご"

		System.out.println(list1.size());

	}

}
