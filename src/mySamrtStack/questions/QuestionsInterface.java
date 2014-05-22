package mySamrtStack.questions;

import java.util.Collection;

public interface QuestionsInterface {
	Collection<?> getQuestions();
	Collection<?> changeSorting(int choice);
}
