package practice;

import java.util.Scanner;

public class Chapter18 {

	public static void main(String[] args) {



		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("入力してください");
			String line = sc.nextLine();
			if(line.equals("exit")){
				sc.close();
				break;
			}else {
				sb.append(line);
			}

		}

		String s = sb.toString();
		System.out.println(s);

	}

}
