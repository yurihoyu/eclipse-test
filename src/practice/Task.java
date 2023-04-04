package practice;

public class Task {
	// メンバー変数
	// 日付
	private int date; // インスタンス変数
	// タスク内容
	private String content; // インスタンス変数
	// 状態（trueで完了）
	private boolean done; // インスタンス変数

	// getter setter
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	// コンストラクタを作成
	public Task(int date, String content) {
		this.date = date;
		this.content = content;

	}

	// doneメソッド
	// 状態を完了にする
	public boolean done() {
		done = true;
		System.out.println("タスク「牛乳を買う」を完了します。");
		return done;
	}

	// printメソッド
	// タスク内容を表示する
	public void print() {
		if(done) {
			System.out.println(date + "のタスク「" + content + "」完了しています。");
		}else {
			System.out.println(date + "のタスク「" + content + "」は未完了です。");
		}

	}

}
