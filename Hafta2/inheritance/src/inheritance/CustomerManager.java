package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
		System.out.println(customer.customeName + " kaydedildi.");
		System.out.println();
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
	public void list(Customer customer) {
		System.out.println("Musteri Listelendi : " + customer.customeName);
	}
}
