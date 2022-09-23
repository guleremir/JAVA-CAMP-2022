
public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		// reference type
		CustomerManager customerManager2;
		customerManager2 = customerManager;
		customerManager.add();
		customerManager2.add();
		customerManager2.update();
		customerManager2.remove();
		
		
		//value type
		int sayi1 = 10; //30
		int sayi2 = 20; //10
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		//array is reference type
		int[] sayilar1 = new int[] {1,2,3,4,5};
		int[] sayilar2 = new int[] {10,20,30,40,50};  
		sayilar2 = sayilar1;
		sayilar1[0] = 100;
		System.out.println(sayilar2[0]);
		
	}

}
