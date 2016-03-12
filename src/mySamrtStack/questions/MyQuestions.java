package mySamrtStack.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyQuestions implements QuestionsInterface {
	
	List<Questions> lst = new ArrayList<Questions>();
	
	@Override
	public Collection<?> getQuestions() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			lst.add(new Questions());
		}
		
		Collections.sort(lst);
		
		return lst;
	}

	@Override
	public Collection<?> changeSorting(int choice) {
		// TODO Auto-generated method stub
		Comparator<Questions> c=null;
		if(choice==1)
			c=new sortOnQuesRank();
		else if(choice==2)
			c=new sortOnQuesVotes();
		else
			;
		
		Collections.sort(lst, c);
		
		return lst;
	}

}
