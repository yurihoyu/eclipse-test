package practice;

public class Apple extends Fruit{

		public Apple(String name, int price) {
			super(name, price);
			// TODO 自動生成されたコンストラクター・スタブ
		}

		@Override
		protected String getName() {
			return name;
		}

		@Override
		protected int getPrice() {
			// TODO 自動生成されたメソッド・スタブ
			return price;
		}

}
