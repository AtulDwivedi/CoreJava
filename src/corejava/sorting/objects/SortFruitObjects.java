package corejava.sorting.objects;

import java.util.Arrays;

public class SortFruitObjects  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] fruits = new Fruit[6];
		
		Fruit fruit1 = new Fruit("Pine Apple", 10);
		Fruit fruit2 = new Fruit("Orange", 20);
		Fruit fruit3 = new Fruit("Apple", 60);
		Fruit fruit4 = new Fruit("Banana", 50);
		Fruit fruit5 = new Fruit("Mango", 30);
		Fruit fruit6 = new Fruit("Guava", 40);
		
		fruits[0]=fruit1;
		fruits[1]=fruit2;
		fruits[2]=fruit3;
		fruits[3]=fruit4;
		fruits[4]=fruit5;
		fruits[5]=fruit6;
		 
		//Sort Fruit array based on its “fruitName” property in ascending order.
		Arrays.sort(fruits);
		for (Fruit fruit : fruits) {
			System.out.print(fruit.getFruitName()+":"+fruit.getFruitQuantity()+" ");
		}
		
		System.out.println("");
		
		//Sort Fruit array based on its “quantity” property in ascending order.
		Arrays.sort(fruits, Fruit.fruitNameComparator);
		for (Fruit fruit : fruits) {
			System.out.print(fruit.getFruitName()+":"+fruit.getFruitQuantity()+" ");
		}

	}

}
