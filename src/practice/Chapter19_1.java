package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_1 {

	// TODO 自動生成されたコンストラクター・スタブ
	public static void main(String[] args) {
		FileWriter fw = null;
		//	ファイル処理はtryブロックの中に書き、finallyブロックでクローズする
		try {
			//	1つ目の引数はファイル名
			//	2つ目の引数はtrue＝追加書き込み可
			fw = new FileWriter("C:\\Users\\alley\\OneDrive\\デスクトップ\\pleiades\\workspace_dmm\\test.txt", true);
			fw.write("あいうえお");
		} catch (IOException e) {
			System.out.println("エラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
