package classesWithAttributies;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1,"Televizyon", "LG Televizyon", 1000, 5, "Siyah");
		Product product2 = new Product();
		product.setName("Koltuk Takimi");
		product2.setName("Laptop");
		product2.setRenk("Kirmizi");
		product2.setId(3765);
		System.out.println(product.getName());
		System.out.println(product2.getRenk());
		System.out.println(product2.getKod());

		ProductManager productManager = new ProductManager();
		productManager.add(product2);
		productManager.add2(1, "Televizyon", "Super Televizyon", 10, 12300);
	}

}
