package Generics;

// java considers the datatypes in same sequence as they are passed
// 1st arg to 1st var 2nd arg to 2nd var we cannot interchange the datatype sequence.
public class Pair<A,B> {
	A firstA;
	B secondB;
	
	public Pair(A a,B b){
		this.firstA = a;
		this.secondB = b;
	}
	
	public void show() {
		System.out.println("firstA: "+firstA+" secondB: "+secondB);
	}
	//we can use generics for static methods too in following manner
	static <K> void showK(K k) {
		System.out.println(k);
	}
}
