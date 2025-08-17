package ComparatorAndComparable;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//ASC order
		if(o1.marksInteger>o2.marksInteger) {
			return 1;
		}else {
			return -1;
		}
	}

}
