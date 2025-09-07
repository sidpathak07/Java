package builderDesignPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SoldItemBuilder sBuilder = new SoldItemBuilder();
		sBuilder.setName("Toy");
		sBuilder.setPrice(10d);
		sBuilder.setPrime(false);
		sBuilder.setQuantity(5);
		
		SoldItem soldItem = new SoldItem(sBuilder);
		System.out.println(soldItem.getName());*/
		SoldItem soldItem = SoldItem
							.getBuilder()
							.setName("Toy")
							.setPrice(10d)
							.setPrime(false)
							.setQuantity(5)
							.build();
		
		
		System.out.println(soldItem.getName()+" "+soldItem.getPrice());
		
		MessageBuilder msgBuilder = MessageBuilder
									.getBuilder()
									.setContent("Text")
									.setDelivered(false)
									.setMessageType(MessageType.TEXT)
									.setRecipient("Sid")
									.setSender("Harsh")
									.setTimestamp(15)
									.build();
		System.out.println(msgBuilder.getSender());
	}

}
