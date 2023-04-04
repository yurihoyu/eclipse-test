package dayOfWeek;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("曜日を入力して下さい：");
		String week = new Scanner(System.in).nextLine();
		// 以下に処理を記述
		switch (week) {
		case "日":
			//処理
			System.out.println(DayOfWeek.SUN.getDayOfWeek()+"曜日です");
			break;
		case "月":
			//処理
			System.out.println(DayOfWeek.MON.getDayOfWeek()+"曜日です");
			break;
		case "火":
			//処理
			System.out.println(DayOfWeek.TUE.getDayOfWeek()+"曜日です");
			break;

		case "水":
			//処理
			System.out.println(DayOfWeek.WED.getDayOfWeek()+"曜日です");
			break;
		case "木":
			//処理
			System.out.println(DayOfWeek.THU.getDayOfWeek()+"曜日です");
			break;

		case "金":
			//処理
			System.out.println(DayOfWeek.FRI.getDayOfWeek()+"曜日です");
			break;

		case "土":
			//処理
			System.out.println(DayOfWeek.SAT.getDayOfWeek()+"曜日です");
			break;
		}

	}

}
