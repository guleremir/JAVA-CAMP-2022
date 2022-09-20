
public class Main {

	public static void main(String[] args) {

		int number = 0;
		int total = 0;
		
//		if(number == 0) {
//			System.out.println("Gecersiz Sayi!");
//			return;
//		}

		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		if(number == total) {
			System.out.println("Mukkemmel Sayidir.");
		} else {
			System.out.println("Mukkemmel Sayi Degildir.");
		}

	}

}
