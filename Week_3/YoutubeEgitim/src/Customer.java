
public class Customer {
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı.");
	}

	public int Id;
	public String City;

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

}
