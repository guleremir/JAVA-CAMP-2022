package classesWithAttributies;

public class ProductManager {
	public void add(Product product) {
		System.out.println("Urun eklendi : " + product.getName());
	}

	public void add2(int id, String name, String description, int stockAmount, double price) {
		System.out.println("Urun database'e kaydedildi");
	}
}
