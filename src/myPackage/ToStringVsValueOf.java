package myPackage;

import java.sql.Time;
import java.util.Date;

public class ToStringVsValueOf {

	/**
	 * @param args
	 */
	int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new ToStringVsValueOf();
		System.out.println(obj);
		//obj.toString();
		//System.out.println(String.valueOf(obj));
		//System.out.println(obj.hashCode());
		
		
		
		Object o = new Time(100);
		Date d = new Time(100);
		Time t = new Time(100);
		//obj.myMethod(o);
		System.out.println(d.toString());
		System.out.println(t.toString());

	}
	@Override
	public String toString(){
		return super.toString();
	}
	
	public void myMethod(Object o){
		System.out.println(o.toString());
	}
}
