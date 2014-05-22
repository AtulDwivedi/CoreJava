package mySamrtStack.questions;

import java.util.Comparator;

public class sortOnQuesRank implements Comparator<Questions> {

	@Override
	public int compare(Questions o1, Questions o2) {
		// TODO Auto-generated method stub
		return o1.getRank() - o2.getRank();
	}

}
