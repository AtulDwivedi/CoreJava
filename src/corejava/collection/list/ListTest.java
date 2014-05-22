package corejava.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = Logger.getLogger(ListTest.class);
		logger.info("---- List Adventure starts ----");
		
		List<Student> stdList = new ArrayList<Student>();
		
		stdList.add(new Student(1, "Z", "M"));
		stdList.add(new Student(2, "M", "A"));
		stdList.add(new Student(3, "A", "Z"));

		//Duplicate
		Student stdObj = new Student(3, "A", "Z");
		stdList.add(stdObj);
		
		//View all
		logger.info("View All: "+stdList);
		//logger.info("View All: "+stdList);
		
		//View particular
		int index = stdList.indexOf(stdObj);
		logger.info("View Particular:"+stdList.get(index)+" at index: "+index);
		
		//Find Particular
		int pos = Collections.binarySearch(stdList, stdObj);
		if (pos > -1) {
			logger.info("Find Particular: "+stdObj+" at Position: "+pos);
		} else {
			logger.info("Find Particular: Not found.");
		}
		
		//Modify
		stdList.set(index, new Student(4, "N", "B"));
		logger.info("Modified: "+stdList);

		//Remove
		stdList.remove(index);
		logger.info("After Removal: "+stdList);
		
		//Sort: Natural sort and Runtime sort
		int random = (int)(Math.random()*10);
		logger.info("Random Value: "+random);
		Comparator<Student> stdComp=null;
		if(random < 6){
			Collections.sort(stdList);
		}
		else {
			if (random < 8) {
				stdComp = new SortOnRollNo();
			} else {
				stdComp = new SortOnCourse();
			}
			
			Collections.sort(stdList,stdComp);
		}
		
		logger.info("Sorted Order: "+stdList);
	logger.info("---- List Adventure ends ----");		
	}
}
