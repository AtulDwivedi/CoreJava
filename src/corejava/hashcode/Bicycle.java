package corejava.hashcode;

public class Bicycle {

	public int speed;
	public int gear;
	
	public Bicycle(){
		super();
	}
	
	public Bicycle(int speed, int gear){
		this.speed = speed;
		this.gear = gear;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
}
