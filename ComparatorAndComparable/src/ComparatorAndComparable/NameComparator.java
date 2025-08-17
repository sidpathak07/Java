package ComparatorAndComparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		if(o1.nameString.compareTo(o2.nameString)>0) {
			return 1;
		}else {
			return -1;
		}
	}

}
