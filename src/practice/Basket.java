package practice;

public class Basket<E extends Fruit> {

	private E elem;
	private final int tPrice = 100;

	public Basket(E e) {
		elem = e;

	}

	public void replace(E e) {
		elem = e;
	}

	public E get() {
		return elem;
	}

	public void printName() {
		// EはFruitのサブクラスなので、getNameが使えると保証されている
		System.out.println("籠の中身は" + elem.getName() + "です");

	}

	public void printTotalPrice() {
		int totalPrice = tPrice + elem.getPrice();
		System.out.println("籠の中の合計金額は" + totalPrice + "です");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Basket<Apple> aBasket = new Basket<>(new Apple("ふじ", 200));
		aBasket.printTotalPrice();

		Basket<Peach> pBasket = new Basket<>(new Peach("ネクタリン", 300));
		pBasket.printTotalPrice();



	}

}

