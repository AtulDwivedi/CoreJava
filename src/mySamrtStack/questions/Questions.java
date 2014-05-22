package mySamrtStack.questions;

public class Questions implements Comparable<Questions> {
	
	private String ques;
	private int quesNo;
	private int rank;
	private int votes;
	
	
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public int getQuesNo() {
		return quesNo;
	}
	public void setQuesNo(int quesNo) {
		this.quesNo = quesNo;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getVote() {
		return votes;
	}
	public void setVote(int vote) {
		this.votes = vote;
	}
	
	
	public Questions() {
		this.ques="This is question number ";
		this.quesNo = (int)(Math.random()*100);
		this.rank = (int)(Math.random()*10);
		this.votes = (int) (Math.random()*1000);
	}
	
	
	@Override
	public int compareTo(Questions o) {
		// TODO Auto-generated method stub
		return this.quesNo - o.quesNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getQues()+this.getQuesNo()+" Rank: "+this.getRank()+" Votes: "+this.getVote()+"\n";
	}
	
	
	
}
