package practice;

public class Fruits{

	// 名前
	  private String name;

	  // 在庫数
	  private int quantity;

	  // 名前と在庫数を引数にしたコンストラクタ
	  public Fruits(String name, int quantity) {
	    this.name = name;
	    this.quantity = quantity;
	  }

	  // 在庫数を増やしたフルーツを返すメソッド
	  public Fruits order(int quantityToAdd) {
	    return new Fruits(this.name, this.quantity + quantityToAdd);
	  }

	  // 出力用にtoStringをオーバーライド
	  @Override
	  public String toString() {
	    return name + ": " + quantity + "個";
	  }

	  public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	}


