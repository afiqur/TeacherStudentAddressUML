
public class Person {
	protected String name, phone;
	Address address;

	public Person(String name, String phone, Address address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public void display() {
		System.out.println(name + "," + phone);
		address.display();
	}

}

