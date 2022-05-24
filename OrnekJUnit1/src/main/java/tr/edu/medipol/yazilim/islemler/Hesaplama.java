package tr.edu.medipol.yazilim.islemler;

public class Hesaplama {

	
	static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	static int topla(int ... sayilar) {
		int toplamSonuc = 0;
		for (int sayi : sayilar) {
			toplamSonuc += sayi;
		}
		return toplamSonuc;
	}
	
	
	public static void main(String[] args) {
		
		int sonuc = topla(53,1453);
		
		// System.out.printf("%d + %d = %d %n",53,1453,sonuc);
		
		System.out.println("53 + 1453 = " + sonuc);
		
	}

}
