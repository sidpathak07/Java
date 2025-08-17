package ComparatorAndComparable;

public class Student implements Comparable<Student> {
	String nameString;
	Integer ageInteger;
	Integer marksInteger;
	public Student(String name,Integer age,Integer marks) {
		this.nameString = name;
		this.ageInteger = age;
		this.marksInteger = marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//the object which is calling is the 1st object and other object is the 2nd Object
		//1st object gets swaped with 2nd if return 1
		//both are not swaped if return -1
		//DESC SORT According to age
		/*if(this.ageInteger>o.ageInteger) {
			return -1;
		}else {
			return 1;
		}*/
		
		//ASC SORT According to age
		if(this.ageInteger>o.ageInteger) {
			return 1;
		}else {
			return -1;
		}
	}

}
