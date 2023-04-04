package practice;

import java.util.Scanner;

public class Chapter20_1 {
	public static void main(String[] args) {
		new Thread(new Printer()).start(); // スレッドの開始

		System.out.println("キーボードで入力して下さい");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine(); // キーボード入力
			System.out.println(str);
		}
		System.out.println("入力終了");
	}

	static class Printer implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);// 1秒待つ
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
