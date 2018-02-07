package object.hashing;

public class Person implements Comparable<Person> {
	private String name;
	private Integer age;
	private double dbl;
	private Address address;
	public Person(String name, Integer age, double dbl, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.dbl = dbl;
		this.address = address;
	}
	
	public Person(String name, double dbl, Integer age, Address address) {
		super();
		this.name = name;
		this.dbl = dbl;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public double getDbl() {
		return dbl;
	}
	public void setDbl(double dbl) {
		this.dbl = dbl;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dbl=" + dbl + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		long temp;
		temp = Double.doubleToLongBits(dbl);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (Double.doubleToLongBits(dbl) != Double.doubleToLongBits(other.dbl))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
