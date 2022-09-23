package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		engin.customeName = "engin";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "123456789";
		hepsiBurada.customeName = "hepsiburada";

		SendicaCustomer abc = new SendicaCustomer();
		abc.customerNumber = "12345678987654321";
		abc.customeName = "Selam";

		CustomerManager customerManager = new CustomerManager();

		customerManager.add(engin);
		customerManager.list(hepsiBurada);

		Customer[] customers = { engin, abc, hepsiBurada };

		customerManager.addMultiple(customers);

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "121";
		System.out.println(individualCustomer.customerNumber);
	}

}
