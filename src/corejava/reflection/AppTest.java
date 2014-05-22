package corejava.reflection;

public class AppTest {
	 
		private int counter;
	 
		public void printIt(){
			System.out.println("printIt() no param");
		}
	 
		public void printItString(String temp){
			System.out.println("printIt() with param String : " + temp);
		}
	 
		public void printItInt(int temp){
			System.out.println("printIt() with param int : " + temp);
		}
	 
		private void setCounter(int counter){
			this.counter = counter;
			System.out.println("setCounter() set counter to : " + counter);
		}
	 
		public void printCounter(){
			System.out.println("printCounter() : " + this.counter);
		}
	}

