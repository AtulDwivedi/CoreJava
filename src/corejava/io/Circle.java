package corejava.io;

import java.io.Serializable;

public class Circle implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int radius;
	//private transient Thread t=new Thread(); //Composition
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public final int getRadius() {
		return radius;
	}

	public final void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
