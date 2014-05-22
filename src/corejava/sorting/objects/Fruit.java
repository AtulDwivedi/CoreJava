package corejava.sorting.objects;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
	private String fruitName;
	private int fruitQuantity;
	
	public Fruit(String fruitName, int fruitQuantity) {
		super();
		this.fruitName = fruitName;
		this.fruitQuantity = fruitQuantity;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getFruitQuantity() {
		return fruitQuantity;
	}
	public void setFruitQuantity(int fruitQuantity) {
		this.fruitQuantity = fruitQuantity;
	}
	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		
		//Ascending order
		return this.fruitQuantity - ((Fruit) o).getFruitQuantity();

		//Descending  order
		//return ((Fruit) o).getFruitQuantity() - this.fruitQuantity;

	}
	
	
	public static Comparator<Fruit> fruitNameComparator = new Comparator<Fruit>() {
	
	public int compare(Fruit fruit1, Fruit fruit2) {
	
	String fruitName1 = fruit1.getFruitName().toUpperCase();
	String fruitName2 = fruit2.getFruitName().toUpperCase();
/*	
		int fruitQuntity1 = fruit1.getFruitQuantity();
		int fruitQuntity2 = fruit2.getFruitQuantity();
		return fruitQuntity2 - fruitQuntity1;
	
*/		//ascending order
	return fruitName1.compareTo(fruitName2);
	
	//descending order
	//return fruitName2.compareTo(fruitName1);
	}
	
	};
}
