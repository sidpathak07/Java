package Generics;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> pair = new Pair<String, Integer>("Sid", 10);
		pair.show();
		//we have to pass the datatype before the method call.
		Pair.<Integer>showK(10);
		//also we can normally call Java will consider it in this way Pair.<Object>showK("String")
		Pair.showK("String");
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		call(dogs);
		
	}
	//wild card can be used to send child classes which extends mentioned parent 
	//in our case Animal is parent class extended by Dog. Hence we can send list<Dog> without error
	public static void call(List<? extends Animal> animals) {
		for(Animal animal:animals) {
			animal.eat();
		}
	}

}
