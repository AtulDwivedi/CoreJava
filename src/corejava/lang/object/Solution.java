package corejava.lang.object;

public class Solution {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Atul");
		Employee emp1Copy = emp1;
		System.out.println(objectEquality(emp1, emp1Copy));
		
		Employee emp1Duplicate = new Employee(101, "Atul");
		System.out.println(objectEquality(emp1, emp1Duplicate));
		
		Employee emp2 = new Employee(102, "Anuj");
		System.out.println(objectEquality(emp1, emp2));
	}
	
	static boolean objectEquality(Employee emp1, Employee emp2){
		boolean result = false;
		result = emp1.equals(emp2);
		return result;
	}
}
