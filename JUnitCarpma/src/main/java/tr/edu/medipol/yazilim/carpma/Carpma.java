package tr.edu.medipol.yazilim.carpma;

public class Carpma {

	static int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	static int carp(int ... sayilar) {
		int carpimSonuc = 0;
		for (int sayi : sayilar) {
			carpimSonuc *= sayi;
		}
		return carpimSonuc;
	}
	
	
	public static void main(String[] args) {
		
		int sonuc = carp(1453,53);
		
		
		
		System.out.println("1453 * 53 = " + sonuc);
		
	}

}
