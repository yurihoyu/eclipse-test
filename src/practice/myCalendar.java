package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class myCalendar {

	public static void main(String[] args) throws Exception {

		int date = 1;
		LocalDate d1 = LocalDate.of(2021, 10, date);
		LocalDate result = d1.with(TemporalAdjusters.lastDayOfMonth());

		int lastday = result.getDayOfMonth();

		final var locale = Locale.getDefault();
		for (int i = 0; i < lastday; i++) {
			d1 = LocalDate.of(2021, 10, date);

			String youbi = d1.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
			DayOfWeek w = d1.getDayOfWeek();

			//			if(w == DayOfWeek.SATURDAY) {System.out.println("\\r\\n");}
			System.out.print(d1.getDayOfMonth());
			System.out.print("(");

			System.out.print(youbi);

			System.out.print(")");

			// 土曜日かどうかを判定
			if (w == DayOfWeek.SATURDAY) {
				System.out.println();
			}

			date++;

			//		}

		}

	}
}
