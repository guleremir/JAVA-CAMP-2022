
public class Main {

	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Sayi Asal Degildir.");
			return;
		}
		
		if(number < 1) {
			System.out.println("Gecersiz Sayi !!");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayi Asaldir.");
		} else {
			System.out.println("Sayi Asal Degildir.");
		}

	}

}
