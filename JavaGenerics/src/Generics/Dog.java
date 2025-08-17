package Generics;

//T is generic datatype for Animal class which is required to be mentioned while extending it to child class.
//T with Dog<T,S> is same T of Animal.
//The sequence of parent and child class of generic types are same till all the generic types of Parent class
//are not covered.
public class Dog<T,S> extends Animal<T> {
	S subTaskS;
	public void bark() {
		System.out.println("Dog is barking");
	}
}
