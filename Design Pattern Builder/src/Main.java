import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		CustomerData firstCustomer = new CustomerData.Builder("Diego", "Cappai")
				.setBirthday(LocalDate.of(1982, 3, 12))
				.setTaxIdCode("CPPDGI82C12B354Z")
				.build();
		
	}

}
