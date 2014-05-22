package corejava.collection.list;

import java.util.Comparator;

public class SortOnCourse implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getCourse().compareTo(o2.getCourse());
	}
}
