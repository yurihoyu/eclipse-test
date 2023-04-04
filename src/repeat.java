
public class repeat {

	public static void main(String[] args) {
		// while文
        int number = 1;
        // while文：ループ開始
        System.out.println("while文");
        // numberが50未満の場合、ブロックの処理を行なう
        while (number < 50) {
        // ブロック：
        // numberにnumber * 2 を代入して、numberを出力
        number *= 2;

            System.out.println("While01 = " + number);
        }


		// do-while文
		int number2 = 1;
		// do-while文：ループ開始
        System.out.println("do-while文");
		do {
			// ブロック：
			// numberにnumber * 2 を代入して、numberを出力
			number2 *= 2;

			System.out.println("DoWhile01 = " + number2);
			// do-while文：
			// numberが50未満の場合、ブロックの処理をループ実行する
		} while (number2 < 50);


		//拡張for文
		int[] array = { 1, 2, 3, 4, 5 };
        // 拡張for文：
        System.out.println("拡張for文");
        // 配列の要素を順番にnumberに代入し、要素分繰り返す
        for (int number3 : array) {
            // ブロック：numberを出力
            System.out.println("For02 = " + number3);
        }


        //break文
        System.out.println("break文");
        for (int count = 0; count < 5; count++) {
            if (count == 2) {
            // countが2の場合、for文を終了
                break;
            }
            System.out.println("Break01 = " + count);
        }


        //break文
        for (int count = 0; count < 5; count++) {
            if (count == 2) {
            // countが2の場合、この後の処理をスキップ
            continue;
        }
            System.out.println("Continue01 = " + count);
        }

	}

}
