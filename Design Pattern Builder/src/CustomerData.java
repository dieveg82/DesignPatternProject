import java.time.LocalDate;

public class CustomerData {

	private String name;
	private String lastName;
	private LocalDate birthday;
	private String taxIdCode;
	private String street;
	private String houseNumber;
	private String city;
	private String province;
	private String country;
	private String phone;
	
	// da notare che il costruttore è private quindi non può essere
	// chiamato dall'esterno
	private CustomerData () {}
	
	// creazione di una classe inner per l'implementazione 
	public static class Builder  {
		private String name;
		private String lastName;
		private LocalDate birthday;
		private String taxIdCode;
		private String street;
		private String houseNumber;
		private String city;
		private String province;
		private String country;
		private String phone;
		
		public Builder (String name , String lastName) {
			this.name = name;
			this.lastName = lastName;
			this.birthday = null;
			this.taxIdCode = "";
			this.street = "";
			this.houseNumber = "";
			this.city = "";
			this.province = "";
			this.country = "";
			this.phone = "";
		}
		
		public CustomerData build () {
			CustomerData object = new CustomerData ();
			object.name = this.name;
			object.lastName = this.lastName ;
			object.birthday = this.birthday;
			object.taxIdCode = this.taxIdCode;
			object.street = this.street;
			object.houseNumber = this.houseNumber;
			object.city = this.city;
			object.province = this.province;
			object.country = this.country;
			object.phone = this.phone;
			
			return object;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder setBirthday(LocalDate localDate) {
			this.birthday = localDate;
			return this;
		}

		public Builder setTaxIdCode(String taxIdCode) {
			this.taxIdCode = taxIdCode;
			return this;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
			return this;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public Builder setProvince(String province) {
			this.province = province;
			return this;
		}

		public Builder setCountry(String country) {
			this.country = country;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		
		
	}



	
	
}
