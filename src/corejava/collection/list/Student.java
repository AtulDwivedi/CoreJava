package corejava.collection.list;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	private String name;
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	
	public Student(int rollNo, String name, String course) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+rollNo+" "+name+" "+course+")";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getRollNo() - o.getRollNo();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getRollNo() == ((Student)obj).getRollNo();
	}
	
	
	
}
