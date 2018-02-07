package object.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Person> pl1 = new ArrayList<>();
		List<Person> pl2 = new ArrayList<>();

		pl1.add(new Person("Atul 1", new Integer(100), new Double(100.1), new Address("Street 1", new Integer(123))));
		pl1.add(new Person("Atul 2", new Integer(200), new Double(100.2), new Address("Street 2", new Integer(321))));

		pl2.add(new Person("Atul 2", new Integer(200), new Double(100.2), new Address("Street 2", new Integer(321))));
		pl2.add(new Person("Atul 1", new Double(100.1), new Integer(100), new Address("Street 1", new Integer(123))));

		Collections.sort(pl1);
		Collections.sort(pl2);

		System.out.println(pl1);
		System.out.println(pl2);

		System.out.println(checkHas(pl1, pl2));

	}

	public static boolean checkHas(Object o1, Object o2) {
		return Objects.hash(o1) == Objects.hash(o2);
	}

	public static List<Integer> getHashList(List<Person> persons) {
		List<Integer> hashList = new ArrayList<>();
		for (Person person : persons) {
			hashList.add(Objects.hash(person));
		}
		Collections.sort(hashList);
		System.out.println(hashList);
		return hashList;
	}
}
