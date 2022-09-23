package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugun hava cok guzel";
		String newMesaj = mesaj.substring(0, 2);
		System.out.println(newMesaj);

		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayi = topla(12, 5);
		System.out.println(sayi);

		int toplam = topla2(2, 34, 4, 5);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Guncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	//variable arguments
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
