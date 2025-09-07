package builderDesignPattern;

public class SoldItem {
	private String name;
	private double price;
	private boolean isPrime;
	private int quantity;
	
	private SoldItem(SoldItemBuilder sb) {
		this.name = sb.getName();
		this.price = sb.getPrice();
		this.isPrime = sb.isPrime();
		this.quantity = sb.getQuantity();
		// TODO Auto-generated constructor stub
	}

	public static SoldItemBuilder getBuilder() {
		return new SoldItemBuilder();
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
	
	public static class SoldItemBuilder {
		private String name;
		private double price;
		private boolean isPrime;
		private int quantity;
		

		public double getPrice() {
			return price;
		}

		public SoldItemBuilder setPrice(double price) {
			this.price = price;
			return this;
		}

		public String getName() {
			return name;
		}

		public SoldItemBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public boolean isPrime() {
			return isPrime;
		}

		public SoldItemBuilder setPrime(boolean isPrime) {
			this.isPrime = isPrime;
			return this;
		}

		public int getQuantity() {
			return quantity;
		}

		public SoldItemBuilder setQuantity(int quantity) {
			this.quantity = quantity;
			return this;
		}
		
		public SoldItem build() {
			return new SoldItem(this);
		}
	}
	
}
