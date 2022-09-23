package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		// OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		// ogretmenKrediManager.hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new TarimKrediManager()); // Dikkat!!
		krediUI.krediHesapla(new OgretmenKrediManager());
		krediUI.krediHesapla(new AskerKrediManager());

	}

}
