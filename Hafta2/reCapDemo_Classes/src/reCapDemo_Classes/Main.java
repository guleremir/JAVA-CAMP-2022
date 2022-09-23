package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(3, 4);
		System.out.println(sonuc);
		dortIslem.bol(3, 4);
		dortIslem.carp(20, 3);
	}

}
