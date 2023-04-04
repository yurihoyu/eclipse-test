package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<Fruits> fruits = new ArrayList<>();
		fruits.add(new Fruits("りんご", 7));

		fruits.add(new Fruits("みかん", 15));
		fruits.add(new Fruits("いちご", 4));
		fruits.add(new Fruits("メロン", 8));
		fruits.add(new Fruits("ぶどう", 20));
//		// 10個以下に絞り込まれたリストを作る
//		List<Fruits> filtered = new ArrayList<>();
//		// 拡張for文でfruitsをループ
//		for (Fruits fruit : fruits) {
//			// if文で10個以下に絞る
//			if (fruit.getQuantity() <= 10) {
//				// 絞り込まれたリストに追加
//				filtered.add(fruit);
//			}
//		}
//		// 20個ずつ追加する
//		List<Fruits> ordered = new ArrayList<>();
//		for (Fruits fruit : filtered) {
//			ordered.add(fruit.order(20));
//		}
//
//		// 個数が少ない順に並べ替える
//		ordered.sort(new Comparator<Fruits>() {
//			@Override
//			public int compare(Fruits f1, Fruits f2) {
//				return f1.getQuantity() - f2.getQuantity();
//			}
//		});
//
//		// 絞り込んで並べ替えたリストを拡張for文でループしながら出力する
//		for (Fruits fruit : ordered) {
//			// 標準出力
//			System.out.println(fruit);
//		}

		// Stream APIとラムダ式を使って記述
		fruits.stream() // Streamを生成
				.filter(f -> f.getQuantity() <= 10) // 中間操作1: 個数が10個以下のものを抽出
				.map(f -> f.order(20)) // 中間操作2: 20個ずつ発注
				.sorted((f1, f2) -> f1.getQuantity() - f2.getQuantity()) // 中間操作3: 個数の少ない順に並び替え
				.forEach(System.out::println); // 終端操作: 標準出力

	}

}
