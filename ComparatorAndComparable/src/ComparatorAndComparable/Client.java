package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Sid", 25, 98);
		Student s2 = new Student("Harsh", 26, 99);
		Student s3 = new Student("Tejas", 27, 100);
		Student s4 = new Student("Bhakti", 23, 99);
		Student s5 = new Student("Sakshi", 25, 95);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		//here it uses compareTo method of Student class.
		//Limitation of this case is we can't have multiple sorting ways based on marks and name.
		//hence we can use Comparator to implement other logic and pass the comparator to sort function
		Collections.sort(students);
		for(Student student:students) {
			System.out.println(student.nameString+" "+student.ageInteger+" "+student.marksInteger);
		}
		System.out.println("****************************");
		Collections.sort(students,new MarksComparator());
		for(Student student:students) {
			System.out.println(student.nameString+" "+student.ageInteger+" "+student.marksInteger);
		}
		System.out.println("****************************");
		Collections.sort(students,new NameComparator());
		for(Student student:students) {
			System.out.println(student.nameString+" "+student.ageInteger+" "+student.marksInteger);
		}

	}

}
