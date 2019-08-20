
public class Address {
	private String city, country;

	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}

	public void display() {
		System.out.println(city + "," + country);
	}

}

