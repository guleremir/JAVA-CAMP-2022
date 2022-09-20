
public class Main {

	public static void main(String[] args) {
		
		int number1 = 30;
		int number2 = 140;
		int total1 = 0;
		int total2 = 0;
		
		for(int i = 1; i<number1; i++) {
			if(number1%i==0) {
				total1 = total1 +i;
			}
		}	
		for(int i = 1; i<number2; i++) {
			if(number2%i==0) {
				total2 = total2 +i;
			}
		}
		
		if(number1 == total2 && number2 == total1) {
			System.out.println("Arkadas Sayilar.");
		} else {
			System.out.println("Arkadas Sayi degildir.");
		}

	}

}
