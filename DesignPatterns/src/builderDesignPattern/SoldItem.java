package builderDesignPattern;

public class SoldItem {
	private String name;
	private double price;
	private boolean isPrime;
	private int quantity;
	
	public SoldItem(SoldItemBuilder sb) {
		this.name = sb.getName();
		this.price = sb.getPrice();
		this.isPrime = sb.isPrime();
		this.quantity = sb.getQuantity();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public int getQuantity() {
		return quantity;
	}
	
}
