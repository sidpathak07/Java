package builderDesignPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoldItemBuilder sBuilder = new SoldItemBuilder();
		sBuilder.setName("Toy");
		sBuilder.setPrice(10d);
		sBuilder.setPrime(false);
		sBuilder.setQuantity(5);
		
		SoldItem soldItem = new SoldItem(sBuilder);
		System.out.println(soldItem.getName());
	}

}
