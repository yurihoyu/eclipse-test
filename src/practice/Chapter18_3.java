package practice;

import java.util.regex.Pattern;

public class Chapter18_3 {

	public Chapter18_3() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(isZipCodeHyphen("573-0098"));
		System.out.println(isPhoneNumber("080-7654-9876"));
		System.out.println(isTime("23:08"));

	}


	/**
	 * 郵便番号チェック
	 * @param value 検証対象の値
	 * @return 結果(true:郵便番号､false:郵便番号ではない)
	 */
	public static boolean isZipCodeHyphen(String value) {
	    boolean result = false;
	    if (value != null) {
	        Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
	        result = pattern.matcher(value).matches();
	    }
	    return result;
	}


	/**
	 * 携帯電話番号チェック
	 * @param value 検証対象の値
	 * @return 結果（true：携帯電話番号、false：携帯電話番号ではない）
	 */
	public static boolean isPhoneNumber(String value) {
	    boolean result = false;
	    if (value != null) {
	        Pattern pattern = Pattern.compile("0[7-9]0-[0-9]{4}-[0-9]{4}");
	        result = pattern.matcher(value).matches();
	    }
	    return result;
	}

	/**
	 * 時刻チェック
	 * @param value 検証対象の値
	 * @return 結果（true：時刻、false：時刻ではない）
	 */
	public static boolean isTime(String value) {
	    boolean result = false;
	    if (value != null) {
	        Pattern pattern = Pattern.compile("^([0-1][0-9]|[2][0-3]):[0-5][0-9]$|^([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
	        result = pattern.matcher(value).matches();
	    }
	    return result;
	}

}

