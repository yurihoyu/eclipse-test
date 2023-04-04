package practice;

public class Chapter7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		MultiThread mt = new MultiThread();
		Thread thread = new Thread(mt);
		thread.start();

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("スレッド" + (i + 1) + "度目の処理");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MultiThread implements Runnable {
	public void run() {
//		for (int i = 0; i < 3; i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.println("スレッド2の" + (i + 1) + "度目の処理");
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
