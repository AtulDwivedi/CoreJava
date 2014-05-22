package mySamrtStack.questions;

import java.util.List;
import java.util.Scanner;

public class PresentationForQuestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		QuestionsInterface quesObj = QuestionFactory.fectoryMethod();
		List<Questions> lst = (List)quesObj.getQuestions();
		System.out.println(lst);
		
		askForChoice(quesObj, scn);
	}

	private static void askForChoice(QuestionsInterface quesObj, Scanner scn) {
		// TODO Auto-generated method stub
		System.out.println("1. Sort on Rank\n2. Sort on Votes\n0 Exit");
		int choice = scn.nextInt();
		if(choice==0)
			System.exit(0);
		else
			System.out.println(quesObj.changeSorting(choice));
		
		askForChoice(quesObj, scn);
		
	}

}
