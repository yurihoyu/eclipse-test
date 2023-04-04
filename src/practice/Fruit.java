package practice;

abstract class Fruit {
int price;
String name;

public Fruit(String name, int price) {
	this.name = name;
	this.price = price;
}

abstract protected String getName();

abstract protected  int getPrice();

}
