package homeworkDay4;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Ahmetcan", "Ýlyas", LocalDate.of(1999, 2, 23), "1234567890"));
	}

}
