package corejava.collection.map;

import java.util.Map;
import java.util.TreeMap;

import corejava.pojo.Employee;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<Integer, Employee> empMap  =new TreeMap<Integer, Employee>();
		empMap.put(2, new Employee(101, "Atul", 01));
		empMap.put(5, new Employee(104, "Ram", 03));
		empMap.put(1, new Employee(102, "John", 02));
		empMap.put(3, new Employee(105, "Smith", 02));
		empMap.put(4, new Employee(103, "Mark", 01));

		for(Map.Entry<Integer, Employee> entry: empMap.entrySet()){
			System.out.println("Key: "+entry.getKey()+" Emp: "+entry.getValue());
		}
	}
}
