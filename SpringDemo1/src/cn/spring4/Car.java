package cn.spring4;

public class Car {
	private String name;
	private Double price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
}